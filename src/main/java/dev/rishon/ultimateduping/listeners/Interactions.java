package dev.rishon.ultimateduping.listeners;

import dev.rishon.ultimateduping.UltimateDuping;
import dev.rishon.ultimateduping.data.CacheData;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class Interactions implements Listener {

    private final UltimateDuping plugin;

    public Interactions(UltimateDuping plugin) {
        this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.MONITOR)
    private void onInvClose(InventoryCloseEvent event) {
        Player player = (Player) event.getPlayer();
        CacheData cacheData = plugin.getCacheData();

        if (!cacheData.doesExist(player.getUniqueId())) return;

        int maxSlots = plugin.getConfigManager().getMaxSlots();
        Inventory inventory = event.getInventory();

        if (maxSlots > inventory.getSize()) maxSlots = inventory.getSize();

        for (int i = 0; i <= maxSlots - 1; i++) {
            ItemStack item = inventory.getItem(i);
            if (item != null && inventory.firstEmpty() != -1) player.getInventory().addItem(item);
        }

        cacheData.unloadPlayer(player.getUniqueId());
    }
}
