package com.natamus.randomshulkercolours.neoforge.events;

import com.natamus.randomshulkercolours.events.ShulkerEvent;
import net.neoforged.neoforge.event.entity.EntityJoinLevelEvent;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;

@EventBusSubscriber
public class NeoForgeShulkerEvent {
	@SubscribeEvent
	public static void onShulkerSpawn(EntityJoinLevelEvent e) {
		ShulkerEvent.onShulkerSpawn(e.getLevel(), e.getEntity());
	}
}
