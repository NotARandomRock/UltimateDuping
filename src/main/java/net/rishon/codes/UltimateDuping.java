package net.rishon.codes;

import net.rishon.codes.commands.cmd_dupe;
import net.rishon.codes.listeners.Interactions;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.HashSet;
import java.util.logging.Level;

public final class UltimateDuping extends JavaPlugin {

    // Plugin Instance
    private static UltimateDuping instance;

    public static UltimateDuping getInstance() {
        return instance;
    }

    // Configuration
    public FileConfiguration config;

    // Temp_Data
    public HashSet<Inventory> p_inventory;

    @Override
    public void onEnable() {
        this.getLogger().log(Level.INFO, "Loading %s", this.getDescription().getName());
        try {
            instance = this;

            // Loading config.yml
            config = getConfig();
            config.options().copyDefaults(true);
            saveDefaultConfig();

            registerCommands();
            registerListeners();
            scheduler();
        } catch (Exception e) {
            this.getLogger().log(Level.WARNING, "Failed to enable " + this.getDescription().getName() + " Error Message: " + e.getMessage() + " | disabling plugin...");
            Bukkit.getPluginManager().disablePlugin(this);
        }
    }

    @Override
    public void onDisable() {
        this.getLogger().log(Level.INFO, "Disabling %s", this.getDescription().getName());
        try {
            instance = null;
        } catch (Exception e) {
            this.getLogger().log(Level.WARNING, "Failed to properly disable " + this.getDescription().getName() + " Error Message: " + e.getMessage() + " | disabling plugin...");
        }
    }


    private void registerCommands() {
        try {
            this.getCommand(getConfig().getString("Command")).setExecutor(new cmd_dupe());
        } catch (Exception e) {
            this.getLogger().log(Level.WARNING, "Error while attempting to register custom command... Registering default command instead!");
            this.getCommand("dupe").setExecutor(new cmd_dupe());
        }
    }

    private void registerListeners() {
        Bukkit.getPluginManager().registerEvents(new Interactions(), this);
    }

    private void scheduler() {
        int slots = getConfig().getInt("Dupe-GUI.Slots");
        new BukkitRunnable() {
            @Override
            public void run() {
                try {
                    for (Inventory inventory : p_inventory)
                        for (int i = 0; i <= slots - 1; i++)
                            if (inventory.getItem(i) != null) {
                                ItemStack stack = inventory.getItem(i);
                                stack.setAmount(stack.getAmount() + 1);
                            }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }.runTaskTimerAsynchronously(this, 0, 20);

    }
}
