package aidanhoang.aetheria;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemHeldEvent;
import aidanhoang.aetheria.itemCommand;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import static org.bukkit.potion.PotionEffect.INFINITE_DURATION;
import static org.bukkit.potion.PotionType.JUMP;

public class critbringer implements Listener {
    private boolean isHeld = false;

    PotionEffect jump = new PotionEffect(PotionEffectType.JUMP, INFINITE_DURATION, 3);
    PotionEffect speed = new PotionEffect(PotionEffectType.SPEED, INFINITE_DURATION, 2);

    @EventHandler
    public void changeItem(PlayerItemHeldEvent e) {
        try {
            if (e.getPlayer().getInventory().getItem(e.getNewSlot()).getItemMeta().getDisplayName().equals("Critbringer")) {
                Bukkit.getPlayer(e.getPlayer().getName()).sendMessage("§d§oA power runs through you...");
                Bukkit.getPlayer(e.getPlayer().getName()).addPotionEffect(jump);
                Bukkit.getPlayer(e.getPlayer().getName()).addPotionEffect(speed);
            } else {
                for (PotionEffect effect : Bukkit.getPlayer(e.getPlayer().getName()).getActivePotionEffects()) {

                    if (effect.equals(jump)) {
                        Bukkit.getPlayer(e.getPlayer().getName()).removePotionEffect(PotionEffectType.JUMP);
                        Bukkit.getPlayer(e.getPlayer().getName()).removePotionEffect(PotionEffectType.SPEED);
                        Bukkit.getPlayer(e.getPlayer().getName()).sendMessage("§d§oA power slowly leaves you...");
                    }
                }
            }
        } catch (NullPointerException hand) {
            for (PotionEffect effect : Bukkit.getPlayer(e.getPlayer().getName()).getActivePotionEffects()) {

                if (effect.equals(jump)) {
                    Bukkit.getPlayer(e.getPlayer().getName()).removePotionEffect(PotionEffectType.JUMP);
                    Bukkit.getPlayer(e.getPlayer().getName()).removePotionEffect(PotionEffectType.SPEED);
                    Bukkit.getPlayer(e.getPlayer().getName()).sendMessage("§d§oA power slowly leaves you...");
                }
            }
        }
    }
}