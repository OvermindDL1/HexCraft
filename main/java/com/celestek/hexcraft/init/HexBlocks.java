package com.celestek.hexcraft.init;

import com.celestek.hexcraft.HexCraft;
import com.celestek.hexcraft.block.*;
import com.celestek.hexcraft.util.HexUtils;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.world.World;

/**
 * @author Thorinair   <celestek@openmailbox.org>
 * @version 0.7.0
 */

public class HexBlocks {

    // Meta Bits
    public static final int META_MACHINE_ROTATION_0 = 0;
    public static final int META_MACHINE_ROTATION_1 = 1;
    public static final int META_MACHINE_STATUS_0 = 2;
    public static final int META_MACHINE_STATUS_1 = 3;
    public static final int META_DECORATIVE_REINFORCED = 0;

    // Machine States
    public static final int MACHINE_STATE_READY = 0;
    public static final int MACHINE_STATE_ACTIVE = 1;
    public static final int MACHINE_STATE_DEAD = 2;

    /**
     * ADDING NEW BLOCKS
     * To add a new block:
     * 1) Increment countBlocks.
     * 2) Add a public static Block.
     * 3) Add the 2 required lines to initializeBlocks() (Check other blocks).
     * 4) Add the 2 required lines to HexClientProxy.setCustomRenderers() (Check other blocks).
     */

    // Total count of blocks to add.
    public static int countBlocks = 260;

    // Hexorium Nether Ore
    public static Block blockHexoriumNetherOreRed;
    public static Block blockHexoriumNetherOreGreen;
    public static Block blockHexoriumNetherOreBlue;
    
    public static Block blockHexoriumNetherOreWhite;
    public static Block blockHexoriumNetherOreBlack;

    // Hexorium Ore
    public static Block blockHexoriumOreRed;
    public static Block blockHexoriumOreGreen;
    public static Block blockHexoriumOreBlue;
    
    public static Block blockHexoriumOreWhite;
    public static Block blockHexoriumOreBlack;

    // Hexorium Monolith
    public static Block blockHexoriumMonolithRed;
    public static Block blockHexoriumMonolithGreen;
    public static Block blockHexoriumMonolithBlue;

    public static Block blockHexoriumMonolithWhite;
    public static Block blockHexoriumMonolithBlack;

    // Hexorium Nether Monolith
    public static Block blockHexoriumNetherMonolithRed;
    public static Block blockHexoriumNetherMonolithGreen;
    public static Block blockHexoriumNetherMonolithBlue;

    public static Block blockHexoriumNetherMonolithWhite;
    public static Block blockHexoriumNetherMonolithBlack;

    // Block of Hexorium Crystal
    public static Block blockOfHexoriumCrystalRed;
    public static Block blockOfHexoriumCrystalGreen;
    public static Block blockOfHexoriumCrystalBlue;
    
    public static Block blockOfHexoriumCrystalWhite;
    public static Block blockOfHexoriumCrystalBlack;

    // Energized Hexorium
    public static Block blockEnergizedHexoriumRed;
    public static Block blockEnergizedHexoriumOrange;
    public static Block blockEnergizedHexoriumYellow;
    public static Block blockEnergizedHexoriumLime;
    public static Block blockEnergizedHexoriumGreen;
    public static Block blockEnergizedHexoriumTurquoise;
    public static Block blockEnergizedHexoriumCyan;
    public static Block blockEnergizedHexoriumSkyBlue;
    public static Block blockEnergizedHexoriumBlue;
    public static Block blockEnergizedHexoriumPurple;
    public static Block blockEnergizedHexoriumMagenta;
    public static Block blockEnergizedHexoriumPink;
    
    public static Block blockEnergizedHexoriumWhite;
    public static Block blockEnergizedHexoriumLightGray;
    public static Block blockEnergizedHexoriumGray;
    public static Block blockEnergizedHexoriumDarkGray;
    public static Block blockEnergizedHexoriumBlack;

    public static Block blockEnergizedHexoriumRainbow;

    // Engineered Hexorium Block
    public static Block blockEngineeredHexoriumBlockRed;
    public static Block blockEngineeredHexoriumBlockOrange;
    public static Block blockEngineeredHexoriumBlockYellow;
    public static Block blockEngineeredHexoriumBlockLime;
    public static Block blockEngineeredHexoriumBlockGreen;
    public static Block blockEngineeredHexoriumBlockTurquoise;
    public static Block blockEngineeredHexoriumBlockCyan;
    public static Block blockEngineeredHexoriumBlockSkyBlue;
    public static Block blockEngineeredHexoriumBlockBlue;
    public static Block blockEngineeredHexoriumBlockPurple;
    public static Block blockEngineeredHexoriumBlockMagenta;
    public static Block blockEngineeredHexoriumBlockPink;

    public static Block blockEngineeredHexoriumBlockWhite;
    public static Block blockEngineeredHexoriumBlockLightGray;
    public static Block blockEngineeredHexoriumBlockGray;
    public static Block blockEngineeredHexoriumBlockDarkGray;
    public static Block blockEngineeredHexoriumBlockBlack;

    public static Block blockEngineeredHexoriumBlockRainbow;

    // Framed Hexorium Block
    public static Block blockFramedHexoriumBlockRed;
    public static Block blockFramedHexoriumBlockOrange;
    public static Block blockFramedHexoriumBlockYellow;
    public static Block blockFramedHexoriumBlockLime;
    public static Block blockFramedHexoriumBlockGreen;
    public static Block blockFramedHexoriumBlockTurquoise;
    public static Block blockFramedHexoriumBlockCyan;
    public static Block blockFramedHexoriumBlockSkyBlue;
    public static Block blockFramedHexoriumBlockBlue;
    public static Block blockFramedHexoriumBlockPurple;
    public static Block blockFramedHexoriumBlockMagenta;
    public static Block blockFramedHexoriumBlockPink;

    public static Block blockFramedHexoriumBlockWhite;
    public static Block blockFramedHexoriumBlockLightGray;
    public static Block blockFramedHexoriumBlockGray;
    public static Block blockFramedHexoriumBlockDarkGray;
    public static Block blockFramedHexoriumBlockBlack;

    public static Block blockFramedHexoriumBlockRainbow;

    // Plated Hexorium Block
    public static Block blockPlatedHexoriumBlockRed;
    public static Block blockPlatedHexoriumBlockOrange;
    public static Block blockPlatedHexoriumBlockYellow;
    public static Block blockPlatedHexoriumBlockLime;
    public static Block blockPlatedHexoriumBlockGreen;
    public static Block blockPlatedHexoriumBlockTurquoise;
    public static Block blockPlatedHexoriumBlockCyan;
    public static Block blockPlatedHexoriumBlockSkyBlue;
    public static Block blockPlatedHexoriumBlockBlue;
    public static Block blockPlatedHexoriumBlockPurple;
    public static Block blockPlatedHexoriumBlockMagenta;
    public static Block blockPlatedHexoriumBlockPink;

    public static Block blockPlatedHexoriumBlockWhite;
    public static Block blockPlatedHexoriumBlockLightGray;
    public static Block blockPlatedHexoriumBlockGray;
    public static Block blockPlatedHexoriumBlockDarkGray;
    public static Block blockPlatedHexoriumBlockBlack;

    public static Block blockPlatedHexoriumBlockRainbow;

    // Concentric Hexorium Block
    public static Block blockConcentricHexoriumBlockRed;
    public static Block blockConcentricHexoriumBlockOrange;
    public static Block blockConcentricHexoriumBlockYellow;
    public static Block blockConcentricHexoriumBlockLime;
    public static Block blockConcentricHexoriumBlockGreen;
    public static Block blockConcentricHexoriumBlockTurquoise;
    public static Block blockConcentricHexoriumBlockCyan;
    public static Block blockConcentricHexoriumBlockSkyBlue;
    public static Block blockConcentricHexoriumBlockBlue;
    public static Block blockConcentricHexoriumBlockPurple;
    public static Block blockConcentricHexoriumBlockMagenta;
    public static Block blockConcentricHexoriumBlockPink;

    public static Block blockConcentricHexoriumBlockWhite;
    public static Block blockConcentricHexoriumBlockLightGray;
    public static Block blockConcentricHexoriumBlockGray;
    public static Block blockConcentricHexoriumBlockDarkGray;
    public static Block blockConcentricHexoriumBlockBlack;

    public static Block blockConcentricHexoriumBlockRainbow;

    // Glowing Hexorium Glass
    public static Block blockGlowingHexoriumGlassRed;
    public static Block blockGlowingHexoriumGlassOrange;
    public static Block blockGlowingHexoriumGlassYellow;
    public static Block blockGlowingHexoriumGlassLime;
    public static Block blockGlowingHexoriumGlassGreen;
    public static Block blockGlowingHexoriumGlassTurquoise;
    public static Block blockGlowingHexoriumGlassCyan;
    public static Block blockGlowingHexoriumGlassSkyBlue;
    public static Block blockGlowingHexoriumGlassBlue;
    public static Block blockGlowingHexoriumGlassPurple;
    public static Block blockGlowingHexoriumGlassMagenta;
    public static Block blockGlowingHexoriumGlassPink;

    public static Block blockGlowingHexoriumGlassWhite;
    public static Block blockGlowingHexoriumGlassLightGray;
    public static Block blockGlowingHexoriumGlassGray;
    public static Block blockGlowingHexoriumGlassDarkGray;
    public static Block blockGlowingHexoriumGlassBlack;

    // Energized Hexorium Monolith
    public static Block blockEnergizedHexoriumMonolithRed;
    public static Block blockEnergizedHexoriumMonolithOrange;
    public static Block blockEnergizedHexoriumMonolithYellow;
    public static Block blockEnergizedHexoriumMonolithLime;
    public static Block blockEnergizedHexoriumMonolithGreen;
    public static Block blockEnergizedHexoriumMonolithTurquoise;
    public static Block blockEnergizedHexoriumMonolithCyan;
    public static Block blockEnergizedHexoriumMonolithSkyBlue;
    public static Block blockEnergizedHexoriumMonolithBlue;
    public static Block blockEnergizedHexoriumMonolithPurple;
    public static Block blockEnergizedHexoriumMonolithMagenta;
    public static Block blockEnergizedHexoriumMonolithPink;

    public static Block blockEnergizedHexoriumMonolithWhite;
    public static Block blockEnergizedHexoriumMonolithLightGray;
    public static Block blockEnergizedHexoriumMonolithGray;
    public static Block blockEnergizedHexoriumMonolithDarkGray;
    public static Block blockEnergizedHexoriumMonolithBlack;

    public static Block blockEnergizedHexoriumMonolithRainbow;

    // Hexorium Lamp
    public static Block blockHexoriumLampRed;
    public static Block blockHexoriumLampOrange;
    public static Block blockHexoriumLampYellow;
    public static Block blockHexoriumLampLime;
    public static Block blockHexoriumLampGreen;
    public static Block blockHexoriumLampTurquoise;
    public static Block blockHexoriumLampCyan;
    public static Block blockHexoriumLampSkyBlue;
    public static Block blockHexoriumLampBlue;
    public static Block blockHexoriumLampPurple;
    public static Block blockHexoriumLampMagenta;
    public static Block blockHexoriumLampPink;

