package com.celestek.hexcraft.util;

import net.minecraft.block.Block;

public class HexDevice {
    public int x;
    public int y;
    public int z;
    public Block block;

    public HexDevice(int x, int y, int z, Block block)
    {
        this.x = x;
        this.y = y;
        this.z = z;
        this.block = block;
    }
}
