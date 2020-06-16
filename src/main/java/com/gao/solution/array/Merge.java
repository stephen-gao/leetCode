package com.gao.solution.array;

/**
 * ...
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/06/06 17:09
 **/
public class Merge {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int index = nums1.length - 1;
        while (n > 0) {

            if(m > 0) {
                if (nums1[m - 1] > nums2[n - 1]) {
                    nums1[index] = nums1[m - 1];
                    m--;
                } else {
                    nums1[index] = nums2[n - 1];
                    n--;
                }
            }else {
                nums1[index] = nums2[n - 1];
                n--;
            }
            index--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = { 0};
        int[] nums2 = {1};
        int m = 0;
        int n = 1;
        merge(nums1, m, nums2, n);
        System.out.println(nums1);
    }
}
