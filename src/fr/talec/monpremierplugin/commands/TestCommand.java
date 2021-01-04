package fr.talec.monpremierplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.WeatherType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.WeatherType;
public class TestCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        // Player player = (Player) sender;
        if(sender instanceof Player) {
            Player player = (Player) sender;

            if (cmd.getName().equalsIgnoreCase("gm")) {
                if (!player.isOp()) {
                    player.sendMessage("§cVous n'êtes pas");
                    return false;
                }
                if (args.length != 1) {
                    player.sendMessage("§cUsage: /gm 0/1/2/3");
                    return false;
                }

                else {
                    player.sendMessage("C'est ok");
                    player.setGameMode(GameMode.SURVIVAL);
                }
            }
            if (cmd.getName().equalsIgnoreCase("test")){
                if (args.length != 1) {
                    player.sendMessage("§cUsage: /test <Votre message>");
                    return false;
                }
                else {
                    player.sendMessage("Aujourd'hui le temps est ");
                    return false;
                }
            }
            if (cmd.getName().equalsIgnoreCase("player")) {

                player.sendMessage("Nombre de joueur connecté:" + Bukkit.getServer().getOnlinePlayers());
                return false;

            }
        }
        return true;
    }
}