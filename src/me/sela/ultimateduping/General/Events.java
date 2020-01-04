package me.sela.ultimateduping.General;

import org.bukkit.Bukkit;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import static me.sela.ultimateduping.General.Main.guislotsult;

public class Events
  implements Listener
{

  public static void OpenDupeInventory(Player p) {

    if (p.hasPermission("ultimatedupe.use")) {
      Inventory inv = Bukkit.createInventory(null, 9, Main.guititle);

      Main.inventory.add(inv);
      p.openInventory(inv);
    } else {
      p.sendMessage(Main.permissionmsg);
    }


    if (p.hasPermission("ultimatedupe.slot.1")) {
      Inventory inv = Bukkit.createInventory(null, 18, Main.guititle);

      Main.inventory.add(inv);
      p.openInventory(inv);
    }

    if (p.hasPermission("ultimatedupe.slot.2")) {
      Inventory inv = Bukkit.createInventory(null, 27, Main.guititle);

      Main.inventory.add(inv);
      p.openInventory(inv);
    }
    if (p.hasPermission("ultimatedupe.slot.3")) {
      Inventory inv = Bukkit.createInventory(null, 36, Main.guititle);

      Main.inventory.add(inv);
      p.openInventory(inv);
    }
    if (p.hasPermission("ultimatedupe.slot.4")) {
      Inventory inv = Bukkit.createInventory(null, 45, Main.guititle);

      Main.inventory.add(inv);
      p.openInventory(inv);
    }

    if (p.hasPermission("ultimatedupe.slot.5")) {
      Inventory inv = Bukkit.createInventory(null, 54, Main.guititle);

      Main.inventory.add(inv);
      p.openInventory(inv);
    }

  }

  @EventHandler
  public void CloseInventory(InventoryCloseEvent e) {

    try {
      if (Main.inventory.contains(e.getInventory())) {
        Player p = (Player) e.getPlayer();

        for (int i = 0; i <= guislotsult - 1; i++)
          if (e.getInventory().getItem(i) != null) {
            ItemStack item = e.getInventory().getItem(i);
            if (p.getInventory().firstEmpty() != -1) {
              p.getInventory().addItem(new ItemStack[]{item});
            }
            Main.inventory.remove(e.getInventory());
          }
      }

    } catch (Exception event) {
      return;
    }
  }
}