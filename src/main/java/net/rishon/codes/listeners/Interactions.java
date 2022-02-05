package net.rishon.codes.listeners;

import net.rishon.codes.UltimateDuping;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.ItemStack;

public class Interactions implements Listener {

    @EventHandler
    public void onInvClose(InventoryCloseEvent event) {

        Player player = (Player) event.getPlayer();
        if (UltimateDuping.getInstance().p_inventory.contains(player.getInventory())) {
            for (int i = 0; i <= UltimateDuping.getInstance().getConfig().getInt("Dupe-GUI.Slots") - 1; i++) {
                if (event.getInventory().getItem(i) != null) {
                    ItemStack item = event.getInventory().getItem(i);
                    if (player.getInventory().firstEmpty() != -1) {
                        player.getInventory().addItem(item);
                    }
                }
            }
            UltimateDuping.getInstance().p_inventory.remove(player.getInventory());
        }
    }
}
