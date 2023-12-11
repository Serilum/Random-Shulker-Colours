package com.natamus.randomshulkercolours.forge.events;

import com.natamus.randomshulkercolours.events.ShulkerEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class ForgeShulkerEvent {
	@SubscribeEvent
	public void onShulkerSpawn(EntityJoinWorldEvent e) {
		ShulkerEvent.onShulkerSpawn(e.getWorld(), e.getEntity());
	}
}
