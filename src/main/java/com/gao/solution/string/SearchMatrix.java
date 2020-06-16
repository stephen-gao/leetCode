package com.gao.solution.string;

/**
 * @Author gs
 * @Date created time 2019/5/24 18:38
 * @Description
 */
public class SearchMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {

        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int i_max = matrix.length;
        int j_max = matrix[0].length;
        int i = 0;
        int j = j_max - 1;
        while (i < i_max && j >= 0) {
            if (target == matrix[i][j]) {
                return true;
            } else if (target > matrix[i][j]) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        boolean b = searchMatrix(matrix, 20);
        System.out.println(b);
    }
}
