package net.rishon.codes.commands;

import net.rishon.codes.UltimateDuping;
import net.rishon.codes.utilities.ColorUtil;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class cmd_dupe implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage("This command can only be executed by a player.");
            return false;
        }

        Player player = (Player) sender;

        open(player);

        return false;
    }


    private void open(Player player) {

        FileConfiguration config = UltimateDuping.getInstance().getConfig();
        String title = ColorUtil.serialize(config.getString("Dupe-GUI.Title"));
        int size = 9;

        Inventory inventory = Bukkit.createInventory(null, 9, title);

        try {

            if (player.hasPermission("ultimatedupe.use")) {
                UltimateDuping.getInstance().p_inventory.add(inventory);
            } else if (player.hasPermission("ultimatedupe.slot.1")) {
                UltimateDuping.getInstance().p_inventory.add(inventory);
                size = 18;
            } else if (player.hasPermission("ultimatedupe.slot.2")) {
                UltimateDuping.getInstance().p_inventory.add(inventory);
                size = 27;
            } else if (player.hasPermission("ultimatedupe.slot.3")) {
                UltimateDuping.getInstance().p_inventory.add(inventory);
                size = 36;
            } else if (player.hasPermission("ultimatedupe.slot.4")) {
                UltimateDuping.getInstance().p_inventory.add(inventory);
                size = 45;
            } else if (player.hasPermission("ultimatedupe.slot.5")) {
                UltimateDuping.getInstance().p_inventory.add(inventory);
                size = 54;
            }

            inventory = Bukkit.createInventory(null, size, title);

        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } finally {
            player.openInventory(inventory);
        }
    }
}
