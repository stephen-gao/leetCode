package com.gao.solution.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/04/03 09:35
 **/
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer ,Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(map.get(nums[i]) != null){
                return new int[] {map.get(nums[i]),i};
            }
            int difference = target - nums[i];
            map.put(difference,i);
        }
        throw new IllegalArgumentException("not found");
    }

    public static void main(String[] args) {
        int[] nums = {-1,-2,-3,-4,-5};
        int target = -8;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
