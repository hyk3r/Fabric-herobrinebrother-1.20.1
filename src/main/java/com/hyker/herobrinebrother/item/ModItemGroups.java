package com.hyker.herobrinebrother.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import com.hyker.herobrinebrother.HerobrineBrother;
import com.hyker.herobrinebrother.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(HerobrineBrother.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RAW_RUBY);

                        entries.add(Items.DIAMOND);

                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.RAW_RUBY_BLOCK);


                    }).build());


    public static void registerItemGroups() {
        HerobrineBrother.LOGGER.info("Registering Item Groups for " + HerobrineBrother.MOD_ID);
    }
}

