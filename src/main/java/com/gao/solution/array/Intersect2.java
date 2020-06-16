package com.gao.solution.array;

import java.util.Arrays;

/**
 * 数组交集2
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/04/02 15:32
 **/
public class Intersect2 {


    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        if(nums1.length == 0 || nums2.length == 0){
            return null;
        }
        if (nums1[0] > nums2[nums2.length - 1] || nums1[nums1.length - 1] < nums2[0]) {
            return null;
        }
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                nums1[k] = nums1[i];
                i++;
                j++;
                k++;
            }

        }
        return Arrays.copyOfRange(nums1,0,k);
    }


    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] intersect = intersect(nums1, nums2);
        System.out.println(Arrays.toString(intersect));
    }
}
