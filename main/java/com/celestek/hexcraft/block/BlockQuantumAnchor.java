package com.celestek.hexcraft.block;

import com.celestek.hexcraft.HexCraft;
import com.celestek.hexcraft.init.HexBlocks;
import com.celestek.hexcraft.init.HexConfig;
import com.celestek.hexcraft.util.HexUtils;
import com.celestek.hexcraft.util.ObserverAnalyzer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

/**
 * @author Thorinair   <celestek@openmailbox.org>
 */

public class BlockQuantumAnchor extends HexBlock {

    // Block ID
    public static final String ID = "blockQuantumAnchor";

    /**
     * Constructor for the block.
     * @param blockName Unlocalized name for the block. Contains color name.
     */
    public BlockQuantumAnchor(String blockName) {
        super(Material.iron);

        // Set all block parameters.
        this.setBlockName(blockName);
        this.setCreativeTab(HexCraft.tabMachines);

        this.setHarvestLevel("pickaxe", 2);
        this.setHardness(5F);
        this.setResistance(10F);

        this.setStepSound(Block.soundTypeMetal);
    }

    /**
     * Called when a block is placed using its ItemBlock.
     */
    @Override
    public int onBlockPlaced(World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ, int meta) {
        // Check if the code is executed on the server.
        if(!world.isRemote) {
            if (HexConfig.cfgObserverDebug)
                System.out.println("[Quantum Anchor] (" + x + ", " + y + ", " + z + "): Anchor analysis started!");

            ObserverAnalyzer observerAnalyzer = new ObserverAnalyzer();
            observerAnalyzer.analyzeObserver(world, x, y, z);
        }

        return 0;
    }

    /**
     * Called when a block near is changed.
     */
    @Override
    public void onNeighborBlockChange(World world, int x, int y, int z, Block block) {
        System.out.println("[Quantum Anchor] (" + x + ", " + y + ", " + z + "): Neighbour block changed, analyzing!");

        ObserverAnalyzer observerAnalyzer = new ObserverAnalyzer();
        observerAnalyzer.analyzeObserver(world, x, y, z);
    }

    /// Prepare the icons.
    @SideOnly(Side.CLIENT)
    private IIcon icon[];

    /**
     * Registers the icons.
     */
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        // Initialize the icons.
        icon = new IIcon[3];
        // Load the outer textures.
        icon[0] = iconRegister.registerIcon(HexCraft.MODID + ":" + ID + "/" + ID + "01");
        icon[1] = iconRegister.registerIcon(HexCraft.MODID + ":" + ID + "/" + ID + "02");
        // Load the inner texture
        icon[2] = iconRegister.registerIcon(HexCraft.MODID + ":" + "glow");
    }

    /**
     * Retrieves the icons.
     */
    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        // Return the icons based on meta (rotation) and side.
        if (side == 0 || side == 1)
            return icon[0];
        else if (side == 6)
            return icon[2];
        else
            return icon[1];
    }
}