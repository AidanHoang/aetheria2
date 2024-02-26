package aidanhoang.aetheria;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class item {
    private String name;
    private ArrayList<String> lore;
    private Material material;
    private ItemStack itemStack;
    private ItemMeta meta;

    public item(String name, ArrayList<String> lore, Material material, Enchantment[] enchantments, int[] levels) {
        this.name = name;
        this.lore = lore;
        this.material = material;

        itemStack = new ItemStack(material);

        itemStack.setType(material);
        this.meta = itemStack.getItemMeta();

        this.meta.setDisplayName(name);

        this.meta.setLore(lore);

        for (int e = 0; e < enchantments.length; e++) {
            for (int l = 0; l < levels.length; l++) {
                this.meta.addEnchant(enchantments[e], levels[l], false);
            }
        }

        itemStack.setItemMeta(meta);

    }

    public void addEnchant(Enchantment e, int damage) {
        this.meta.addEnchant(e, damage, true);
        itemStack.setItemMeta(this.meta);
    }

    public String getName() {
        return this.name;
    }
    public ArrayList<String> getLore() {
        return this.lore;
    }
    public ItemStack getItem() {
        return this.itemStack;
    }

}
