package com.celestek.hexcraft.block;

import coloredlightscore.src.api.CLApi;
import com.celestek.hexcraft.HexCraft;
import com.celestek.hexcraft.client.renderer.HexBlockRenderer;
import com.celestek.hexcraft.init.HexBlocks;
import com.celestek.hexcraft.init.HexItems;
import com.celestek.hexcraft.item.ItemHexoriumDye;
import com.celestek.hexcraft.util.HexEnums;
import com.celestek.hexcraft.util.HexUtils;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import static com.celestek.hexcraft.client.HexClientProxy.renderID;

public class BlockHexoriumLampInv extends HexBlockMT implements IHexBlock, IBlockHexColor, IBlockHexVariant, IBlockUsableTransposer, IBlockMultiBlock {

    // Block ID
    public static final String ID = "blockHexoriumLampInv";

    // Meta Bits
    public static final int META_STATE = 0;

    // Color and variant
    private final HexEnums.Colors color;
    private final HexEnums.Variants variant;

    /**
     * Constructor for the block.
     * @param blockName Unlocalized name for the block. Contains color name.
     * @param color The color of the block to use.
     * @param variant The variant to use.
     */
    public BlockHexoriumLampInv(String blockName, HexEnums.Colors color, HexEnums.Variants variant) {
        super(Material.glass);

        // Set all block parameters.
        this.setBlockName(blockName);
        this.color = color;
        this.variant = variant;
        this.setCreativeTab(HexCraft.tabDecorative);

        this.setHarvestLevel("pickaxe", 2);
        this.setHardness(1.5F);
        this.setResistance(10F);

        this.setStepSound(Block.soundTypeGlass);
    }

    /**
     * Called whenever the block is added into the world.
     */
    @Override
    public void onBlockAdded(World world, int x, int y, int z) {
        processMeta(world, x, y, z);
    }

    /**
     * Called when a block near is changed.
     */
    @Override
    public void onNeighborBlockChange(World world, int x, int y, int z, Block block) {
        processMeta(world, x, y, z);
    }

    /**
     * Gets the light value according to meta.
     */
    @Override
    public int getLightValue(IBlockAccess world, int x, int y, int z) {
        if (!HexUtils.getMetaBit(META_STATE, world, x, y, z))
            if (Loader.isModLoaded("coloredlightscore"))
                return CLApi.makeRGBLightValue(color.r, color.g, color.b);
            else
                return 15;
        else
            return 0;
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
        icon = new IIcon[2];
        // Load the outer texture.
        icon[0] = iconRegister.registerIcon(HexCraft.MODID + ":" + BlockHexoriumLamp.ID + this.variant.name);
        // Load the inner texture. Use special texture if it is a rainbow.
        if(this.color == HexEnums.Colors.RAINBOW)
            icon[1] = iconRegister.registerIcon(HexCraft.MODID + ":" + "glowRainbow");
        else
            icon[1] = iconRegister.registerIcon(HexCraft.MODID + ":" + "glow");
    }

    /**
     * Retrieves the icons.
     */
    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        // Retrieve icon based on side.
        if (side < 6)
            return icon[0];
        else
            return icon[1];
    }

    /**
     * Processes the block meta to adjust light of the lamp.
     */
    private void processMeta(World world, int x, int y, int z) {
        if (!world.isRemote) {
            boolean state = HexUtils.getMetaBit(META_STATE, world, x, y, z);
            boolean powered = world.isBlockIndirectlyGettingPowered(x, y, z);
            // Set meta according to power.
            if (!state && powered)
                HexUtils.setMetaBit(META_STATE, true, HexUtils.META_NOTIFY_UPDATE, world, x, y, z);
            else if (state && !powered)
                HexUtils.setMetaBit(META_STATE, false, HexUtils.META_NOTIFY_UPDATE, world, x, y, z);
        }
    }

    @Override
    public String getID() {
        return ID;
    }

    public static void registerBlocks() {
        for (HexEnums.Variants variant : HexEnums.Variants.values()) {
            for (HexEnums.Colors color : HexEnums.Colors.values()) {
                String name = ID + variant.name + color.name;
                Block block = new BlockHexoriumLampInv(name, color, variant);
                GameRegistry.registerBlock(block, name);
            }
        }
    }

    public static void registerRenders() {
        for (HexEnums.Variants variant : HexEnums.Variants.values()) {
            for (HexEnums.Colors color : HexEnums.Colors.values()) {
                renderID[HexCraft.idCounter] = RenderingRegistry.getNextAvailableRenderId();
                RenderingRegistry.registerBlockHandler(new HexBlockRenderer(renderID[HexCraft.idCounter],
                        HexEnums.Brightness.BRIGHT, color));
            }
        }
    }

    public static void registerRecipes() {
        for (HexEnums.Variants variant : HexEnums.Variants.values()) {
            for (HexEnums.Colors color : HexEnums.Colors.values()) {
                Block block = HexBlocks.getHexBlock(ID, variant, color);

                Block inv = HexBlocks.getHexBlock(BlockHexoriumLamp.ID, variant, color);
                Block energized = HexBlocks.getHexBlock(BlockEnergizedHexorium.ID, color);
                Block glass = HexBlocks.getHexBlock(BlockTemperedHexoriumGlass.ID, variant);
                Item dye = HexItems.getHexItem(ItemHexoriumDye.ID, variant);

                GameRegistry.addRecipe(new ShapedOreRecipe(
                        block,
                        "LGL",
                        "IHI",
                        "LRL",
                        'H', energized, 'G', glass, 'I', "nuggetIron", 'R', Blocks.redstone_torch, 'L', "dustGlowstone"));

                GameRegistry.addRecipe(new ShapelessOreRecipe(
                        block,
                        inv, Blocks.redstone_torch));

                for (HexEnums.Variants variant2 : HexEnums.Variants.values()) {
                    if (variant != variant2) {
                        Block blockOther = HexBlocks.getHexBlock(ID, variant2, color);
                        GameRegistry.addRecipe(new ShapelessOreRecipe(
                                block,
                                blockOther, dye));
                    }
                }
            }
        }
    }

    @Override
    public HexEnums.Variants getVariant() {
        return this.variant;
    }

    @Override
    public HexEnums.Colors getColor() {
        return color;
    }
}
