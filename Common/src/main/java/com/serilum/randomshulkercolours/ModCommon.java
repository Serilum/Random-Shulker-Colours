package com.serilum.randomshulkercolours;

import com.serilum.randomshulkercolours.config.ConfigHandler;
import com.serilum.randomshulkercolours.util.Util;

public class ModCommon {

	public static void init() {
		ConfigHandler.initConfig();
		load();
	}

	private static void load() {
		Util.initColours();
	}
}