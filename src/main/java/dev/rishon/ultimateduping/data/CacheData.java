package dev.rishon.ultimateduping.data;

import dev.rishon.ultimateduping.UltimateDuping;
import lombok.Data;
import org.bukkit.inventory.Inventory;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@Data
public class CacheData {

    public UltimateDuping plugin;
    public Map<UUID, Inventory> inventories;

    public CacheData(UltimateDuping plugin) {
        this.plugin = plugin;
        this.inventories = new ConcurrentHashMap<>();
    }

    public void loadPlayer(UUID uuid, Inventory inventory) {
        inventories.put(uuid, inventory);
    }

    public Inventory getInventory(UUID uuid) {
        return inventories.get(uuid);
    }

    public void unloadPlayer(UUID uuid) {
        inventories.remove(uuid);
    }

    public boolean doesExist(UUID uuid) {
        return inventories.containsKey(uuid);
    }

}