    public static Block blockHexoriumLampWhite;
    public static Block blockHexoriumLampLightGray;
    public static Block blockHexoriumLampGray;
    public static Block blockHexoriumLampDarkGray;
    public static Block blockHexoriumLampBlack;

    public static Block blockHexoriumLampRainbow;

    // Inverted Hexorium Lamp
    public static Block blockHexoriumLampInvRed;
    public static Block blockHexoriumLampInvOrange;
    public static Block blockHexoriumLampInvYellow;
    public static Block blockHexoriumLampInvLime;
    public static Block blockHexoriumLampInvGreen;
    public static Block blockHexoriumLampInvTurquoise;
    public static Block blockHexoriumLampInvCyan;
    public static Block blockHexoriumLampInvSkyBlue;
    public static Block blockHexoriumLampInvBlue;
    public static Block blockHexoriumLampInvPurple;
    public static Block blockHexoriumLampInvMagenta;
    public static Block blockHexoriumLampInvPink;

    public static Block blockHexoriumLampInvWhite;
    public static Block blockHexoriumLampInvLightGray;
    public static Block blockHexoriumLampInvGray;
    public static Block blockHexoriumLampInvDarkGray;
    public static Block blockHexoriumLampInvBlack;

    public static Block blockHexoriumLampInvRainbow;

    // Hexorium Door
    public static Block blockHexoriumDoorRed;
    public static Block blockHexoriumDoorOrange;
    public static Block blockHexoriumDoorYellow;
    public static Block blockHexoriumDoorLime;
    public static Block blockHexoriumDoorGreen;
    public static Block blockHexoriumDoorTurquoise;
    public static Block blockHexoriumDoorCyan;
    public static Block blockHexoriumDoorSkyBlue;
    public static Block blockHexoriumDoorBlue;
    public static Block blockHexoriumDoorPurple;
    public static Block blockHexoriumDoorMagenta;
    public static Block blockHexoriumDoorPink;

    public static Block blockHexoriumDoorWhite;
    public static Block blockHexoriumDoorLightGray;
    public static Block blockHexoriumDoorGray;
    public static Block blockHexoriumDoorDarkGray;
    public static Block blockHexoriumDoorBlack;

    public static Block blockHexoriumDoorRainbow;

    // Hexorium Hatch
    public static Block blockHexoriumHatchRed;
    public static Block blockHexoriumHatchOrange;
    public static Block blockHexoriumHatchYellow;
    public static Block blockHexoriumHatchLime;
    public static Block blockHexoriumHatchGreen;
    public static Block blockHexoriumHatchTurquoise;
    public static Block blockHexoriumHatchCyan;
    public static Block blockHexoriumHatchSkyBlue;
    public static Block blockHexoriumHatchBlue;
    public static Block blockHexoriumHatchPurple;
    public static Block blockHexoriumHatchMagenta;
    public static Block blockHexoriumHatchPink;

    public static Block blockHexoriumHatchWhite;
    public static Block blockHexoriumHatchLightGray;
    public static Block blockHexoriumHatchGray;
    public static Block blockHexoriumHatchDarkGray;
    public static Block blockHexoriumHatchBlack;

    public static Block blockHexoriumHatchRainbow;

    // Machines
    public static Block blockHexoriumMachineBlock;

    public static Block blockHexoriumGenerator;
    public static Block blockHexoriumFurnace;
    public static Block blockCrystalSeparator;
    public static Block blockMatrixReconstructor;

    public static Block blockPersonalTeleportationPad;

    // Hexiroum Valve
    public static Block blockTankValve;
    public static Block blockTankRender;

    // Cables
    public static Block blockHexoriumCableRed;
    public static Block blockHexoriumCableOrange;
    public static Block blockHexoriumCableYellow;
    public static Block blockHexoriumCableLime;
    public static Block blockHexoriumCableGreen;
    public static Block blockHexoriumCableTurquoise;
    public static Block blockHexoriumCableCyan;
    public static Block blockHexoriumCableSkyBlue;
    public static Block blockHexoriumCableBlue;
    public static Block blockHexoriumCablePurple;
    public static Block blockHexoriumCableMagenta;
    public static Block blockHexoriumCablePink;

    public static Block blockHexoriumCableWhite;
    public static Block blockHexoriumCableLightGray;
    public static Block blockHexoriumCableGray;
    public static Block blockHexoriumCableDarkGray;
    public static Block blockHexoriumCableBlack;
    
    public static Block blockHexoriumCableRainbow;
    
    // Energy Pylon
    public static Block blockEnergyPylon;

    // Hexorium Switch
    public static Block blockHexoriumSwitchRedGreen;
    public static Block blockHexoriumSwitchRedBlue;
    public static Block blockHexoriumSwitchRedWhite;

    // Hexorium Button
    public static Block blockHexoriumButtonRed;
    public static Block blockHexoriumButtonGreen;
    public static Block blockHexoriumButtonBlue;
    public static Block blockHexoriumButtonWhite;

    // Hexorium Pressure Plate
    public static Block blockHexoriumPressurePlateRed;
    public static Block blockHexoriumPressurePlateGreen;
    public static Block blockHexoriumPressurePlateBlue;
    public static Block blockHexoriumPressurePlateWhite;

    // Regular Blocks
    public static Block blockTemperedHexoriumGlass;

    public static Block blockPylonBase51;
    public static Block blockPylonBase15;

