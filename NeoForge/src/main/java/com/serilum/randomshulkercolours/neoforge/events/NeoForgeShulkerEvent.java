package com.serilum.randomshulkercolours.neoforge.events;

import com.serilum.randomshulkercolours.events.ShulkerEvent;
import net.neoforged.neoforge.event.entity.EntityJoinLevelEvent;
import net.neoforged.bus.api.SubscribeEvent;

public class NeoForgeShulkerEvent {
	@SubscribeEvent
	public static void onShulkerSpawn(EntityJoinLevelEvent e) {
		ShulkerEvent.onShulkerSpawn(e.getLevel(), e.getEntity());
	}
}
