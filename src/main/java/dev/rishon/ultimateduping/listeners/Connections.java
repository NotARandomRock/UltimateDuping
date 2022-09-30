package dev.rishon.ultimateduping.listeners;

import dev.rishon.ultimateduping.data.CacheData;
import lombok.Getter;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class Connections implements Listener {

    @Getter
    public CacheData cacheData;

    public Connections(CacheData cacheData) {
        this.cacheData = cacheData;
    }

    // Disconnect event in-case the player disconnects while in the dupe GUI and data isn't getting removed.
    @EventHandler(priority = EventPriority.MONITOR)
    private void onDisconnect(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        this.getCacheData().unloadPlayer(player.getUniqueId());
    }

}
