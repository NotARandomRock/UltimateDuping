package me.sela.ultimateduping.Commands;

import me.sela.ultimateduping.General.Events;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Dupe
  implements CommandExecutor
{
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {
    if (!(sender instanceof Player))
    {
      sender.sendMessage("Only players can execute this command.");
      return true;
    }
    Player p = (Player)sender;
    Events.OpenDupeInventory(p);

    return false;
  }
}