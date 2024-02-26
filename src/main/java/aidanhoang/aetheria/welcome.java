package aidanhoang.aetheria;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class welcome implements Listener {
    @EventHandler
    public void welcomeMessage(PlayerJoinEvent e) {
        Bukkit.getPlayer(e.getPlayer().getName()).sendMessage("§fWelcome to §e§lAetherians vs Zombies§r§f. The greatest MMORPG §e§lMinigame §r§fto ever exist.");
    }
}
