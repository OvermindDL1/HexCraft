package com.celestek.hexcraft.util;

import net.minecraft.util.DamageSource;

public class HexDamage extends DamageSource {

    // Different damage types added by HEXCraft.
    public static DamageSource teleport = (new DamageSource("hexTeleport")).setDamageBypassesArmor();
    public static DamageSource transposer = (new DamageSource("hexTransposer")).setDamageBypassesArmor();

    public HexDamage(String name) {
        super(name);
    }
}
