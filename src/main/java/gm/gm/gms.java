package gm.gm;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class gms implements CommandExecutor {

    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player && sender.hasPermission("gm.gms")) {
            if (command.getName().equalsIgnoreCase("gms")){
                ((Player) sender).setGameMode(GameMode.SURVIVAL);
                sender.sendMessage("Gamemode Updated to Survival");
            }
        }
        else
        {
            for (Player p1: Bukkit.getOnlinePlayers()) {
                if (p1.getName().equalsIgnoreCase(args[0])){
                    p1.setGameMode(GameMode.SURVIVAL);
                    p1.sendMessage("Gamemode changed to Survival");
                    sender.sendMessage("Updated " + args[0] + " Gamemode to Survival");
                }
            }
        }
        return true;
    }
}
