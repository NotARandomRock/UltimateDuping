package me.sela.ultimatedupe;

import java.util.HashSet;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class Events
  implements Listener
{
  public static void OpenDupeInventory(Player p)
  {
    Inventory inv = Bukkit.createInventory(null, UltimateDupe.guislotsult, UltimateDupe.guititle);
    inv.setItem(53, new ItemStack(Material.BARRIER, 1, (short)15));
    inv.setItem(52, new ItemStack(Material.BARRIER, 1, (short)15));
    inv.setItem(51, new ItemStack(Material.BARRIER, 1, (short)15));
    inv.setItem(50, new ItemStack(Material.BARRIER, 1, (short)15));
    inv.setItem(49, new ItemStack(Material.BARRIER, 1, (short)15));
    inv.setItem(48, new ItemStack(Material.BARRIER, 1, (short)15));
    inv.setItem(47, new ItemStack(Material.BARRIER, 1, (short)15));
    inv.setItem(46, new ItemStack(Material.BARRIER, 1, (short)15));
    inv.setItem(45, new ItemStack(Material.BARRIER, 1, (short)15));
    inv.setItem(44, new ItemStack(Material.BARRIER, 1, (short)15));
    inv.setItem(43, new ItemStack(Material.BARRIER, 1, (short)15));
    inv.setItem(42, new ItemStack(Material.BARRIER, 1, (short)15));
    inv.setItem(41, new ItemStack(Material.BARRIER, 1, (short)15));
    inv.setItem(40, new ItemStack(Material.BARRIER, 1, (short)15));
    inv.setItem(39, new ItemStack(Material.BARRIER, 1, (short)15));
    inv.setItem(38, new ItemStack(Material.BARRIER, 1, (short)15));
    inv.setItem(37, new ItemStack(Material.BARRIER, 1, (short)15));
    inv.setItem(36, new ItemStack(Material.BARRIER, 1, (short)15));
    inv.setItem(35, new ItemStack(Material.BARRIER, 1, (short)15));
    inv.setItem(34, new ItemStack(Material.BARRIER, 1, (short)15));
    inv.setItem(33, new ItemStack(Material.BARRIER, 1, (short)15));
    inv.setItem(32, new ItemStack(Material.BARRIER, 1, (short)15));
    inv.setItem(31, new ItemStack(Material.BARRIER, 1, (short)15));
    inv.setItem(31, new ItemStack(Material.BARRIER, 1, (short)15));
    inv.setItem(31, new ItemStack(Material.BARRIER, 1, (short)15));
    inv.setItem(30, new ItemStack(Material.BARRIER, 1, (short)15));
    inv.setItem(29, new ItemStack(Material.BARRIER, 1, (short)15));
    inv.setItem(28, new ItemStack(Material.BARRIER, 1, (short)15));
    inv.setItem(27, new ItemStack(Material.BARRIER, 1, (short)15));
    inv.setItem(26, new ItemStack(Material.BARRIER, 1, (short)15));
    inv.setItem(25, new ItemStack(Material.BARRIER, 1, (short)15));
    inv.setItem(24, new ItemStack(Material.BARRIER, 1, (short)15));
    inv.setItem(23, new ItemStack(Material.BARRIER, 1, (short)15));
    inv.setItem(22, new ItemStack(Material.BARRIER, 1, (short)15));
    inv.setItem(21, new ItemStack(Material.BARRIER, 1, (short)15));
    inv.setItem(20, new ItemStack(Material.BARRIER, 1, (short)15));
    inv.setItem(19, new ItemStack(Material.BARRIER, 1, (short)15));
    inv.setItem(18, new ItemStack(Material.BARRIER, 1, (short)15));
    inv.setItem(17, new ItemStack(Material.BARRIER, 1, (short)15));
    inv.setItem(16, new ItemStack(Material.BARRIER, 1, (short)15));
    inv.setItem(15, new ItemStack(Material.BARRIER, 1, (short)15));
    inv.setItem(14, new ItemStack(Material.BARRIER, 1, (short)15));
    inv.setItem(13, new ItemStack(Material.BARRIER, 1, (short)15));
    inv.setItem(12, new ItemStack(Material.BARRIER, 1, (short)15));
    inv.setItem(11, new ItemStack(Material.BARRIER, 1, (short)15));
    inv.setItem(10, new ItemStack(Material.BARRIER, 1, (short)15));
    inv.setItem(9, new ItemStack(Material.BARRIER, 1, (short)15));

    if (p.hasPermission("silverdupe.slot.1")) {
      inv.setItem(9, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(10, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(11, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(12, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(13, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(14, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(15, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(16, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(17, new ItemStack(Material.AIR, 1, (short)15));
    }

    if (p.hasPermission("silverdupe.slot.2")) {
      inv.setItem(9, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(10, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(11, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(12, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(13, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(14, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(15, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(16, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(17, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(18, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(19, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(20, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(21, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(22, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(23, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(24, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(25, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(26, new ItemStack(Material.AIR, 1, (short)15));
    }

    if (p.hasPermission("silverdupe.slot.3")) {
      inv.setItem(9, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(10, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(11, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(12, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(13, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(14, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(15, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(16, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(17, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(18, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(19, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(20, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(21, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(22, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(23, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(24, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(25, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(26, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(27, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(28, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(29, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(30, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(31, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(32, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(33, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(34, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(35, new ItemStack(Material.AIR, 1, (short)15));
    }

    if (p.hasPermission("silverdupe.slot.4")) {
      inv.setItem(9, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(10, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(11, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(12, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(13, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(14, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(15, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(16, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(17, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(18, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(19, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(20, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(21, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(22, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(23, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(24, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(25, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(26, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(27, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(28, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(29, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(30, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(31, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(32, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(33, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(34, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(35, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(36, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(37, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(38, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(39, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(40, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(41, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(42, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(43, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(44, new ItemStack(Material.AIR, 1, (short)15));
    }

    if (p.hasPermission("silverdupe.slot.5")) {
      inv.setItem(9, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(10, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(11, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(12, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(13, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(14, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(15, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(16, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(17, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(18, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(19, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(20, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(21, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(22, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(23, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(24, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(25, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(26, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(27, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(28, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(29, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(30, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(31, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(32, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(33, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(34, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(35, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(36, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(37, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(38, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(39, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(40, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(41, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(42, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(43, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(44, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(45, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(46, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(47, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(48, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(49, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(50, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(51, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(52, new ItemStack(Material.AIR, 1, (short)15));
      inv.setItem(53, new ItemStack(Material.AIR, 1, (short)15));
    }

    UltimateDupe.inventory.add(inv);
    p.openInventory(inv);
  }

  @EventHandler
  public void InventoryClick(InventoryClickEvent event)
  {
    Player player = (Player)event.getWhoClicked();

    ItemStack clicked = event.getCurrentItem();
    Inventory inventory = event.getInventory();
    if (clicked.getType() == Material.BARRIER)
      event.setCancelled(true);
  }

  @EventHandler
  public void CloseInventory(InventoryCloseEvent e)
  {
    if (UltimateDupe.inventory.contains(e.getInventory()))
    {
      Player p = (Player)e.getPlayer();

      boolean isonground = false;
      for (int i = 0; i <= UltimateDupe.guislotsult - 1; i++)
        if (e.getInventory().getItem(i) != null)
        {
          ItemStack item = e.getInventory().getItem(i);
          if (p.getInventory().firstEmpty() != -1)
          {
            p.getInventory().addItem(new ItemStack[] { item });
          }
          p.getInventory().removeItem(new ItemStack[] { new ItemStack(Material.BARRIER, 54) });
          UltimateDupe.inventory.remove(e.getInventory());
        }
    }
  }
}