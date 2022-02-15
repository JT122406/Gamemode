package gm.gm;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.plugin.java.JavaPlugin;

import java.awt.print.Paper;

public final class Gm extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("Loaded Gamemode commands");
        getCommand("gmc").setExecutor(new gmc());
        getCommand("gmsp").setExecutor(new gmsp());
        getCommand("gms").setExecutor(new gms());
        getCommand("gma").setExecutor(new gma());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getLogger().info("Disabled Gamemode");
    }
}
