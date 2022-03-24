package gm.gm;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class gma implements CommandExecutor {

    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player && sender.hasPermission("gm.gma")) {
            if (command.getName().equalsIgnoreCase("gma")) {
                ((Player) sender).setGameMode(GameMode.ADVENTURE);
                sender.sendMessage("Gamemode Updated to Adventure");
            }
        }
        else
        {
            for (Player p1: Bukkit.getOnlinePlayers()) {
                if (p1.getName().equalsIgnoreCase(args[0])){
                    p1.setGameMode(GameMode.ADVENTURE);
                    p1.sendMessage("Gamemode changed to Adventure");
                    sender.sendMessage("Updated " + args[0] + " Gamemode to Adventure");
                }
            }
        }
        return true;
    }
}
