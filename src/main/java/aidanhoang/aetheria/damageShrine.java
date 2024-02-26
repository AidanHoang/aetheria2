package aidanhoang.aetheria;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDamageEvent;

public class damageShrine implements Listener {
    private startGame s;
    public damageShrine(startGame s) {
        this.s = s;
    }

    @EventHandler
    public void shrine(BlockDamageEvent e) {
        if (e.getBlock().getType().equals(Material.ENCHANTING_TABLE)) {
            s.damage(e.getPlayer());
        }
    }

}
