package me.sela.ultimatedupe;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.PluginCommand;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitScheduler;

public class UltimateDupe extends JavaPlugin
{
  public static FileConfiguration config;
  public static UltimateDupe plugin;
  public static HashSet<Inventory> inventory;
  public static int guislotsult;
  public static int dupetick;
  public static String guititle;
  public static String permissionmsg;
  public static String grounditems;
  private List blacklist;

  public void onEnable()
  {
	getCommand("dupe").setExecutor(new Commands());
    Bukkit.getPluginManager().registerEvents(new Events(), this);
    saveDefaultConfig();
    config = getConfig();
    this.blacklist = config.getStringList("Item-Black-List");
    plugin = this;
    inventory = new HashSet();
    guislotsult = config.getInt("GuiSlotsUltIGNORE");
    dupetick = config.getInt("DupeTick");
    guititle = config.getString("GuiTitle").replace("&", "§");
    runAutoAddItems();

    getLogger().info("Plugin Enabled | Plugin Developed by SELA ");
  }

  private void runAutoAddItems()
  {
    Bukkit.getScheduler().runTaskTimerAsynchronously(this, new Runnable()
    {
      public void run()
      {
          for (Inventory inv : UltimateDupe.inventory)
            for (int i = 0; i <= UltimateDupe.guislotsult - 1; i++)
              if (inv.getItem(i) != null)
              {
                ItemStack stack = inv.getItem(i);
                if (!UltimateDupe.this.blacklist.contains(stack.getType().toString()))
                {
                  stack.setAmount(stack.getAmount() + 1);
                }
              }
        }
      }
      , 0L, dupetick);
    }
}
