package com.example.item.Upgrade;

import com.example.Thewavluy;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class UpgradeArmor {
    public static final Item upgrade = Registry.register(
        
    Registries.ITEM,  
    new Identifier(Thewavluy.MOD_ID,"upgrade_armor"),
    new Item(new FabricItemSettings().food(null)));

    public static Item reg(String name){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(e -> {
            e.add(upgrade);
        });

        return upgrade;
    }
}
