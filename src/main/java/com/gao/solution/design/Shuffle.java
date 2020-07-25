package com.gao.solution.design;

import java.util.Random;

/**
 * ...
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/06/28 17:37
 **/
public class Shuffle {

    int[] backup;

    int[] nums;

    public Shuffle(int[] nums) {
        this.backup = nums;
        this.nums = new int[backup.length];
        for (int i = 0; i < backup.length; i++) {
            this.nums[i] = backup[i];
        }
    }

    /**
     * Resets the array to its original configuration and return it.
     */
    public int[] reset() {
        nums = backup;
        return nums;
    }

    /**
     * Returns a random shuffling of the array.
     */
    public int[] shuffle() {
        Random r = new Random();
        for (int i = nums.length-1; i > 0; i--) {
            int anInt = r.nextInt(i);
            int temp = nums[i];
            nums[i] = nums[anInt];
            nums[anInt] = temp;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        Shuffle shuffle = new Shuffle(nums);
        int[] ints = shuffle.shuffle();
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ,");
        }
        System.out.println();
        int[] ints1 = shuffle.reset();
        for (int i = 0; i < ints1.length; i++) {
            System.out.print(ints1[i] + " ,");
        }
    }
}
