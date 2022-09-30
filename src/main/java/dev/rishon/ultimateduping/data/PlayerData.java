package dev.rishon.ultimateduping.data;

import lombok.Data;
import org.bukkit.inventory.Inventory;

import java.util.UUID;

@Data
public class PlayerData {

    private UUID uuid;
    private Inventory inventory;

    public PlayerData(UUID uuid) {
        this.uuid = uuid;
    }
}
