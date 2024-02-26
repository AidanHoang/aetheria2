package aidanhoang.aetheria;

import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Aetheria extends JavaPlugin {

    public void onEnable() {

        startGame s = new startGame();

        this.getCommand("item").setExecutor(new itemCommand());
        this.getCommand("start").setExecutor(new startGame());
        getServer().getPluginManager().registerEvents(new welcome(), this);
        getServer().getPluginManager().registerEvents(new critbringer(), this);
        getServer().getPluginManager().registerEvents(new damageShrine(s), this);

        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }



}
