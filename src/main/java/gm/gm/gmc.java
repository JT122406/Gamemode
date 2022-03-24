package gm.gm;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class gmc implements CommandExecutor {

    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player && sender.hasPermission("gm.gmc")) {
            if (command.getName().equalsIgnoreCase("gmc")){
                ((Player) sender).setGameMode(GameMode.CREATIVE);
                sender.sendMessage("Gamemode Updated to Creative");
            }
        }
        else
        {
            for (Player p1: Bukkit.getOnlinePlayers()) {
                if (p1.getName().equalsIgnoreCase(args[0])){
                    p1.setGameMode(GameMode.CREATIVE);
                    p1.sendMessage("Gamemode changed to Creative");
                    sender.sendMessage("Updated " + args[0] + " Gamemode to Creative");
                }
            }
        }
        return true;

    }
}
