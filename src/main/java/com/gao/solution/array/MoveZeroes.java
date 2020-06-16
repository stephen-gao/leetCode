package com.gao.solution.array;

import java.util.Arrays;

/**
 * 移动0
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/04/02 17:13
 **/
public class MoveZeroes {

    public static int[] moveZeroes(int[] nums) {

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != j) {
                    nums[j] = nums[i];
                    nums[i] = 0;
                }
                j++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(Arrays.toString(moveZeroes(nums)));
    }
}
