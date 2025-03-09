package com.example;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.item.StickStone;
import com.example.item.Upgrade.UpgradeArmor;
import com.example.item.ore.MixinIronDiamonds;


public class Thewavluy implements ModInitializer {
	public static final String MOD_ID = "the-wav-luy";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		MixinIronDiamonds.reg(MOD_ID);
		StickStone.reg(MOD_ID);

		UpgradeArmor.reg(MOD_ID);
	}
}