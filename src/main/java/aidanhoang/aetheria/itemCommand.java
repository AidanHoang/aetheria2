package aidanhoang.aetheria;
import aidanhoang.aetheria.item;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Arrays;

public class itemCommand implements CommandExecutor {

    String[] critLore = new String[]{"§eForged by §cKolbert21337§f.", "A legendary warrior..."};

    item[] items = new item[]{new item("Critbringer", new ArrayList<String>(Arrays.asList(critLore)), Material.IRON_SWORD, new Enchantment[]{Enchantment.DAMAGE_ALL}, new int[]{3}),
            new item("next", new ArrayList<>(Arrays.asList(critLore)), Material.IRON_SWORD, new Enchantment[]{Enchantment.DAMAGE_ALL}, new int[]{3})};

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 1) {
            String itemName = args[0];

            for (item i : items) {
                if (i.getName().equals(args[0])) {

                    Player player = Bukkit.getPlayer(sender.getName());

                    player.getInventory().addItem(i.getItem());
                }
            }
        }

        return false;
    }
}
