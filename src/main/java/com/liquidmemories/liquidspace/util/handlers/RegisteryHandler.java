package com.liquidmemories.liquidspace.util.handlers;

import com.liquidmemories.liquidspace.init.ModItems;
import com.liquidmemories.liquidspace.util.IHasModel;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegisteryHandler 
{	
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) 
	{
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) 
	{
		for(Item item : ModItems.ITEMS) 
		{
			if(item instanceof IHasModel) 
			{
				((IHasModel) item).registerModels();
			}
		}
	}
}