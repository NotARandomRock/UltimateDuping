package net.rishon.codes.utilities;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ColorUtil {

    public static final Pattern pattern = Pattern.compile("#[a-fA-F0-9]{6}");

    public static String serialize(String msg) {

        if (Integer.parseInt(Bukkit.getVersion()) > 1.16) {
            Matcher match = pattern.matcher(msg);
            while (match.find()) {
                String color = msg.substring(match.start(), match.end());
                msg = msg.replace(color, ChatColor.valueOf(color) + "");
                match = pattern.matcher(msg);
            }
        }
        return ChatColor.translateAlternateColorCodes('&', msg);
    }

}
