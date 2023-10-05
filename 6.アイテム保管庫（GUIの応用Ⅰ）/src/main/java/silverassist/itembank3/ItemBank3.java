package silverassist.itembank3;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class ItemBank3 extends JavaPlugin {
    private static JavaPlugin plugin = null;
    private static FileConfiguration yml = null;

    @Override
    public void onEnable() {
        plugin = this;

        this.saveDefaultConfig();
        yml = plugin.getConfig();

        new Command();
        // Plugin startup logic
    }

    public static JavaPlugin getInstance(){return plugin;}
    public static FileConfiguration getYml(){return yml;}

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
