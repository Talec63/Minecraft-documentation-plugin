package fr.talec.monpremierplugin.events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;


public class Events implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        event.getPlayer().sendMessage("Bienvenue sur mon serveur incroyable");
        event.getPlayer().getInventory().addItem(new ItemStack(Material.COMPASS, 1));
        event.getPlayer().updateInventory();
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent e) {
        String Player = e.getPlayer().getName();
        System.out.println("Déconnexion de " + Player);
    }

    @EventHandler
    public void onInteract(PlayerInteractEvent e) {
        ItemStack Sword = new ItemStack(Material.DIAMOND_SWORD, 1);
        Player player = e.getPlayer();
        Action action = e.getAction();
        ItemStack item = e.getItem();
        if (item != null && item.getType() == Material.COMPASS) {
            player.sendMessage(ChatColor.GREEN + "Vous avez utiliser le compas");
            Inventory inventaire = Bukkit.createInventory(null, 54, ChatColor.RED + "Premier coffre");
            player.openInventory(inventaire);
            inventaire.setItem(11, Sword);
            
            
        }
    }
}

