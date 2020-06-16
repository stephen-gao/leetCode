package com.gao.solution.array;

import java.util.Arrays;

/**
 * 旋转数组
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/04/03 17:30
 **/
public class Rotate2 {

    public static void rotate(int[][] matrix) {
        int n = matrix.length / 2;
        int m = matrix.length - 1;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < m - i; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[m-j][i];
                matrix[m-j][i] = matrix[m-i][m-j];
                matrix[m-i][m-j] = matrix[j][m - i];
                matrix[j][m - i] = temp;
            }
        }
    }


    public static void main(String[] args) {
        int[][] matrix = new int[][]{
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
                { 5, 1, 9,11},
                { 2, 4, 8,10},
                {13, 3, 6, 7},
                {15,14,12,16}
        };
//              [7, 4, 1],
//              [8, 5, 2],
//              [9, 6, 3]
        rotate(matrix);
        for (int[] matrix1 : matrix) {
            System.out.println(Arrays.toString(matrix1));
        }
    }
}
