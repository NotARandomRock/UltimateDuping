package me.sela.ultimateduping.General;

import java.util.HashSet;

import me.sela.ultimateduping.Commands.Dupe;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
  public static FileConfiguration config;
  public static Main  plugin;
  public static HashSet<Inventory> inventory;
  public static int guislotsult;
  public static String guititle;
  public static String permissionmsg;

  public void onEnable()
  {

    getLogger().info("Plugin Enabled | Plugin Developed by Rishon (SELA) ");

    getCommand("dupe").setExecutor(new Dupe());
    Bukkit.getPluginManager().registerEvents(new Events(), this);
    saveDefaultConfig();
    config = getConfig();
    plugin = this;
    inventory = new HashSet();
    guislotsult = 54;
    guititle = config.getString("Menu title").replace("&", "§");
    permissionmsg = config.getString("NoPerm").replace("&", "§");
    runAutoAddItems();

  }

  private void runAutoAddItems() {

    Bukkit.getScheduler().runTaskTimerAsynchronously(this, new Runnable() {
              @Override
              public void run() {
                try {
                  for (Inventory inv : Main.inventory)
                    for (int i = 0; i <= Main.guislotsult - 1; i++)
                      if (inv.getItem(i) != null) {
                        ItemStack stack = inv.getItem(i);
                          stack.setAmount(stack.getAmount() + 1);

                      }
                } catch (Exception e) {
                  return;
                }
              }
            }

            , 0L, 20);
  }
}
