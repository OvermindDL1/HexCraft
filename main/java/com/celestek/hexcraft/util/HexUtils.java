package com.celestek.hexcraft.util;

/**
 * @Author CoffeePirate     <celestek@openmailbox.org>
 * @Version 0.1.0
 */

/**
 * A simple utilities class which holds methods commonly used throughout the project
 */
public class HexUtils {
    /**
     * Spilts an int into 4 bytes
     * @param i Integer to split
     * @return 4-byte array, 0th byte being the first byte in an integer
     */
    private static byte[] intToBytes(int i) {
        return new byte[] {
            (byte) (i >> 24),
            (byte) (i >> 16),
            (byte) (i >> 8),
            (byte) i};
    }

    /**
     * Returns n-th bit from an integer
     * @param num The integer in question
     * @param n which bit
     * @return Returns the bit
     */
    public static boolean getBit(int num, int n) {
        return ((num >> n) & 1) == 1;
    }

    /**
     * Sets n-th bit for the given integer
     * @param num The integer to set the bit for
     * @param n Which bit, LSB is 0
     * @param val What to set it to
     * @return Int with the n-th bit set
     */
    public static int setBit(int num, int n, boolean val) {
        if (getBit(num, n) != val) {
            int mask = (1 << n);
            return num^mask;
        }
        return num;
    }

    /**
     * Spilts a Java int into a so-called Minecraft int - iCrafting.sendProgressBarUpdate truncates
     * to short. You end up being able to send 16 bits instead of full 32.
     *
     * @param i Integer to convert to two MC integers
     * @return Array of two minecraft integers, 0th int holding first 16 bits
     */
    public static int[] intToMCInts(int i) {
        byte[] bytes = intToBytes(i);

        int[] mcInts = new int[] {
            (int) (bytes[0] << 8 | (bytes[1] & 0xFF)),
            (int) (bytes[2] << 8 | (bytes[3] & 0xFF))
        };

        return mcInts;
    }

    /**
     * Joins an array of two so-called "Minecraft Integers" into a standard Java integer
     * @param mcInts Array holding two Minecraft Integers
     * @return Java integer
     */
    public static int joinMCIntsToInt(int[] mcInts) {
        return mcInts[0] << 16 | (mcInts[1] & 0xFFFF);
    }

}
