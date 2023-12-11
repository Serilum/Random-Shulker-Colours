package com.natamus.randomshulkercolours;

import com.natamus.randomshulkercolours.config.ConfigHandler;
import com.natamus.randomshulkercolours.util.Util;

public class ModCommon {

	public static void init() {
		ConfigHandler.initConfig();
		load();
	}

	private static void load() {
    	Util.initColours();
	}
}