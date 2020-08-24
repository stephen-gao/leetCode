package com.gao.solution.doublePoint;

/**
 * 最大连续1的个数
 * 给定一个二进制数组， 计算其中最大连续1的个数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,1,0,1,1,1]
 * 输出: 3
 * 解释: 开头的两位和最后的三位都是连续1，所以最大连续1的个数是 3.
 * 注意：
 * <p>
 * 输入的数组只包含 0 和1。
 * 输入数组的长度是正整数，且不超过 10,000。
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/08/12 20:36
 **/
public class findMaxConsecutiveOnes {


    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                if(count > max){
                    max = count;
                }
                count = 0;
            }else {
                count++;
            }
        }
        if(count > max){
            max = count;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {};
        int i = findMaxConsecutiveOnes(nums);
        System.out.println(i);
    }
}
