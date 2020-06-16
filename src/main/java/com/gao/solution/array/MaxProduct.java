package com.gao.solution.array;

/**
 * 乘积最大子序列
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/03/23 09:33
 **/
public class MaxProduct {

    public static int solution(int[] nums) {
        int result = nums[0];
        int max = 1;
        int min = 1;
        for (int i = 0; i < nums.length; i++) {
            int pmax = Math.max(Math.max(min * nums[i], max * nums[i]), nums[i]);
            int pmin = Math.min(Math.min(min * nums[i], max * nums[i]), nums[i]);
            max = pmax;
            min = pmin;

            result = Math.max(result, max);
        }

        return result;
    }


    public static void main(String[] args) {
//        int[] nums = {2, 3, -2, 4};
//        int[] nums = {-2,0,-1};
//        int[] nums = {0, 2};
//        int[] nums = {-4, -3};
        int[] nums = {-4, -3, -2};
        System.out.println(solution(nums));
    }
}
