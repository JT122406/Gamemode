package gm.gm

import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin

class Gm : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("Loaded Gamemode commands")
        getCommand("gmc")!!.setExecutor(gmc())
        getCommand("gmsp")!!.setExecutor(gmsp())
        getCommand("gms")!!.setExecutor(gms())
        getCommand("gma")!!.setExecutor(gma())
    }

    override fun onDisable() {
        // Plugin shutdown logic
        Bukkit.getLogger().info("Disabled Gamemode")
    }
}