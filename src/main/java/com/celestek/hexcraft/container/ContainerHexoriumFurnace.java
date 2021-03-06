package com.celestek.hexcraft.container;

import com.celestek.hexcraft.tileentity.TileHexoriumFurnace;
import com.celestek.hexcraft.util.HexUtils;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnace;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

public class ContainerHexoriumFurnace extends Container {

    // Crafter IDs
    private static final int GUI_ID_ENERGY_TOTAL_DONE_0 = 0;
    private static final int GUI_ID_ENERGY_TOTAL_DONE_1 = 1;
    private static final int GUI_ID_ENERGY_DRAINED = 2;

    private final TileHexoriumFurnace tileHexoriumFurnace;

    private int lastEnergyTotalDone;
    private int lastEnergyDrained;

    /**
     * Constructor
     */
    public ContainerHexoriumFurnace(InventoryPlayer player, TileHexoriumFurnace tileHexoriumFurnace) {
        // Save the Tile Entity.
        this.tileHexoriumFurnace = tileHexoriumFurnace;

        // Add the container slots.
        this.addSlotToContainer(new Slot(tileHexoriumFurnace, 0, 48, 35));
        addSlotToContainer(new SlotFurnace(player.player, tileHexoriumFurnace, 1, 116, 35));

        // Add container slots.
        int i;
        for(i = 0; i < 3; ++i){
            for(int j = 0; j < 9; ++j){
                this.addSlotToContainer(new Slot(player, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }

        // Add action bar slots.
        for(i = 0; i < 9; ++i){
            this.addSlotToContainer(new Slot(player, i, 8 + i * 18, 142));
        }
    }

    /**
     * Register the progress bar updates.
     */
    @Override
    public void addCraftingToCrafters(ICrafting craft) {
        super.addCraftingToCrafters(craft);

        int energyTotalDone = tileHexoriumFurnace.getGuiEnergyTotalDone();

        int[] mcEnergyTotalDone = HexUtils.intToMCInts(energyTotalDone);

        craft.sendProgressBarUpdate(this, GUI_ID_ENERGY_TOTAL_DONE_0, mcEnergyTotalDone[0]);
        craft.sendProgressBarUpdate(this, GUI_ID_ENERGY_TOTAL_DONE_1, mcEnergyTotalDone[1]);
        craft.sendProgressBarUpdate(this, GUI_ID_ENERGY_DRAINED, tileHexoriumFurnace.getGuiEnergyDrained());
    }

    /**
     * Looks for changes made in the container, sends them to every listener.
     */
    @Override
    public void detectAndSendChanges() {
        super.detectAndSendChanges();

        for (int i = 0; i < crafters.size(); i++) {
            ICrafting craft = (ICrafting) crafters.get(i);

            if (lastEnergyTotalDone != tileHexoriumFurnace.getGuiEnergyTotalDone()) {
                int energyTotalDone = tileHexoriumFurnace.getGuiEnergyTotalDone();

                int[] mcEnergyTotalDone = HexUtils.intToMCInts(energyTotalDone);

                craft.sendProgressBarUpdate(this, GUI_ID_ENERGY_TOTAL_DONE_0, mcEnergyTotalDone[0]);
                craft.sendProgressBarUpdate(this, GUI_ID_ENERGY_TOTAL_DONE_1, mcEnergyTotalDone[1]);
            }

            if (lastEnergyDrained != tileHexoriumFurnace.getGuiEnergyDrained()) {
                craft.sendProgressBarUpdate(this, GUI_ID_ENERGY_DRAINED, tileHexoriumFurnace.getGuiEnergyDrained());
            }
        }

        // Save the new values as last value.
        lastEnergyTotalDone = tileHexoriumFurnace.getGuiEnergyTotalDone();
        lastEnergyDrained = tileHexoriumFurnace.getGuiEnergyDrained();
    }

    /**
     * Called by the client to update the progress bars.
     */
    @Override
    @SideOnly(Side.CLIENT)
    public void updateProgressBar(int id, int value) {
        int[] mcEnergyTotalDone = HexUtils.intToMCInts(tileHexoriumFurnace.getGuiEnergyTotalDone());

        switch (id) {
            case GUI_ID_ENERGY_TOTAL_DONE_0:
                mcEnergyTotalDone[0] = value;
                break;
            case GUI_ID_ENERGY_TOTAL_DONE_1:
                mcEnergyTotalDone[1] = value;
                break;
            case GUI_ID_ENERGY_DRAINED:
                tileHexoriumFurnace.setGuiEnergyDrained(value);
                break;
        }

        int energyTotalDone = HexUtils.joinMCIntsToInt(mcEnergyTotalDone);

        tileHexoriumFurnace.setGuiEnergyTotalDone(energyTotalDone);
    }

    /**
     * Check if the container can be interacted with by the player.
     */
    @Override
    public boolean canInteractWith(EntityPlayer player) {
        return tileHexoriumFurnace.isUseableByPlayer(player);
    }

    /**
     * Called when a player shift-clicks on a slot. You must override this or you will crash when someone does that.
     */
    @Override
    public ItemStack transferStackInSlot(EntityPlayer player, int par2) {
        ItemStack itemStack = null;
        Slot slot = (Slot) inventorySlots.get(par2);

        if (slot != null && slot.getHasStack()) {
            ItemStack itemStack1 = slot.getStack();
            itemStack = itemStack1.copy();

            if (par2 == 1) {
                if (!mergeItemStack(itemStack1, 2, 38, true)) {
                    return null;
                }
                slot.onSlotChange(itemStack1, itemStack);
            } else if (par2 != 0) {
                if (FurnaceRecipes.smelting().getSmeltingResult(itemStack1) != null) {
                    if (!mergeItemStack(itemStack1, 0, 1, false)) {
                        return null;
                    }
                } else if(par2 >= 2 && par2 < 29) {
                    if (!mergeItemStack(itemStack1, 29, 38, false)) {
                        return null;
                    }
                } else if( par2 >= 29 && par2 < 39 && !mergeItemStack(itemStack1, 2, 29, false)) {
                    return null;
                }
            } else if(!mergeItemStack(itemStack1, 2, 38, false)) {
                return null;
            }

            if (itemStack1.stackSize == 0)
                slot.putStack(null);
            else
                slot.onSlotChanged();

            if(itemStack1.stackSize == itemStack.stackSize)
                return null;

            slot.onPickupFromSlot(player, itemStack1);
        }
        return itemStack;
    }
}
