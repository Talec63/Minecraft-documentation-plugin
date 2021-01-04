package fr.talec.monpremierplugin;

import fr.talec.monpremierplugin.commands.SpawnCommand;
import fr.talec.monpremierplugin.commands.TestCommand;
import fr.talec.monpremierplugin.events.Events;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    public static Main instance;
    @Override
    public void onEnable() {
        saveDefaultConfig();

        instance = this;
        Bukkit.getServer().getPluginManager().registerEvents(new Events(), this);
        System.out.println(ChatColor.DARK_RED + "Mon plugin s'est lancé !");
        loadCommands();
    }

    private void loadCommands() {
        getCommand("gm").setExecutor(new TestCommand());
        getCommand("test").setExecutor(new TestCommand());
        getCommand("spawn").setExecutor(new SpawnCommand());
        getCommand("player").setExecutor(new TestCommand());

    }

}
