package dev.rishon.ultimateduping;

import dev.rishon.ultimateduping.commands.cmd_dupe;
import dev.rishon.ultimateduping.data.CacheData;
import dev.rishon.ultimateduping.data.PlayerData;
import dev.rishon.ultimateduping.listeners.Connections;
import dev.rishon.ultimateduping.listeners.Interactions;
import lombok.Getter;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

public final class UltimateDuping extends JavaPlugin {

    // Config
    public FileConfiguration config;
    @Getter
    public ConfigManager configManager;
    // Data
    @Getter
    public PlayerData playerData;
    @Getter
    public CacheData cacheData;

    @Override
    public void onEnable() {
        this.getLogger().info("Loading " + this.getDescription().getName());
        try {
            // Load config
            this.config = this.getConfig();
            this.configManager = new ConfigManager(this);
            this.configManager.loadConfig();

            // Register data
            this.cacheData = new CacheData(this);

            registerCommands();
            registerListeners();
            scheduler();
        } catch (Exception e) {
            this.getLogger().warning("Failed to enable " + this.getDescription().getName() + " Error Message: " + e.getMessage() + " | disabling plugin...");
            this.getServer().getPluginManager().disablePlugin(this);
        }
    }

    @Override
    public void onDisable() {
        this.getCacheData().getInventories().clear();
        this.getLogger().info("Disabled " + this.getDescription().getName());
    }


    private void registerCommands() {
        String cmd = getConfig().getString("Command");
        try {
            if (cmd == null) throw new Exception("Couldn't get the command from config.yml");
            this.getCommand(cmd).setExecutor(new cmd_dupe(this));
        } catch (Exception e) {
            this.getLogger().warning("Error while attempting to register custom command... Registering default command instead!");
            this.getCommand("dupe").setExecutor(new cmd_dupe(this));
        }
    }

    private void registerListeners() {
        PluginManager manager = this.getServer().getPluginManager();
        manager.registerEvents(new Interactions(this), this);
        manager.registerEvents(new Connections(this.getCacheData()), this);
    }

    private void scheduler() {
        int slots = getConfigManager().getMaxSlots();
        new BukkitRunnable() {
            @Override
            public void run() {
                for (Inventory inventory : getCacheData().getInventories().values()) {
                    if (inventory == null) continue;
                    int maxSlots = Math.min(slots, inventory.getSize());
                    for (int i = 0; i <= maxSlots - 1; i++) {
                        ItemStack item = inventory.getItem(i);
                        if (item != null) item.setAmount(item.getAmount() + 1);
                    }
                }
            }
        }.runTaskTimerAsynchronously(this, 0, 20);
    }
}
