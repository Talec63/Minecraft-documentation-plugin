package fr.talec.monpremierplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SpawnCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            Location location = new Location(player.getWorld(), -740.53, 4.0, -220.653, -0.8f, 2.4f);
            player.sendMessage(ChatColor.RED + "Vous etes au spawn");
            player.teleport(location);
        }
        return false;
    }
}
