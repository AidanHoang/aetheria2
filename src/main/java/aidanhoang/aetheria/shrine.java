package aidanhoang.aetheria;

import org.bukkit.Bukkit;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarFlag;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.Player;

public class shrine {
    private int health;
    private BossBar b;
    private boolean alive;

    public shrine(int health) {
        b = Bukkit.createBossBar("Shrine Health", BarColor.BLUE, BarStyle.SEGMENTED_20, BarFlag.PLAY_BOSS_MUSIC);
        b.setProgress(1.0);
        for (Player p : Bukkit.getOnlinePlayers()) {
            b.addPlayer(p);
        }
        this.health = health;
        this.alive = true;
    }

    public void removeHealth(int num) {
        health -= num;
        b.setProgress((health - num) * 0.01);

        if (this.health <= 0) {
            alive = false;

            for (Player p : Bukkit.getOnlinePlayers()) {
                b.removeAll();
            }

            Bukkit.broadcastMessage("§c§lTHE SHRINE HAS FALLEN!");
        }
    }

    public int getHealth() {
        return this.health;
    }
}
