package dev.g3ru1a.toozcraft.init;

import dev.g3ru1a.toozcraft.ToozCraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = ToozCraft.MOD_ID, bus = Bus.MOD)
@ObjectHolder(ToozCraft.MOD_ID)
public class ItemInit {

//    @ObjectHolder(ToozCraft.MOD_ID + "test_item")
    public static Item test_item = null;

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName("test_item"));
    }

}
