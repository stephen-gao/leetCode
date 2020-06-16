package com.gao.solution.array;

import java.util.Arrays;

/**
 * 存在重复
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/03/30 19:33
 **/
public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length == 1) {
            return false;
        }

        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1] == nums[i]){
                return true;
            }
        }

        return false;
    }


//    public static boolean containsDuplicate(int[] nums) {
//        if (nums == null || nums.length == 0 || nums.length == 1) {
//            return false;
//        }
//        Set<Integer> set = new HashSet<Integer>();
//        for (int i = 0; i < nums.length; i++) {
//            if(set.contains(nums[i])){
//                return true;
//            }
//            set.add(nums[i]);
//        }
//
//        return false;
//    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
//        int[] nums = {1, 2, 3, 4};
//        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        long start = System.currentTimeMillis();
        boolean b = containsDuplicate(nums);
        long end = System.currentTimeMillis();
        System.out.println(b+ "    "+(end-start));
    }
}
