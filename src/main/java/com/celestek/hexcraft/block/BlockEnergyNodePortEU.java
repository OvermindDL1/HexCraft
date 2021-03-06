package com.celestek.hexcraft.block;

import com.celestek.hexcraft.HexCraft;
import com.celestek.hexcraft.client.renderer.HexBlockRenderer;
import com.celestek.hexcraft.init.HexBlocks;
import com.celestek.hexcraft.init.HexConfig;
import com.celestek.hexcraft.init.HexItems;
import com.celestek.hexcraft.tileentity.TileEnergyNodePortEU;
import com.celestek.hexcraft.util.HexEnergyNode;
import com.celestek.hexcraft.util.HexEnums;
import com.celestek.hexcraft.util.HexUtils;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ic2.api.item.IC2Items;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.oredict.ShapedOreRecipe;

import static com.celestek.hexcraft.client.HexClientProxy.renderID;

public class BlockEnergyNodePortEU extends HexBlockContainer implements IHexBlock, IBlockHexNode, IBlockHexEnergyPort {

    // Block ID
    public static final String ID = "blockEnergyNodePortEU";

    /**
     * Constructor for the block.
     * @param blockName Unlocalized name for the block.
     */
    public BlockEnergyNodePortEU(String blockName) {
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
     * Returns a new instance of a block's TIle Entity class. Called on placing the block.
     */
    @Override
    public TileEntity createNewTileEntity(World world, int par2) {
        return new TileEnergyNodePortEU();
    }

    // Prepare the icons.
    @SideOnly(Side.CLIENT)
    private IIcon icon[];

    /**
     * Registers the icons.
     */
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        // Initialize the icons.
        icon = new IIcon[4];
        // Load the outer textures.
        for (int i = 0; i < 3; i++)
            icon[i] = iconRegister.registerIcon(HexCraft.MODID + ":" + ID + "/" + ID + "0" + (i + 1));
        // Load the inner texture
        icon[3] = iconRegister.registerIcon(HexCraft.MODID + ":" + "glowRainbow");
    }

    /**
     * Retrieves the icons.
     */
    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        // Retrieve icon based on meta.
        if (side < 6) {
            if (HexUtils.getBit(HexBlocks.META_STRUCTURE_IS_PART, meta)) {
                int state = HexUtils.getBitBiInt(HexEnergyNode.META_MODE_0, HexEnergyNode.META_MODE_1, meta);
                if (state < 2)
                    return icon[1 + state];
                else
                    return icon[1];
            }
            else
                return icon[0];
        }
        else
            return icon[3];
    }

    @Override
    public String getID() {
        return ID;
    }

    public static void registerBlocks() {
        if (HexConfig.cfgEnergyNodeEnable && HexConfig.cfgEnergyNodePortsEUEnable && Loader.isModLoaded("IC2")) {
            GameRegistry.registerBlock(new BlockEnergyNodePortEU(ID), ID);
        }
    }

    public static void registerRenders() {
        if (HexConfig.cfgEnergyNodeEnable && HexConfig.cfgEnergyNodePortsEUEnable && Loader.isModLoaded("IC2")) {
            renderID[HexCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
            RenderingRegistry.registerBlockHandler(new HexBlockRenderer(renderID[HexCraft.idCounter],
                    HexEnums.Brightness.BRIGHT, HexEnums.Colors.RAINBOW));
        }
    }

    public static void registerRecipes() {
        if (HexConfig.cfgEnergyNodeEnable && HexConfig.cfgEnergyNodePortsEUEnable && Loader.isModLoaded("IC2")) {
            Block block = HexBlocks.getHexBlock(ID);

            Block energized = HexBlocks.getHexBlock(BlockEnergizedHexorium.ID, HexEnums.Colors.RAINBOW);
            Item panel = HexItems.itemMachineControlPanel;

            ItemStack circuit = IC2Items.getItem("advancedCircuit");
            ItemStack gold = IC2Items.getItem("insulatedGoldCableItem");

            GameRegistry.addRecipe(new ShapedOreRecipe(
                    block,
                    "IPI",
                    "GER",
                    "ICI",
                    'E', energized, 'P', panel, 'C', circuit, 'G', gold, 'R', Blocks.redstone_block, 'I', "ingotIron"));
        }
    }
}