    /**
     * Initializes all block and adds them to GameRegistry.
     */
    public static void initializeBlocks()
    {
        // Prepare HexCraft's block ID counter.
        HexCraft.idCounter = 0;

        // Hexorium Nether NetherOre
        blockHexoriumNetherOreRed = new BlockHexoriumNetherOre(BlockHexoriumNetherOre.ID + "Red", 1, 2);
        GameRegistry.registerBlock(blockHexoriumNetherOreRed, BlockHexoriumNetherOre.ID + "Red");
        blockHexoriumNetherOreGreen = new BlockHexoriumNetherOre(BlockHexoriumNetherOre.ID + "Green", 1, 2);
        GameRegistry.registerBlock(blockHexoriumNetherOreGreen, BlockHexoriumNetherOre.ID + "Green");
        blockHexoriumNetherOreBlue = new BlockHexoriumNetherOre(BlockHexoriumNetherOre.ID + "Blue", 1, 2);
        GameRegistry.registerBlock(blockHexoriumNetherOreBlue, BlockHexoriumNetherOre.ID + "Blue");
        
        blockHexoriumNetherOreWhite = new BlockHexoriumNetherOre(BlockHexoriumNetherOre.ID + "White", 2, 4);
        GameRegistry.registerBlock(blockHexoriumNetherOreWhite, BlockHexoriumNetherOre.ID + "White");
        blockHexoriumNetherOreBlack = new BlockHexoriumNetherOre(BlockHexoriumNetherOre.ID + "Black", 2, 4);
        GameRegistry.registerBlock(blockHexoriumNetherOreBlack, BlockHexoriumNetherOre.ID + "Black");

        // Hexorium Ore
        blockHexoriumOreRed = new BlockHexoriumOre(BlockHexoriumOre.ID + "Red", 2, 4);
        GameRegistry.registerBlock(blockHexoriumOreRed, BlockHexoriumOre.ID + "Red");
        blockHexoriumOreGreen = new BlockHexoriumOre(BlockHexoriumOre.ID + "Green", 2, 4);
        GameRegistry.registerBlock(blockHexoriumOreGreen, BlockHexoriumOre.ID + "Green");
        blockHexoriumOreBlue = new BlockHexoriumOre(BlockHexoriumOre.ID + "Blue", 2, 4);
        GameRegistry.registerBlock(blockHexoriumOreBlue, BlockHexoriumOre.ID + "Blue");
        
        blockHexoriumOreWhite = new BlockHexoriumOre(BlockHexoriumOre.ID + "White", 1, 2);
        GameRegistry.registerBlock(blockHexoriumOreWhite, BlockHexoriumOre.ID + "White");
        blockHexoriumOreBlack = new BlockHexoriumOre(BlockHexoriumOre.ID + "Black", 1, 2);
        GameRegistry.registerBlock(blockHexoriumOreBlack, BlockHexoriumOre.ID + "Black");

        // Hexorium Monolith
        blockHexoriumMonolithRed = new BlockHexoriumMonolith(BlockHexoriumMonolith.ID + "Red", 6, 8);
        GameRegistry.registerBlock(blockHexoriumMonolithRed, BlockHexoriumMonolith.ID + "Red");
        blockHexoriumMonolithGreen = new BlockHexoriumMonolith(BlockHexoriumMonolith.ID + "Green", 6, 8);
        GameRegistry.registerBlock(blockHexoriumMonolithGreen, BlockHexoriumMonolith.ID + "Green");
        blockHexoriumMonolithBlue = new BlockHexoriumMonolith(BlockHexoriumMonolith.ID + "Blue", 6, 8);
        GameRegistry.registerBlock(blockHexoriumMonolithBlue, BlockHexoriumMonolith.ID + "Blue");

        blockHexoriumMonolithWhite = new BlockHexoriumMonolith(BlockHexoriumMonolith.ID + "White", 2, 4);
        GameRegistry.registerBlock(blockHexoriumMonolithWhite, BlockHexoriumMonolith.ID + "White");
        blockHexoriumMonolithBlack = new BlockHexoriumMonolith(BlockHexoriumMonolith.ID + "Black", 2, 4);
        GameRegistry.registerBlock(blockHexoriumMonolithBlack, BlockHexoriumMonolith.ID + "Black");
        
        // Hexorium Nether Monolith
        blockHexoriumNetherMonolithRed = new BlockHexoriumNetherMonolith(BlockHexoriumNetherMonolith.ID + "Red", 2, 4);
        GameRegistry.registerBlock(blockHexoriumNetherMonolithRed, BlockHexoriumNetherMonolith.ID + "Red");
        blockHexoriumNetherMonolithGreen = new BlockHexoriumNetherMonolith(BlockHexoriumNetherMonolith.ID + "Green", 2, 4);
        GameRegistry.registerBlock(blockHexoriumNetherMonolithGreen, BlockHexoriumNetherMonolith.ID + "Green");
        blockHexoriumNetherMonolithBlue = new BlockHexoriumNetherMonolith(BlockHexoriumNetherMonolith.ID + "Blue", 2, 4);
        GameRegistry.registerBlock(blockHexoriumNetherMonolithBlue, BlockHexoriumNetherMonolith.ID + "Blue");

        blockHexoriumNetherMonolithWhite = new BlockHexoriumNetherMonolith(BlockHexoriumNetherMonolith.ID + "White", 6, 8);
        GameRegistry.registerBlock(blockHexoriumNetherMonolithWhite, BlockHexoriumNetherMonolith.ID + "White");
        blockHexoriumNetherMonolithBlack = new BlockHexoriumNetherMonolith(BlockHexoriumNetherMonolith.ID + "Black", 6, 8);
        GameRegistry.registerBlock(blockHexoriumNetherMonolithBlack, BlockHexoriumNetherMonolith.ID + "Black");

        // Block of Hexorium Crystal
        blockOfHexoriumCrystalRed = new BlockOfHexoriumCrystal(BlockOfHexoriumCrystal.UNLOCALISEDNAME + "Red");
        GameRegistry.registerBlock(blockOfHexoriumCrystalRed, BlockOfHexoriumCrystal.UNLOCALISEDNAME + "Red");
        blockOfHexoriumCrystalGreen = new BlockOfHexoriumCrystal(BlockOfHexoriumCrystal.UNLOCALISEDNAME + "Green");
        GameRegistry.registerBlock(blockOfHexoriumCrystalGreen, BlockOfHexoriumCrystal.UNLOCALISEDNAME + "Green");
        blockOfHexoriumCrystalBlue = new BlockOfHexoriumCrystal(BlockOfHexoriumCrystal.UNLOCALISEDNAME + "Blue");
        GameRegistry.registerBlock(blockOfHexoriumCrystalBlue, BlockOfHexoriumCrystal.UNLOCALISEDNAME + "Blue");
        
        blockOfHexoriumCrystalWhite = new BlockOfHexoriumCrystal(BlockOfHexoriumCrystal.UNLOCALISEDNAME + "White");
        GameRegistry.registerBlock(blockOfHexoriumCrystalWhite, BlockOfHexoriumCrystal.UNLOCALISEDNAME + "White");
        blockOfHexoriumCrystalBlack = new BlockOfHexoriumCrystal(BlockOfHexoriumCrystal.UNLOCALISEDNAME + "Black");
        GameRegistry.registerBlock(blockOfHexoriumCrystalBlack, BlockOfHexoriumCrystal.UNLOCALISEDNAME + "Black");
        
        // Energized Hexorium
        blockEnergizedHexoriumRed = new BlockEnergizedHexorium(BlockEnergizedHexorium.ID + "Red");
        GameRegistry.registerBlock(blockEnergizedHexoriumRed, BlockEnergizedHexorium.ID + "Red");
        blockEnergizedHexoriumOrange = new BlockEnergizedHexorium(BlockEnergizedHexorium.ID + "Orange");
        GameRegistry.registerBlock(blockEnergizedHexoriumOrange, BlockEnergizedHexorium.ID + "Orange");
        blockEnergizedHexoriumYellow = new BlockEnergizedHexorium(BlockEnergizedHexorium.ID + "Yellow");
        GameRegistry.registerBlock(blockEnergizedHexoriumYellow, BlockEnergizedHexorium.ID + "Yellow");
        blockEnergizedHexoriumLime = new BlockEnergizedHexorium(BlockEnergizedHexorium.ID + "Lime");
        GameRegistry.registerBlock(blockEnergizedHexoriumLime, BlockEnergizedHexorium.ID + "Lime");
        blockEnergizedHexoriumGreen = new BlockEnergizedHexorium(BlockEnergizedHexorium.ID + "Green");
        GameRegistry.registerBlock(blockEnergizedHexoriumGreen, BlockEnergizedHexorium.ID + "Green");
        blockEnergizedHexoriumTurquoise = new BlockEnergizedHexorium(BlockEnergizedHexorium.ID + "Turquoise");
        GameRegistry.registerBlock(blockEnergizedHexoriumTurquoise, BlockEnergizedHexorium.ID + "Turquoise");
        blockEnergizedHexoriumCyan = new BlockEnergizedHexorium(BlockEnergizedHexorium.ID + "Cyan");
        GameRegistry.registerBlock(blockEnergizedHexoriumCyan, BlockEnergizedHexorium.ID + "Cyan");
        blockEnergizedHexoriumSkyBlue = new BlockEnergizedHexorium(BlockEnergizedHexorium.ID + "SkyBlue");
        GameRegistry.registerBlock(blockEnergizedHexoriumSkyBlue, BlockEnergizedHexorium.ID + "SkyBlue");
        blockEnergizedHexoriumBlue = new BlockEnergizedHexorium(BlockEnergizedHexorium.ID + "Blue");
        GameRegistry.registerBlock(blockEnergizedHexoriumBlue, BlockEnergizedHexorium.ID + "Blue");
        blockEnergizedHexoriumPurple = new BlockEnergizedHexorium(BlockEnergizedHexorium.ID + "Purple");
        GameRegistry.registerBlock(blockEnergizedHexoriumPurple, BlockEnergizedHexorium.ID + "Purple");
        blockEnergizedHexoriumMagenta = new BlockEnergizedHexorium(BlockEnergizedHexorium.ID + "Magenta");
        GameRegistry.registerBlock(blockEnergizedHexoriumMagenta, BlockEnergizedHexorium.ID + "Magenta");
        blockEnergizedHexoriumPink = new BlockEnergizedHexorium(BlockEnergizedHexorium.ID + "Pink");
        GameRegistry.registerBlock(blockEnergizedHexoriumPink, BlockEnergizedHexorium.ID + "Pink");
        
        blockEnergizedHexoriumWhite = new BlockEnergizedHexorium(BlockEnergizedHexorium.ID + "White");
        GameRegistry.registerBlock(blockEnergizedHexoriumWhite, BlockEnergizedHexorium.ID + "White");
        blockEnergizedHexoriumLightGray = new BlockEnergizedHexorium(BlockEnergizedHexorium.ID + "LightGray");
        GameRegistry.registerBlock(blockEnergizedHexoriumLightGray, BlockEnergizedHexorium.ID + "LightGray");
        blockEnergizedHexoriumGray = new BlockEnergizedHexorium(BlockEnergizedHexorium.ID + "Gray");
        GameRegistry.registerBlock(blockEnergizedHexoriumGray, BlockEnergizedHexorium.ID + "Gray");
        blockEnergizedHexoriumDarkGray = new BlockEnergizedHexorium(BlockEnergizedHexorium.ID + "DarkGray");
        GameRegistry.registerBlock(blockEnergizedHexoriumDarkGray, BlockEnergizedHexorium.ID + "DarkGray");
        blockEnergizedHexoriumBlack = new BlockEnergizedHexorium(BlockEnergizedHexorium.ID + "Black");
        GameRegistry.registerBlock(blockEnergizedHexoriumBlack, BlockEnergizedHexorium.ID + "Black");
        
        blockEnergizedHexoriumRainbow = new BlockEnergizedHexorium(BlockEnergizedHexorium.ID + "Rainbow");
        GameRegistry.registerBlock(blockEnergizedHexoriumRainbow, BlockEnergizedHexorium.ID + "Rainbow");

        // Engineered Hexorium Block
        blockEngineeredHexoriumBlockRed = new BlockEngineeredHexoriumBlock(BlockEngineeredHexoriumBlock.ID + "Red");
        GameRegistry.registerBlock(blockEngineeredHexoriumBlockRed, BlockEngineeredHexoriumBlock.ID + "Red");
        blockEngineeredHexoriumBlockOrange = new BlockEngineeredHexoriumBlock(BlockEngineeredHexoriumBlock.ID + "Orange");
        GameRegistry.registerBlock(blockEngineeredHexoriumBlockOrange, BlockEngineeredHexoriumBlock.ID + "Orange");
        blockEngineeredHexoriumBlockYellow = new BlockEngineeredHexoriumBlock(BlockEngineeredHexoriumBlock.ID + "Yellow");
        GameRegistry.registerBlock(blockEngineeredHexoriumBlockYellow, BlockEngineeredHexoriumBlock.ID + "Yellow");
        blockEngineeredHexoriumBlockLime = new BlockEngineeredHexoriumBlock(BlockEngineeredHexoriumBlock.ID + "Lime");
        GameRegistry.registerBlock(blockEngineeredHexoriumBlockLime, BlockEngineeredHexoriumBlock.ID + "Lime");
        blockEngineeredHexoriumBlockGreen = new BlockEngineeredHexoriumBlock(BlockEngineeredHexoriumBlock.ID + "Green");
        GameRegistry.registerBlock(blockEngineeredHexoriumBlockGreen, BlockEngineeredHexoriumBlock.ID + "Green");
        blockEngineeredHexoriumBlockTurquoise = new BlockEngineeredHexoriumBlock(BlockEngineeredHexoriumBlock.ID + "Turquoise");
        GameRegistry.registerBlock(blockEngineeredHexoriumBlockTurquoise, BlockEngineeredHexoriumBlock.ID + "Turquoise");
        blockEngineeredHexoriumBlockCyan = new BlockEngineeredHexoriumBlock(BlockEngineeredHexoriumBlock.ID + "Cyan");
        GameRegistry.registerBlock(blockEngineeredHexoriumBlockCyan, BlockEngineeredHexoriumBlock.ID + "Cyan");
        blockEngineeredHexoriumBlockSkyBlue = new BlockEngineeredHexoriumBlock(BlockEngineeredHexoriumBlock.ID + "SkyBlue");
        GameRegistry.registerBlock(blockEngineeredHexoriumBlockSkyBlue, BlockEngineeredHexoriumBlock.ID + "SkyBlue");
        blockEngineeredHexoriumBlockBlue = new BlockEngineeredHexoriumBlock(BlockEngineeredHexoriumBlock.ID + "Blue");
        GameRegistry.registerBlock(blockEngineeredHexoriumBlockBlue, BlockEngineeredHexoriumBlock.ID + "Blue");
        blockEngineeredHexoriumBlockPurple = new BlockEngineeredHexoriumBlock(BlockEngineeredHexoriumBlock.ID + "Purple");
        GameRegistry.registerBlock(blockEngineeredHexoriumBlockPurple, BlockEngineeredHexoriumBlock.ID + "Purple");
        blockEngineeredHexoriumBlockMagenta = new BlockEngineeredHexoriumBlock(BlockEngineeredHexoriumBlock.ID + "Magenta");
        GameRegistry.registerBlock(blockEngineeredHexoriumBlockMagenta, BlockEngineeredHexoriumBlock.ID + "Magenta");
        blockEngineeredHexoriumBlockPink = new BlockEngineeredHexoriumBlock(BlockEngineeredHexoriumBlock.ID + "Pink");
        GameRegistry.registerBlock(blockEngineeredHexoriumBlockPink, BlockEngineeredHexoriumBlock.ID + "Pink");
        
        blockEngineeredHexoriumBlockWhite = new BlockEngineeredHexoriumBlock(BlockEngineeredHexoriumBlock.ID + "White");
        GameRegistry.registerBlock(blockEngineeredHexoriumBlockWhite, BlockEngineeredHexoriumBlock.ID + "White");
        blockEngineeredHexoriumBlockLightGray = new BlockEngineeredHexoriumBlock(BlockEngineeredHexoriumBlock.ID + "LightGray");
        GameRegistry.registerBlock(blockEngineeredHexoriumBlockLightGray, BlockEngineeredHexoriumBlock.ID + "LightGray");
        blockEngineeredHexoriumBlockGray = new BlockEngineeredHexoriumBlock(BlockEngineeredHexoriumBlock.ID + "Gray");
        GameRegistry.registerBlock(blockEngineeredHexoriumBlockGray, BlockEngineeredHexoriumBlock.ID + "Gray");
        blockEngineeredHexoriumBlockDarkGray = new BlockEngineeredHexoriumBlock(BlockEngineeredHexoriumBlock.ID + "DarkGray");
        GameRegistry.registerBlock(blockEngineeredHexoriumBlockDarkGray, BlockEngineeredHexoriumBlock.ID + "DarkGray");
        blockEngineeredHexoriumBlockBlack = new BlockEngineeredHexoriumBlock(BlockEngineeredHexoriumBlock.ID + "Black");
        GameRegistry.registerBlock(blockEngineeredHexoriumBlockBlack, BlockEngineeredHexoriumBlock.ID + "Black");

        blockEngineeredHexoriumBlockRainbow = new BlockEngineeredHexoriumBlock(BlockEngineeredHexoriumBlock.ID + "Rainbow");
        GameRegistry.registerBlock(blockEngineeredHexoriumBlockRainbow, BlockEngineeredHexoriumBlock.ID + "Rainbow");

        // Framed Hexorium Block
        blockFramedHexoriumBlockRed = new BlockFramedHexoriumBlock(BlockFramedHexoriumBlock.ID + "Red");
        GameRegistry.registerBlock(blockFramedHexoriumBlockRed, BlockFramedHexoriumBlock.ID + "Red");
        blockFramedHexoriumBlockOrange = new BlockFramedHexoriumBlock(BlockFramedHexoriumBlock.ID + "Orange");
        GameRegistry.registerBlock(blockFramedHexoriumBlockOrange, BlockFramedHexoriumBlock.ID + "Orange");
        blockFramedHexoriumBlockYellow = new BlockFramedHexoriumBlock(BlockFramedHexoriumBlock.ID + "Yellow");
        GameRegistry.registerBlock(blockFramedHexoriumBlockYellow, BlockFramedHexoriumBlock.ID + "Yellow");
        blockFramedHexoriumBlockLime = new BlockFramedHexoriumBlock(BlockFramedHexoriumBlock.ID + "Lime");
        GameRegistry.registerBlock(blockFramedHexoriumBlockLime, BlockFramedHexoriumBlock.ID + "Lime");
        blockFramedHexoriumBlockGreen = new BlockFramedHexoriumBlock(BlockFramedHexoriumBlock.ID + "Green");
        GameRegistry.registerBlock(blockFramedHexoriumBlockGreen, BlockFramedHexoriumBlock.ID + "Green");
        blockFramedHexoriumBlockTurquoise = new BlockFramedHexoriumBlock(BlockFramedHexoriumBlock.ID + "Turquoise");
        GameRegistry.registerBlock(blockFramedHexoriumBlockTurquoise, BlockFramedHexoriumBlock.ID + "Turquoise");
        blockFramedHexoriumBlockCyan = new BlockFramedHexoriumBlock(BlockFramedHexoriumBlock.ID + "Cyan");
        GameRegistry.registerBlock(blockFramedHexoriumBlockCyan, BlockFramedHexoriumBlock.ID + "Cyan");
        blockFramedHexoriumBlockSkyBlue = new BlockFramedHexoriumBlock(BlockFramedHexoriumBlock.ID + "SkyBlue");
        GameRegistry.registerBlock(blockFramedHexoriumBlockSkyBlue, BlockFramedHexoriumBlock.ID + "SkyBlue");
        blockFramedHexoriumBlockBlue = new BlockFramedHexoriumBlock(BlockFramedHexoriumBlock.ID + "Blue");
        GameRegistry.registerBlock(blockFramedHexoriumBlockBlue, BlockFramedHexoriumBlock.ID + "Blue");
        blockFramedHexoriumBlockPurple = new BlockFramedHexoriumBlock(BlockFramedHexoriumBlock.ID + "Purple");
        GameRegistry.registerBlock(blockFramedHexoriumBlockPurple, BlockFramedHexoriumBlock.ID + "Purple");
        blockFramedHexoriumBlockMagenta = new BlockFramedHexoriumBlock(BlockFramedHexoriumBlock.ID + "Magenta");
        GameRegistry.registerBlock(blockFramedHexoriumBlockMagenta, BlockFramedHexoriumBlock.ID + "Magenta");
        blockFramedHexoriumBlockPink = new BlockFramedHexoriumBlock(BlockFramedHexoriumBlock.ID + "Pink");
        GameRegistry.registerBlock(blockFramedHexoriumBlockPink, BlockFramedHexoriumBlock.ID + "Pink");

        blockFramedHexoriumBlockWhite = new BlockFramedHexoriumBlock(BlockFramedHexoriumBlock.ID + "White");
        GameRegistry.registerBlock(blockFramedHexoriumBlockWhite, BlockFramedHexoriumBlock.ID + "White");
        blockFramedHexoriumBlockLightGray = new BlockFramedHexoriumBlock(BlockFramedHexoriumBlock.ID + "LightGray");
        GameRegistry.registerBlock(blockFramedHexoriumBlockLightGray, BlockFramedHexoriumBlock.ID + "LightGray");
        blockFramedHexoriumBlockGray = new BlockFramedHexoriumBlock(BlockFramedHexoriumBlock.ID + "Gray");
        GameRegistry.registerBlock(blockFramedHexoriumBlockGray, BlockFramedHexoriumBlock.ID + "Gray");
        blockFramedHexoriumBlockDarkGray = new BlockFramedHexoriumBlock(BlockFramedHexoriumBlock.ID + "DarkGray");
        GameRegistry.registerBlock(blockFramedHexoriumBlockDarkGray, BlockFramedHexoriumBlock.ID + "DarkGray");
        blockFramedHexoriumBlockBlack = new BlockFramedHexoriumBlock(BlockFramedHexoriumBlock.ID + "Black");
        GameRegistry.registerBlock(blockFramedHexoriumBlockBlack, BlockFramedHexoriumBlock.ID + "Black");

        blockFramedHexoriumBlockRainbow = new BlockFramedHexoriumBlock(BlockFramedHexoriumBlock.ID + "Rainbow");
        GameRegistry.registerBlock(blockFramedHexoriumBlockRainbow, BlockFramedHexoriumBlock.ID + "Rainbow");

        // Plated Hexorium Block
        blockPlatedHexoriumBlockRed = new BlockPlatedHexoriumBlock(BlockPlatedHexoriumBlock.ID + "Red");
        GameRegistry.registerBlock(blockPlatedHexoriumBlockRed, BlockPlatedHexoriumBlock.ID + "Red");
        blockPlatedHexoriumBlockOrange = new BlockPlatedHexoriumBlock(BlockPlatedHexoriumBlock.ID + "Orange");
        GameRegistry.registerBlock(blockPlatedHexoriumBlockOrange, BlockPlatedHexoriumBlock.ID + "Orange");
        blockPlatedHexoriumBlockYellow = new BlockPlatedHexoriumBlock(BlockPlatedHexoriumBlock.ID + "Yellow");
        GameRegistry.registerBlock(blockPlatedHexoriumBlockYellow, BlockPlatedHexoriumBlock.ID + "Yellow");
        blockPlatedHexoriumBlockLime = new BlockPlatedHexoriumBlock(BlockPlatedHexoriumBlock.ID + "Lime");
        GameRegistry.registerBlock(blockPlatedHexoriumBlockLime, BlockPlatedHexoriumBlock.ID + "Lime");
        blockPlatedHexoriumBlockGreen = new BlockPlatedHexoriumBlock(BlockPlatedHexoriumBlock.ID + "Green");
        GameRegistry.registerBlock(blockPlatedHexoriumBlockGreen, BlockPlatedHexoriumBlock.ID + "Green");
        blockPlatedHexoriumBlockTurquoise = new BlockPlatedHexoriumBlock(BlockPlatedHexoriumBlock.ID + "Turquoise");
        GameRegistry.registerBlock(blockPlatedHexoriumBlockTurquoise, BlockPlatedHexoriumBlock.ID + "Turquoise");
        blockPlatedHexoriumBlockCyan = new BlockPlatedHexoriumBlock(BlockPlatedHexoriumBlock.ID + "Cyan");
        GameRegistry.registerBlock(blockPlatedHexoriumBlockCyan, BlockPlatedHexoriumBlock.ID + "Cyan");
        blockPlatedHexoriumBlockSkyBlue = new BlockPlatedHexoriumBlock(BlockPlatedHexoriumBlock.ID + "SkyBlue");
        GameRegistry.registerBlock(blockPlatedHexoriumBlockSkyBlue, BlockPlatedHexoriumBlock.ID + "SkyBlue");
        blockPlatedHexoriumBlockBlue = new BlockPlatedHexoriumBlock(BlockPlatedHexoriumBlock.ID + "Blue");
        GameRegistry.registerBlock(blockPlatedHexoriumBlockBlue, BlockPlatedHexoriumBlock.ID + "Blue");
        blockPlatedHexoriumBlockPurple = new BlockPlatedHexoriumBlock(BlockPlatedHexoriumBlock.ID + "Purple");
        GameRegistry.registerBlock(blockPlatedHexoriumBlockPurple, BlockPlatedHexoriumBlock.ID + "Purple");
        blockPlatedHexoriumBlockMagenta = new BlockPlatedHexoriumBlock(BlockPlatedHexoriumBlock.ID + "Magenta");
        GameRegistry.registerBlock(blockPlatedHexoriumBlockMagenta, BlockPlatedHexoriumBlock.ID + "Magenta");
        blockPlatedHexoriumBlockPink = new BlockPlatedHexoriumBlock(BlockPlatedHexoriumBlock.ID + "Pink");
        GameRegistry.registerBlock(blockPlatedHexoriumBlockPink, BlockPlatedHexoriumBlock.ID + "Pink");

        blockPlatedHexoriumBlockWhite = new BlockPlatedHexoriumBlock(BlockPlatedHexoriumBlock.ID + "White");
        GameRegistry.registerBlock(blockPlatedHexoriumBlockWhite, BlockPlatedHexoriumBlock.ID + "White");
        blockPlatedHexoriumBlockLightGray = new BlockPlatedHexoriumBlock(BlockPlatedHexoriumBlock.ID + "LightGray");
        GameRegistry.registerBlock(blockPlatedHexoriumBlockLightGray, BlockPlatedHexoriumBlock.ID + "LightGray");
        blockPlatedHexoriumBlockGray = new BlockPlatedHexoriumBlock(BlockPlatedHexoriumBlock.ID + "Gray");
        GameRegistry.registerBlock(blockPlatedHexoriumBlockGray, BlockPlatedHexoriumBlock.ID + "Gray");
        blockPlatedHexoriumBlockDarkGray = new BlockPlatedHexoriumBlock(BlockPlatedHexoriumBlock.ID + "DarkGray");
        GameRegistry.registerBlock(blockPlatedHexoriumBlockDarkGray, BlockPlatedHexoriumBlock.ID + "DarkGray");
        blockPlatedHexoriumBlockBlack = new BlockPlatedHexoriumBlock(BlockPlatedHexoriumBlock.ID + "Black");
        GameRegistry.registerBlock(blockPlatedHexoriumBlockBlack, BlockPlatedHexoriumBlock.ID + "Black");

        blockPlatedHexoriumBlockRainbow = new BlockPlatedHexoriumBlock(BlockPlatedHexoriumBlock.ID + "Rainbow");
        GameRegistry.registerBlock(blockPlatedHexoriumBlockRainbow, BlockPlatedHexoriumBlock.ID + "Rainbow");

        // Concentric Hexorium Block
        blockConcentricHexoriumBlockRed = new BlockConcentricHexoriumBlock(BlockConcentricHexoriumBlock.ID + "Red");
        GameRegistry.registerBlock(blockConcentricHexoriumBlockRed, BlockConcentricHexoriumBlock.ID + "Red");
        blockConcentricHexoriumBlockOrange = new BlockConcentricHexoriumBlock(BlockConcentricHexoriumBlock.ID + "Orange");
        GameRegistry.registerBlock(blockConcentricHexoriumBlockOrange, BlockConcentricHexoriumBlock.ID + "Orange");
        blockConcentricHexoriumBlockYellow = new BlockConcentricHexoriumBlock(BlockConcentricHexoriumBlock.ID + "Yellow");
        GameRegistry.registerBlock(blockConcentricHexoriumBlockYellow, BlockConcentricHexoriumBlock.ID + "Yellow");
        blockConcentricHexoriumBlockLime = new BlockConcentricHexoriumBlock(BlockConcentricHexoriumBlock.ID + "Lime");
        GameRegistry.registerBlock(blockConcentricHexoriumBlockLime, BlockConcentricHexoriumBlock.ID + "Lime");
        blockConcentricHexoriumBlockGreen = new BlockConcentricHexoriumBlock(BlockConcentricHexoriumBlock.ID + "Green");
        GameRegistry.registerBlock(blockConcentricHexoriumBlockGreen, BlockConcentricHexoriumBlock.ID + "Green");
        blockConcentricHexoriumBlockTurquoise = new BlockConcentricHexoriumBlock(BlockConcentricHexoriumBlock.ID + "Turquoise");
        GameRegistry.registerBlock(blockConcentricHexoriumBlockTurquoise, BlockConcentricHexoriumBlock.ID + "Turquoise");
        blockConcentricHexoriumBlockCyan = new BlockConcentricHexoriumBlock(BlockConcentricHexoriumBlock.ID + "Cyan");
        GameRegistry.registerBlock(blockConcentricHexoriumBlockCyan, BlockConcentricHexoriumBlock.ID + "Cyan");
        blockConcentricHexoriumBlockSkyBlue = new BlockConcentricHexoriumBlock(BlockConcentricHexoriumBlock.ID + "SkyBlue");
        GameRegistry.registerBlock(blockConcentricHexoriumBlockSkyBlue, BlockConcentricHexoriumBlock.ID + "SkyBlue");
        blockConcentricHexoriumBlockBlue = new BlockConcentricHexoriumBlock(BlockConcentricHexoriumBlock.ID + "Blue");
        GameRegistry.registerBlock(blockConcentricHexoriumBlockBlue, BlockConcentricHexoriumBlock.ID + "Blue");
        blockConcentricHexoriumBlockPurple = new BlockConcentricHexoriumBlock(BlockConcentricHexoriumBlock.ID + "Purple");
        GameRegistry.registerBlock(blockConcentricHexoriumBlockPurple, BlockConcentricHexoriumBlock.ID + "Purple");
        blockConcentricHexoriumBlockMagenta = new BlockConcentricHexoriumBlock(BlockConcentricHexoriumBlock.ID + "Magenta");
        GameRegistry.registerBlock(blockConcentricHexoriumBlockMagenta, BlockConcentricHexoriumBlock.ID + "Magenta");
        blockConcentricHexoriumBlockPink = new BlockConcentricHexoriumBlock(BlockConcentricHexoriumBlock.ID + "Pink");
        GameRegistry.registerBlock(blockConcentricHexoriumBlockPink, BlockConcentricHexoriumBlock.ID + "Pink");

        blockConcentricHexoriumBlockWhite = new BlockConcentricHexoriumBlock(BlockConcentricHexoriumBlock.ID + "White");
        GameRegistry.registerBlock(blockConcentricHexoriumBlockWhite, BlockConcentricHexoriumBlock.ID + "White");
        blockConcentricHexoriumBlockLightGray = new BlockConcentricHexoriumBlock(BlockConcentricHexoriumBlock.ID + "LightGray");
        GameRegistry.registerBlock(blockConcentricHexoriumBlockLightGray, BlockConcentricHexoriumBlock.ID + "LightGray");
        blockConcentricHexoriumBlockGray = new BlockConcentricHexoriumBlock(BlockConcentricHexoriumBlock.ID + "Gray");
        GameRegistry.registerBlock(blockConcentricHexoriumBlockGray, BlockConcentricHexoriumBlock.ID + "Gray");
        blockConcentricHexoriumBlockDarkGray = new BlockConcentricHexoriumBlock(BlockConcentricHexoriumBlock.ID + "DarkGray");
        GameRegistry.registerBlock(blockConcentricHexoriumBlockDarkGray, BlockConcentricHexoriumBlock.ID + "DarkGray");
        blockConcentricHexoriumBlockBlack = new BlockConcentricHexoriumBlock(BlockConcentricHexoriumBlock.ID + "Black");
        GameRegistry.registerBlock(blockConcentricHexoriumBlockBlack, BlockConcentricHexoriumBlock.ID + "Black");

        blockConcentricHexoriumBlockRainbow = new BlockConcentricHexoriumBlock(BlockConcentricHexoriumBlock.ID + "Rainbow");
        GameRegistry.registerBlock(blockConcentricHexoriumBlockRainbow, BlockConcentricHexoriumBlock.ID + "Rainbow");

        // Glowing Hexorium Glass
        blockGlowingHexoriumGlassRed = new BlockGlowingHexoriumGlass(BlockGlowingHexoriumGlass.ID + "Red");
        GameRegistry.registerBlock(blockGlowingHexoriumGlassRed, BlockGlowingHexoriumGlass.ID + "Red");
        blockGlowingHexoriumGlassOrange = new BlockGlowingHexoriumGlass(BlockGlowingHexoriumGlass.ID + "Orange");
        GameRegistry.registerBlock(blockGlowingHexoriumGlassOrange, BlockGlowingHexoriumGlass.ID + "Orange");
        blockGlowingHexoriumGlassYellow = new BlockGlowingHexoriumGlass(BlockGlowingHexoriumGlass.ID + "Yellow");
        GameRegistry.registerBlock(blockGlowingHexoriumGlassYellow, BlockGlowingHexoriumGlass.ID + "Yellow");
        blockGlowingHexoriumGlassLime = new BlockGlowingHexoriumGlass(BlockGlowingHexoriumGlass.ID + "Lime");
        GameRegistry.registerBlock(blockGlowingHexoriumGlassLime, BlockGlowingHexoriumGlass.ID + "Lime");
        blockGlowingHexoriumGlassGreen = new BlockGlowingHexoriumGlass(BlockGlowingHexoriumGlass.ID + "Green");
        GameRegistry.registerBlock(blockGlowingHexoriumGlassGreen, BlockGlowingHexoriumGlass.ID + "Green");
        blockGlowingHexoriumGlassTurquoise = new BlockGlowingHexoriumGlass(BlockGlowingHexoriumGlass.ID + "Turquoise");
        GameRegistry.registerBlock(blockGlowingHexoriumGlassTurquoise, BlockGlowingHexoriumGlass.ID + "Turquoise");
        blockGlowingHexoriumGlassCyan = new BlockGlowingHexoriumGlass(BlockGlowingHexoriumGlass.ID + "Cyan");
        GameRegistry.registerBlock(blockGlowingHexoriumGlassCyan, BlockGlowingHexoriumGlass.ID + "Cyan");
        blockGlowingHexoriumGlassSkyBlue = new BlockGlowingHexoriumGlass(BlockGlowingHexoriumGlass.ID + "SkyBlue");
        GameRegistry.registerBlock(blockGlowingHexoriumGlassSkyBlue, BlockGlowingHexoriumGlass.ID + "SkyBlue");
        blockGlowingHexoriumGlassBlue = new BlockGlowingHexoriumGlass(BlockGlowingHexoriumGlass.ID + "Blue");
        GameRegistry.registerBlock(blockGlowingHexoriumGlassBlue, BlockGlowingHexoriumGlass.ID + "Blue");
        blockGlowingHexoriumGlassPurple = new BlockGlowingHexoriumGlass(BlockGlowingHexoriumGlass.ID + "Purple");
        GameRegistry.registerBlock(blockGlowingHexoriumGlassPurple, BlockGlowingHexoriumGlass.ID + "Purple");
        blockGlowingHexoriumGlassMagenta = new BlockGlowingHexoriumGlass(BlockGlowingHexoriumGlass.ID + "Magenta");
        GameRegistry.registerBlock(blockGlowingHexoriumGlassMagenta, BlockGlowingHexoriumGlass.ID + "Magenta");
        blockGlowingHexoriumGlassPink = new BlockGlowingHexoriumGlass(BlockGlowingHexoriumGlass.ID + "Pink");
        GameRegistry.registerBlock(blockGlowingHexoriumGlassPink, BlockGlowingHexoriumGlass.ID + "Pink");

        blockGlowingHexoriumGlassWhite = new BlockGlowingHexoriumGlass(BlockGlowingHexoriumGlass.ID + "White");
        GameRegistry.registerBlock(blockGlowingHexoriumGlassWhite, BlockGlowingHexoriumGlass.ID + "White");
        blockGlowingHexoriumGlassLightGray = new BlockGlowingHexoriumGlass(BlockGlowingHexoriumGlass.ID + "LightGray");
        GameRegistry.registerBlock(blockGlowingHexoriumGlassLightGray, BlockGlowingHexoriumGlass.ID + "LightGray");
        blockGlowingHexoriumGlassGray = new BlockGlowingHexoriumGlass(BlockGlowingHexoriumGlass.ID + "Gray");
        GameRegistry.registerBlock(blockGlowingHexoriumGlassGray, BlockGlowingHexoriumGlass.ID + "Gray");
        blockGlowingHexoriumGlassDarkGray = new BlockGlowingHexoriumGlass(BlockGlowingHexoriumGlass.ID + "DarkGray");
        GameRegistry.registerBlock(blockGlowingHexoriumGlassDarkGray, BlockGlowingHexoriumGlass.ID + "DarkGray");
        blockGlowingHexoriumGlassBlack = new BlockGlowingHexoriumGlass(BlockGlowingHexoriumGlass.ID + "Black");
        GameRegistry.registerBlock(blockGlowingHexoriumGlassBlack, BlockGlowingHexoriumGlass.ID + "Black");
        
        // Energized Hexorium Monolith
        blockEnergizedHexoriumMonolithRed = new BlockEnergizedHexoriumMonolith(BlockEnergizedHexoriumMonolith.ID + "Red");
        GameRegistry.registerBlock(blockEnergizedHexoriumMonolithRed, BlockEnergizedHexoriumMonolith.ID + "Red");
        blockEnergizedHexoriumMonolithOrange = new BlockEnergizedHexoriumMonolith(BlockEnergizedHexoriumMonolith.ID + "Orange");
        GameRegistry.registerBlock(blockEnergizedHexoriumMonolithOrange, BlockEnergizedHexoriumMonolith.ID + "Orange");
        blockEnergizedHexoriumMonolithYellow = new BlockEnergizedHexoriumMonolith(BlockEnergizedHexoriumMonolith.ID + "Yellow");
        GameRegistry.registerBlock(blockEnergizedHexoriumMonolithYellow, BlockEnergizedHexoriumMonolith.ID + "Yellow");
        blockEnergizedHexoriumMonolithLime = new BlockEnergizedHexoriumMonolith(BlockEnergizedHexoriumMonolith.ID + "Lime");
        GameRegistry.registerBlock(blockEnergizedHexoriumMonolithLime, BlockEnergizedHexoriumMonolith.ID + "Lime");
        blockEnergizedHexoriumMonolithGreen = new BlockEnergizedHexoriumMonolith(BlockEnergizedHexoriumMonolith.ID + "Green");
        GameRegistry.registerBlock(blockEnergizedHexoriumMonolithGreen, BlockEnergizedHexoriumMonolith.ID + "Green");
        blockEnergizedHexoriumMonolithTurquoise = new BlockEnergizedHexoriumMonolith(BlockEnergizedHexoriumMonolith.ID + "Turquoise");
        GameRegistry.registerBlock(blockEnergizedHexoriumMonolithTurquoise, BlockEnergizedHexoriumMonolith.ID + "Turquoise");
        blockEnergizedHexoriumMonolithCyan = new BlockEnergizedHexoriumMonolith(BlockEnergizedHexoriumMonolith.ID + "Cyan");
        GameRegistry.registerBlock(blockEnergizedHexoriumMonolithCyan, BlockEnergizedHexoriumMonolith.ID + "Cyan");
        blockEnergizedHexoriumMonolithSkyBlue = new BlockEnergizedHexoriumMonolith(BlockEnergizedHexoriumMonolith.ID + "SkyBlue");
        GameRegistry.registerBlock(blockEnergizedHexoriumMonolithSkyBlue, BlockEnergizedHexoriumMonolith.ID + "SkyBlue");
        blockEnergizedHexoriumMonolithBlue = new BlockEnergizedHexoriumMonolith(BlockEnergizedHexoriumMonolith.ID + "Blue");
        GameRegistry.registerBlock(blockEnergizedHexoriumMonolithBlue, BlockEnergizedHexoriumMonolith.ID + "Blue");
        blockEnergizedHexoriumMonolithPurple = new BlockEnergizedHexoriumMonolith(BlockEnergizedHexoriumMonolith.ID + "Purple");
        GameRegistry.registerBlock(blockEnergizedHexoriumMonolithPurple, BlockEnergizedHexoriumMonolith.ID + "Purple");
        blockEnergizedHexoriumMonolithMagenta = new BlockEnergizedHexoriumMonolith(BlockEnergizedHexoriumMonolith.ID + "Magenta");
        GameRegistry.registerBlock(blockEnergizedHexoriumMonolithMagenta, BlockEnergizedHexoriumMonolith.ID + "Magenta");
        blockEnergizedHexoriumMonolithPink = new BlockEnergizedHexoriumMonolith(BlockEnergizedHexoriumMonolith.ID + "Pink");
        GameRegistry.registerBlock(blockEnergizedHexoriumMonolithPink, BlockEnergizedHexoriumMonolith.ID + "Pink");

        blockEnergizedHexoriumMonolithWhite = new BlockEnergizedHexoriumMonolith(BlockEnergizedHexoriumMonolith.ID + "White");
        GameRegistry.registerBlock(blockEnergizedHexoriumMonolithWhite, BlockEnergizedHexoriumMonolith.ID + "White");
        blockEnergizedHexoriumMonolithLightGray = new BlockEnergizedHexoriumMonolith(BlockEnergizedHexoriumMonolith.ID + "LightGray");
        GameRegistry.registerBlock(blockEnergizedHexoriumMonolithLightGray, BlockEnergizedHexoriumMonolith.ID + "LightGray");
        blockEnergizedHexoriumMonolithGray = new BlockEnergizedHexoriumMonolith(BlockEnergizedHexoriumMonolith.ID + "Gray");
        GameRegistry.registerBlock(blockEnergizedHexoriumMonolithGray, BlockEnergizedHexoriumMonolith.ID + "Gray");
        blockEnergizedHexoriumMonolithDarkGray = new BlockEnergizedHexoriumMonolith(BlockEnergizedHexoriumMonolith.ID + "DarkGray");
        GameRegistry.registerBlock(blockEnergizedHexoriumMonolithDarkGray, BlockEnergizedHexoriumMonolith.ID + "DarkGray");
        blockEnergizedHexoriumMonolithBlack = new BlockEnergizedHexoriumMonolith(BlockEnergizedHexoriumMonolith.ID + "Black");
        GameRegistry.registerBlock(blockEnergizedHexoriumMonolithBlack, BlockEnergizedHexoriumMonolith.ID + "Black");

        blockEnergizedHexoriumMonolithRainbow = new BlockEnergizedHexoriumMonolith(BlockEnergizedHexoriumMonolith.ID + "Rainbow");
        GameRegistry.registerBlock(blockEnergizedHexoriumMonolithRainbow, BlockEnergizedHexoriumMonolith.ID + "Rainbow");

        // Hexorium Lamp
        blockHexoriumLampRed = new BlockHexoriumLamp(BlockHexoriumLamp.ID + "Red");
        GameRegistry.registerBlock(blockHexoriumLampRed, BlockHexoriumLamp.ID + "Red");
        blockHexoriumLampOrange = new BlockHexoriumLamp(BlockHexoriumLamp.ID + "Orange");
        GameRegistry.registerBlock(blockHexoriumLampOrange, BlockHexoriumLamp.ID + "Orange");
        blockHexoriumLampYellow = new BlockHexoriumLamp(BlockHexoriumLamp.ID + "Yellow");
        GameRegistry.registerBlock(blockHexoriumLampYellow, BlockHexoriumLamp.ID + "Yellow");
        blockHexoriumLampLime = new BlockHexoriumLamp(BlockHexoriumLamp.ID + "Lime");
        GameRegistry.registerBlock(blockHexoriumLampLime, BlockHexoriumLamp.ID + "Lime");
        blockHexoriumLampGreen = new BlockHexoriumLamp(BlockHexoriumLamp.ID + "Green");
        GameRegistry.registerBlock(blockHexoriumLampGreen, BlockHexoriumLamp.ID + "Green");
        blockHexoriumLampTurquoise = new BlockHexoriumLamp(BlockHexoriumLamp.ID + "Turquoise");
        GameRegistry.registerBlock(blockHexoriumLampTurquoise, BlockHexoriumLamp.ID + "Turquoise");
        blockHexoriumLampCyan = new BlockHexoriumLamp(BlockHexoriumLamp.ID + "Cyan");
        GameRegistry.registerBlock(blockHexoriumLampCyan, BlockHexoriumLamp.ID + "Cyan");
        blockHexoriumLampSkyBlue = new BlockHexoriumLamp(BlockHexoriumLamp.ID + "SkyBlue");
        GameRegistry.registerBlock(blockHexoriumLampSkyBlue, BlockHexoriumLamp.ID + "SkyBlue");
        blockHexoriumLampBlue = new BlockHexoriumLamp(BlockHexoriumLamp.ID + "Blue");
        GameRegistry.registerBlock(blockHexoriumLampBlue, BlockHexoriumLamp.ID + "Blue");
        blockHexoriumLampPurple = new BlockHexoriumLamp(BlockHexoriumLamp.ID + "Purple");
        GameRegistry.registerBlock(blockHexoriumLampPurple, BlockHexoriumLamp.ID + "Purple");
        blockHexoriumLampMagenta = new BlockHexoriumLamp(BlockHexoriumLamp.ID + "Magenta");
        GameRegistry.registerBlock(blockHexoriumLampMagenta, BlockHexoriumLamp.ID + "Magenta");
        blockHexoriumLampPink = new BlockHexoriumLamp(BlockHexoriumLamp.ID + "Pink");
        GameRegistry.registerBlock(blockHexoriumLampPink, BlockHexoriumLamp.ID + "Pink");

        blockHexoriumLampWhite = new BlockHexoriumLamp(BlockHexoriumLamp.ID + "White");
        GameRegistry.registerBlock(blockHexoriumLampWhite, BlockHexoriumLamp.ID + "White");
        blockHexoriumLampLightGray = new BlockHexoriumLamp(BlockHexoriumLamp.ID + "LightGray");
        GameRegistry.registerBlock(blockHexoriumLampLightGray, BlockHexoriumLamp.ID + "LightGray");
        blockHexoriumLampGray = new BlockHexoriumLamp(BlockHexoriumLamp.ID + "Gray");
        GameRegistry.registerBlock(blockHexoriumLampGray, BlockHexoriumLamp.ID + "Gray");
        blockHexoriumLampDarkGray = new BlockHexoriumLamp(BlockHexoriumLamp.ID + "DarkGray");
        GameRegistry.registerBlock(blockHexoriumLampDarkGray, BlockHexoriumLamp.ID + "DarkGray");
        blockHexoriumLampBlack = new BlockHexoriumLamp(BlockHexoriumLamp.ID + "Black");
        GameRegistry.registerBlock(blockHexoriumLampBlack, BlockHexoriumLamp.ID + "Black");

        blockHexoriumLampRainbow = new BlockHexoriumLamp(BlockHexoriumLamp.ID + "Rainbow");
        GameRegistry.registerBlock(blockHexoriumLampRainbow, BlockHexoriumLamp.ID + "Rainbow");

        // Inverted Hexorium Lamp
        blockHexoriumLampInvRed = new BlockHexoriumLampInv(BlockHexoriumLampInv.ID + "Red");
        GameRegistry.registerBlock(blockHexoriumLampInvRed, BlockHexoriumLampInv.ID + "Red");
        blockHexoriumLampInvOrange = new BlockHexoriumLampInv(BlockHexoriumLampInv.ID + "Orange");
        GameRegistry.registerBlock(blockHexoriumLampInvOrange, BlockHexoriumLampInv.ID + "Orange");
        blockHexoriumLampInvYellow = new BlockHexoriumLampInv(BlockHexoriumLampInv.ID + "Yellow");
        GameRegistry.registerBlock(blockHexoriumLampInvYellow, BlockHexoriumLampInv.ID + "Yellow");
        blockHexoriumLampInvLime = new BlockHexoriumLampInv(BlockHexoriumLampInv.ID + "Lime");
        GameRegistry.registerBlock(blockHexoriumLampInvLime, BlockHexoriumLampInv.ID + "Lime");
        blockHexoriumLampInvGreen = new BlockHexoriumLampInv(BlockHexoriumLampInv.ID + "Green");
        GameRegistry.registerBlock(blockHexoriumLampInvGreen, BlockHexoriumLampInv.ID + "Green");
        blockHexoriumLampInvTurquoise = new BlockHexoriumLampInv(BlockHexoriumLampInv.ID + "Turquoise");
        GameRegistry.registerBlock(blockHexoriumLampInvTurquoise, BlockHexoriumLampInv.ID + "Turquoise");
        blockHexoriumLampInvCyan = new BlockHexoriumLampInv(BlockHexoriumLampInv.ID + "Cyan");
        GameRegistry.registerBlock(blockHexoriumLampInvCyan, BlockHexoriumLampInv.ID + "Cyan");
        blockHexoriumLampInvSkyBlue = new BlockHexoriumLampInv(BlockHexoriumLampInv.ID + "SkyBlue");
        GameRegistry.registerBlock(blockHexoriumLampInvSkyBlue, BlockHexoriumLampInv.ID + "SkyBlue");
        blockHexoriumLampInvBlue = new BlockHexoriumLampInv(BlockHexoriumLampInv.ID + "Blue");
        GameRegistry.registerBlock(blockHexoriumLampInvBlue, BlockHexoriumLampInv.ID + "Blue");
        blockHexoriumLampInvPurple = new BlockHexoriumLampInv(BlockHexoriumLampInv.ID + "Purple");
        GameRegistry.registerBlock(blockHexoriumLampInvPurple, BlockHexoriumLampInv.ID + "Purple");
        blockHexoriumLampInvMagenta = new BlockHexoriumLampInv(BlockHexoriumLampInv.ID + "Magenta");
        GameRegistry.registerBlock(blockHexoriumLampInvMagenta, BlockHexoriumLampInv.ID + "Magenta");
        blockHexoriumLampInvPink = new BlockHexoriumLampInv(BlockHexoriumLampInv.ID + "Pink");
        GameRegistry.registerBlock(blockHexoriumLampInvPink, BlockHexoriumLampInv.ID + "Pink");

        blockHexoriumLampInvWhite = new BlockHexoriumLampInv(BlockHexoriumLampInv.ID + "White");
        GameRegistry.registerBlock(blockHexoriumLampInvWhite, BlockHexoriumLampInv.ID + "White");
        blockHexoriumLampInvLightGray = new BlockHexoriumLampInv(BlockHexoriumLampInv.ID + "LightGray");
        GameRegistry.registerBlock(blockHexoriumLampInvLightGray, BlockHexoriumLampInv.ID + "LightGray");
        blockHexoriumLampInvGray = new BlockHexoriumLampInv(BlockHexoriumLampInv.ID + "Gray");
        GameRegistry.registerBlock(blockHexoriumLampInvGray, BlockHexoriumLampInv.ID + "Gray");
        blockHexoriumLampInvDarkGray = new BlockHexoriumLampInv(BlockHexoriumLampInv.ID + "DarkGray");
        GameRegistry.registerBlock(blockHexoriumLampInvDarkGray, BlockHexoriumLampInv.ID + "DarkGray");
        blockHexoriumLampInvBlack = new BlockHexoriumLampInv(BlockHexoriumLampInv.ID + "Black");
        GameRegistry.registerBlock(blockHexoriumLampInvBlack, BlockHexoriumLampInv.ID + "Black");

        blockHexoriumLampInvRainbow = new BlockHexoriumLampInv(BlockHexoriumLampInv.ID + "Rainbow");
        GameRegistry.registerBlock(blockHexoriumLampInvRainbow, BlockHexoriumLampInv.ID + "Rainbow");

        // Hexorium Door
        blockHexoriumDoorRed = new BlockHexoriumDoor(BlockHexoriumDoor.ID + "Red");
        GameRegistry.registerBlock(blockHexoriumDoorRed, BlockHexoriumDoor.ID + "Red");
        blockHexoriumDoorOrange = new BlockHexoriumDoor(BlockHexoriumDoor.ID + "Orange");
        GameRegistry.registerBlock(blockHexoriumDoorOrange, BlockHexoriumDoor.ID + "Orange");
        blockHexoriumDoorYellow = new BlockHexoriumDoor(BlockHexoriumDoor.ID + "Yellow");
        GameRegistry.registerBlock(blockHexoriumDoorYellow, BlockHexoriumDoor.ID + "Yellow");
        blockHexoriumDoorLime = new BlockHexoriumDoor(BlockHexoriumDoor.ID + "Lime");
        GameRegistry.registerBlock(blockHexoriumDoorLime, BlockHexoriumDoor.ID + "Lime");
        blockHexoriumDoorGreen = new BlockHexoriumDoor(BlockHexoriumDoor.ID + "Green");
        GameRegistry.registerBlock(blockHexoriumDoorGreen, BlockHexoriumDoor.ID + "Green");
        blockHexoriumDoorTurquoise = new BlockHexoriumDoor(BlockHexoriumDoor.ID + "Turquoise");
        GameRegistry.registerBlock(blockHexoriumDoorTurquoise, BlockHexoriumDoor.ID + "Turquoise");
        blockHexoriumDoorCyan = new BlockHexoriumDoor(BlockHexoriumDoor.ID + "Cyan");
        GameRegistry.registerBlock(blockHexoriumDoorCyan, BlockHexoriumDoor.ID + "Cyan");
        blockHexoriumDoorSkyBlue = new BlockHexoriumDoor(BlockHexoriumDoor.ID + "SkyBlue");
        GameRegistry.registerBlock(blockHexoriumDoorSkyBlue, BlockHexoriumDoor.ID + "SkyBlue");
        blockHexoriumDoorBlue = new BlockHexoriumDoor(BlockHexoriumDoor.ID + "Blue");
        GameRegistry.registerBlock(blockHexoriumDoorBlue, BlockHexoriumDoor.ID + "Blue");
        blockHexoriumDoorPurple = new BlockHexoriumDoor(BlockHexoriumDoor.ID + "Purple");
        GameRegistry.registerBlock(blockHexoriumDoorPurple, BlockHexoriumDoor.ID + "Purple");
        blockHexoriumDoorMagenta = new BlockHexoriumDoor(BlockHexoriumDoor.ID + "Magenta");
        GameRegistry.registerBlock(blockHexoriumDoorMagenta, BlockHexoriumDoor.ID + "Magenta");
        blockHexoriumDoorPink = new BlockHexoriumDoor(BlockHexoriumDoor.ID + "Pink");
        GameRegistry.registerBlock(blockHexoriumDoorPink, BlockHexoriumDoor.ID + "Pink");

        blockHexoriumDoorWhite = new BlockHexoriumDoor(BlockHexoriumDoor.ID + "White");
        GameRegistry.registerBlock(blockHexoriumDoorWhite, BlockHexoriumDoor.ID + "White");
        blockHexoriumDoorLightGray = new BlockHexoriumDoor(BlockHexoriumDoor.ID + "LightGray");
        GameRegistry.registerBlock(blockHexoriumDoorLightGray, BlockHexoriumDoor.ID + "LightGray");
        blockHexoriumDoorGray = new BlockHexoriumDoor(BlockHexoriumDoor.ID + "Gray");
        GameRegistry.registerBlock(blockHexoriumDoorGray, BlockHexoriumDoor.ID + "Gray");
        blockHexoriumDoorDarkGray = new BlockHexoriumDoor(BlockHexoriumDoor.ID + "DarkGray");
        GameRegistry.registerBlock(blockHexoriumDoorDarkGray, BlockHexoriumDoor.ID + "DarkGray");
        blockHexoriumDoorBlack = new BlockHexoriumDoor(BlockHexoriumDoor.ID + "Black");
        GameRegistry.registerBlock(blockHexoriumDoorBlack, BlockHexoriumDoor.ID + "Black");

        blockHexoriumDoorRainbow = new BlockHexoriumDoor(BlockHexoriumDoor.ID + "Rainbow");
        GameRegistry.registerBlock(blockHexoriumDoorRainbow, BlockHexoriumDoor.ID + "Rainbow");

        // Hexorium Hatch
        blockHexoriumHatchRed = new BlockHexoriumHatch(BlockHexoriumHatch.ID + "Red");
        GameRegistry.registerBlock(blockHexoriumHatchRed, BlockHexoriumHatch.ID + "Red");
        blockHexoriumHatchOrange = new BlockHexoriumHatch(BlockHexoriumHatch.ID + "Orange");
        GameRegistry.registerBlock(blockHexoriumHatchOrange, BlockHexoriumHatch.ID + "Orange");
        blockHexoriumHatchYellow = new BlockHexoriumHatch(BlockHexoriumHatch.ID + "Yellow");
        GameRegistry.registerBlock(blockHexoriumHatchYellow, BlockHexoriumHatch.ID + "Yellow");
        blockHexoriumHatchLime = new BlockHexoriumHatch(BlockHexoriumHatch.ID + "Lime");
        GameRegistry.registerBlock(blockHexoriumHatchLime, BlockHexoriumHatch.ID + "Lime");
        blockHexoriumHatchGreen = new BlockHexoriumHatch(BlockHexoriumHatch.ID + "Green");
        GameRegistry.registerBlock(blockHexoriumHatchGreen, BlockHexoriumHatch.ID + "Green");
        blockHexoriumHatchTurquoise = new BlockHexoriumHatch(BlockHexoriumHatch.ID + "Turquoise");
        GameRegistry.registerBlock(blockHexoriumHatchTurquoise, BlockHexoriumHatch.ID + "Turquoise");
        blockHexoriumHatchCyan = new BlockHexoriumHatch(BlockHexoriumHatch.ID + "Cyan");
        GameRegistry.registerBlock(blockHexoriumHatchCyan, BlockHexoriumHatch.ID + "Cyan");
        blockHexoriumHatchSkyBlue = new BlockHexoriumHatch(BlockHexoriumHatch.ID + "SkyBlue");
        GameRegistry.registerBlock(blockHexoriumHatchSkyBlue, BlockHexoriumHatch.ID + "SkyBlue");
        blockHexoriumHatchBlue = new BlockHexoriumHatch(BlockHexoriumHatch.ID + "Blue");
        GameRegistry.registerBlock(blockHexoriumHatchBlue, BlockHexoriumHatch.ID + "Blue");
        blockHexoriumHatchPurple = new BlockHexoriumHatch(BlockHexoriumHatch.ID + "Purple");
        GameRegistry.registerBlock(blockHexoriumHatchPurple, BlockHexoriumHatch.ID + "Purple");
        blockHexoriumHatchMagenta = new BlockHexoriumHatch(BlockHexoriumHatch.ID + "Magenta");
        GameRegistry.registerBlock(blockHexoriumHatchMagenta, BlockHexoriumHatch.ID + "Magenta");
        blockHexoriumHatchPink = new BlockHexoriumHatch(BlockHexoriumHatch.ID + "Pink");
        GameRegistry.registerBlock(blockHexoriumHatchPink, BlockHexoriumHatch.ID + "Pink");

        blockHexoriumHatchWhite = new BlockHexoriumHatch(BlockHexoriumHatch.ID + "White");
        GameRegistry.registerBlock(blockHexoriumHatchWhite, BlockHexoriumHatch.ID + "White");
        blockHexoriumHatchLightGray = new BlockHexoriumHatch(BlockHexoriumHatch.ID + "LightGray");
        GameRegistry.registerBlock(blockHexoriumHatchLightGray, BlockHexoriumHatch.ID + "LightGray");
        blockHexoriumHatchGray = new BlockHexoriumHatch(BlockHexoriumHatch.ID + "Gray");
        GameRegistry.registerBlock(blockHexoriumHatchGray, BlockHexoriumHatch.ID + "Gray");
        blockHexoriumHatchDarkGray = new BlockHexoriumHatch(BlockHexoriumHatch.ID + "DarkGray");
        GameRegistry.registerBlock(blockHexoriumHatchDarkGray, BlockHexoriumHatch.ID + "DarkGray");
        blockHexoriumHatchBlack = new BlockHexoriumHatch(BlockHexoriumHatch.ID + "Black");
        GameRegistry.registerBlock(blockHexoriumHatchBlack, BlockHexoriumHatch.ID + "Black");

        blockHexoriumHatchRainbow = new BlockHexoriumHatch(BlockHexoriumHatch.ID + "Rainbow");
        GameRegistry.registerBlock(blockHexoriumHatchRainbow, BlockHexoriumHatch.ID + "Rainbow");


        // Machines
        blockHexoriumMachineBlock = new BlockHexoriumMachineBlock(BlockHexoriumMachineBlock.ID);
        GameRegistry.registerBlock(blockHexoriumMachineBlock, BlockHexoriumMachineBlock.ID);

        blockHexoriumGenerator = new BlockHexoriumGenerator(BlockHexoriumGenerator.ID);
        GameRegistry.registerBlock(blockHexoriumGenerator, BlockHexoriumGenerator.ID);
        blockHexoriumFurnace = new BlockHexoriumFurnace(BlockHexoriumFurnace.ID);
        GameRegistry.registerBlock(blockHexoriumFurnace, BlockHexoriumFurnace.ID);
        blockCrystalSeparator = new BlockCrystalSeparator(BlockCrystalSeparator.ID);
        GameRegistry.registerBlock(blockCrystalSeparator, BlockCrystalSeparator.ID);
        blockMatrixReconstructor = new BlockMatrixReconstructor(BlockMatrixReconstructor.ID);
        GameRegistry.registerBlock(blockMatrixReconstructor, BlockMatrixReconstructor.ID);

        if (HexConfig.cfgTeleportEnable) {
            blockPersonalTeleportationPad = new BlockPersonalTeleportationPad(BlockPersonalTeleportationPad.ID);
            GameRegistry.registerBlock(blockPersonalTeleportationPad, BlockPersonalTeleportationPad.ID);
        }

        // Tank Valve
        if (HexConfig.cfgTankEnable) {
            blockTankValve = new BlockTankValve(BlockTankValve.ID);
            GameRegistry.registerBlock(blockTankValve, BlockTankValve.ID);
            blockTankRender = new BlockTankRender(BlockTankRender.ID);
            GameRegistry.registerBlock(blockTankRender, BlockTankRender.ID);
        }

        // Cables
        blockHexoriumCableRed = new BlockHexoriumCable(BlockHexoriumCable.ID + "Red");
        GameRegistry.registerBlock(blockHexoriumCableRed, BlockHexoriumCable.ID + "Red");
        blockHexoriumCableOrange = new BlockHexoriumCable(BlockHexoriumCable.ID + "Orange");
        GameRegistry.registerBlock(blockHexoriumCableOrange, BlockHexoriumCable.ID + "Orange");
        blockHexoriumCableYellow = new BlockHexoriumCable(BlockHexoriumCable.ID + "Yellow");
        GameRegistry.registerBlock(blockHexoriumCableYellow, BlockHexoriumCable.ID + "Yellow");
        blockHexoriumCableLime = new BlockHexoriumCable(BlockHexoriumCable.ID + "Lime");
        GameRegistry.registerBlock(blockHexoriumCableLime, BlockHexoriumCable.ID + "Lime");
        blockHexoriumCableGreen = new BlockHexoriumCable(BlockHexoriumCable.ID + "Green");
        GameRegistry.registerBlock(blockHexoriumCableGreen, BlockHexoriumCable.ID + "Green");
        blockHexoriumCableTurquoise = new BlockHexoriumCable(BlockHexoriumCable.ID + "Turquoise");
        GameRegistry.registerBlock(blockHexoriumCableTurquoise, BlockHexoriumCable.ID + "Turquoise");
        blockHexoriumCableCyan = new BlockHexoriumCable(BlockHexoriumCable.ID + "Cyan");
        GameRegistry.registerBlock(blockHexoriumCableCyan, BlockHexoriumCable.ID + "Cyan");
        blockHexoriumCableSkyBlue = new BlockHexoriumCable(BlockHexoriumCable.ID + "SkyBlue");
        GameRegistry.registerBlock(blockHexoriumCableSkyBlue, BlockHexoriumCable.ID + "SkyBlue");
        blockHexoriumCableBlue = new BlockHexoriumCable(BlockHexoriumCable.ID + "Blue");
        GameRegistry.registerBlock(blockHexoriumCableBlue, BlockHexoriumCable.ID + "Blue");
        blockHexoriumCablePurple = new BlockHexoriumCable(BlockHexoriumCable.ID + "Purple");
        GameRegistry.registerBlock(blockHexoriumCablePurple, BlockHexoriumCable.ID + "Purple");
        blockHexoriumCableMagenta = new BlockHexoriumCable(BlockHexoriumCable.ID + "Magenta");
        GameRegistry.registerBlock(blockHexoriumCableMagenta, BlockHexoriumCable.ID + "Magenta");
        blockHexoriumCablePink = new BlockHexoriumCable(BlockHexoriumCable.ID + "Pink");
        GameRegistry.registerBlock(blockHexoriumCablePink, BlockHexoriumCable.ID + "Pink");
        
        blockHexoriumCableWhite = new BlockHexoriumCable(BlockHexoriumCable.ID + "White");
        GameRegistry.registerBlock(blockHexoriumCableWhite, BlockHexoriumCable.ID + "White");
        blockHexoriumCableLightGray = new BlockHexoriumCable(BlockHexoriumCable.ID + "LightGray");
        GameRegistry.registerBlock(blockHexoriumCableLightGray, BlockHexoriumCable.ID + "LightGray");
        blockHexoriumCableGray = new BlockHexoriumCable(BlockHexoriumCable.ID + "Gray");
        GameRegistry.registerBlock(blockHexoriumCableGray, BlockHexoriumCable.ID + "Gray");
        blockHexoriumCableDarkGray = new BlockHexoriumCable(BlockHexoriumCable.ID + "DarkGray");
        GameRegistry.registerBlock(blockHexoriumCableDarkGray, BlockHexoriumCable.ID + "DarkGray");
        blockHexoriumCableBlack = new BlockHexoriumCable(BlockHexoriumCable.ID + "Black");
        GameRegistry.registerBlock(blockHexoriumCableBlack, BlockHexoriumCable.ID + "Black");

        blockHexoriumCableRainbow = new BlockHexoriumCable(BlockHexoriumCable.ID + "Rainbow");
        GameRegistry.registerBlock(blockHexoriumCableRainbow, BlockHexoriumCable.ID + "Rainbow");
        
        // Energy Pylon
        blockEnergyPylon = new BlockEnergyPylon(BlockEnergyPylon.ID);
        GameRegistry.registerBlock(blockEnergyPylon, BlockEnergyPylon.ID);

        // Hexorium Switch
        blockHexoriumSwitchRedGreen = new BlockHexoriumSwitch(BlockHexoriumSwitch.UNLOCALISEDNAME + "RedGreen");
        GameRegistry.registerBlock(blockHexoriumSwitchRedGreen, BlockHexoriumSwitch.UNLOCALISEDNAME + "RedGreen");
        blockHexoriumSwitchRedBlue = new BlockHexoriumSwitch(BlockHexoriumSwitch.UNLOCALISEDNAME + "RedBlue");
        GameRegistry.registerBlock(blockHexoriumSwitchRedBlue, BlockHexoriumSwitch.UNLOCALISEDNAME + "RedBlue");
        blockHexoriumSwitchRedWhite = new BlockHexoriumSwitch(BlockHexoriumSwitch.UNLOCALISEDNAME + "RedWhite");
        GameRegistry.registerBlock(blockHexoriumSwitchRedWhite, BlockHexoriumSwitch.UNLOCALISEDNAME + "RedWhite");

        // Hexorium Button
        blockHexoriumButtonRed = new BlockHexoriumButton(BlockHexoriumButton.ID + "Red");
        GameRegistry.registerBlock(blockHexoriumButtonRed, BlockHexoriumButton.ID + "Red");
        blockHexoriumButtonGreen = new BlockHexoriumButton(BlockHexoriumButton.ID + "Green");
        GameRegistry.registerBlock(blockHexoriumButtonGreen, BlockHexoriumButton.ID + "Green");
        blockHexoriumButtonBlue = new BlockHexoriumButton(BlockHexoriumButton.ID + "Blue");
        GameRegistry.registerBlock(blockHexoriumButtonBlue, BlockHexoriumButton.ID + "Blue");
        blockHexoriumButtonWhite = new BlockHexoriumButton(BlockHexoriumButton.ID + "White");
        GameRegistry.registerBlock(blockHexoriumButtonWhite, BlockHexoriumButton.ID + "White");

        // Hexorium Pressure Plate
        blockHexoriumPressurePlateRed = new BlockHexoriumPressurePlate(BlockHexoriumPressurePlate.UNLOCALISEDNAME + "Red");
        GameRegistry.registerBlock(blockHexoriumPressurePlateRed, BlockHexoriumPressurePlate.UNLOCALISEDNAME + "Red");
        blockHexoriumPressurePlateGreen = new BlockHexoriumPressurePlate(BlockHexoriumPressurePlate.UNLOCALISEDNAME + "Green");
        GameRegistry.registerBlock(blockHexoriumPressurePlateGreen, BlockHexoriumPressurePlate.UNLOCALISEDNAME + "Green");
        blockHexoriumPressurePlateBlue = new BlockHexoriumPressurePlate(BlockHexoriumPressurePlate.UNLOCALISEDNAME + "Blue");
        GameRegistry.registerBlock(blockHexoriumPressurePlateBlue, BlockHexoriumPressurePlate.UNLOCALISEDNAME + "Blue");
        blockHexoriumPressurePlateWhite = new BlockHexoriumPressurePlate(BlockHexoriumPressurePlate.UNLOCALISEDNAME + "White");
        GameRegistry.registerBlock(blockHexoriumPressurePlateWhite, BlockHexoriumPressurePlate.UNLOCALISEDNAME + "White");

        // Regular Blocks
        blockTemperedHexoriumGlass = new BlockTemperedHexoriumGlass(BlockTemperedHexoriumGlass.UNLOCALISEDNAME);
        GameRegistry.registerBlock(blockTemperedHexoriumGlass, BlockTemperedHexoriumGlass.UNLOCALISEDNAME);

        blockPylonBase51 = new BlockPylonBase(BlockPylonBase.UNLOCALISEDNAME + "51", false);
        GameRegistry.registerBlock(blockPylonBase51, BlockPylonBase.UNLOCALISEDNAME + "51");
        blockPylonBase15 = new BlockPylonBase(BlockPylonBase.UNLOCALISEDNAME + "15", true);
        GameRegistry.registerBlock(blockPylonBase15, BlockPylonBase.UNLOCALISEDNAME + "15");
    }

    public static int getMachineState(World world, int x, int y, int z) {
        return HexUtils.getMetaBitBiInt(
                META_MACHINE_STATUS_0,
                META_MACHINE_STATUS_1,
                world, x, y, z);
    }

    public static void setMachineState(int state, World world, int x, int y, int z) {
        HexUtils.setMetaBitBiInt(
                META_MACHINE_STATUS_0,
                META_MACHINE_STATUS_1,
                state, HexUtils.META_NOTIFY_UPDATE, world, x, y, z);
    }
}
