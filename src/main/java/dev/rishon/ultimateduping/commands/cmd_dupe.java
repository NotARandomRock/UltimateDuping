package dev.rishon.ultimateduping.commands;

import dev.rishon.ultimateduping.UltimateDuping;
import dev.rishon.ultimateduping.data.CacheData;
import dev.rishon.ultimateduping.utilities.ColorUtil;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class cmd_dupe implements CommandExecutor {

    private final UltimateDuping plugin;

    public cmd_dupe(UltimateDuping plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage("This command can only be executed by a player.");
            return false;
        }

        Player player = (Player) sender;

        if (!player.hasPermission("ultimatedupe.use")) {
            player.sendMessage(ColorUtil.color(plugin.getConfig().getString("Messages.No-Permission")));
            return false;
        }

        open(player);
        return false;
    }


    private void open(Player player) {
        String title = ColorUtil.color(plugin.getConfig().getString("Dupe-GUI.Title"));
        CacheData cacheData = plugin.getCacheData();

        Inventory inventory;
        int size = 9;

        if (player.hasPermission("ultimatedupe.slot.5")) {
            size = 54;
        } else if (player.hasPermission("ultimatedupe.slot.4")) {
            size = 45;
        } else if (player.hasPermission("ultimatedupe.slot.3")) {
            size = 36;
        } else if (player.hasPermission("ultimatedupe.slot.2")) {
            size = 27;
        } else if (player.hasPermission("ultimatedupe.slot.1")) {
            size = 18;
        }

        inventory = Bukkit.createInventory(null, size, title);

        cacheData.loadPlayer(player.getUniqueId(), inventory);
        player.openInventory(cacheData.getInventory(player.getUniqueId()));
    }
}
