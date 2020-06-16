package com.gao.solution.array;

import java.util.Arrays;

/**
 * 加一
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/04/02 16:50
 **/
public class PlusOne {


    public static int[] plusOne(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
//            nums[i]++;
//            nums[i] = nums[i] % 10;
//            if(nums[i] != 0 ){
//                return nums;
//            }

            if (nums[i] == 9) {
                nums[i] = 0;
            } else {
                nums[i] += 1;
                return nums;
            }
        }
        nums = new int[nums.length + 1];
        nums[0] = 1;
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {9,9,9};
        System.out.println(Arrays.toString(plusOne(nums)));
    }
}
