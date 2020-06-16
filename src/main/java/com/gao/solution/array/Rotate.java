package com.gao.solution.array;

/**
 * 旋转数组
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/03/30 09:04
 **/
public class Rotate {

    public static void rotate(int[] nums, int k) {
        if (k == 0 || nums == null) {
            return;
        }
        for (int i = 0; i < k; i++) {
            int temp = nums[nums.length - 1];
            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
//        int[] nums = {5, 6, 7, 1, 2, 3, 4};
        int k = 2;
        rotate(nums, k);
        System.out.println(nums[0] + " " + nums[nums.length - 1]);
    }
}
