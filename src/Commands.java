package me.sela.ultimatedupe;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands
  implements CommandExecutor
{
  public boolean onCommand(CommandSender sender, Command cmd, String lebal, String[] args)
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