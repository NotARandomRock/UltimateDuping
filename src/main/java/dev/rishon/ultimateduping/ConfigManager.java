package dev.rishon.ultimateduping;

import lombok.Data;
import org.bukkit.configuration.file.FileConfiguration;

@Data
public class ConfigManager {

    private final UltimateDuping plugin;

    // Messages
    private String noPermission;
    // GUI
    private String guiTitle;
    private int maxSlots;

    public ConfigManager(UltimateDuping plugin) {
        this.plugin = plugin;
    }

    public void loadConfig() {
        FileConfiguration config = plugin.getConfig();
        config.options().copyDefaults(true);
        plugin.saveDefaultConfig();

        setNoPermission(config.getString("Messages.No-Permission"));
        setMaxSlots(config.getInt("Dupe-GUI.Max-Slots"));
        setGuiTitle(config.getString("Dupe-GUI.Title"));
    }

}
