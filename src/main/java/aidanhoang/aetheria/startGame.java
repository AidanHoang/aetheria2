package aidanhoang.aetheria;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.Arrays;

public class startGame implements CommandExecutor {
    private shrine s;

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        shrine s = new shrine(100);

        return false;
    }

    public void damage(Player p) {
        s.removeHealth(1);
        p.sendMessage("The Shrine has " + s.getHealth() + " health left.");
    }
}
