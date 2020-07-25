package com.gao.solution.array;

/**
 * 对角线遍历
 * 给定一个含有 M x N 个元素的矩阵（M 行，N 列），请以对角线遍历的顺序返回这个矩阵中的所有元素，对角线遍历如下图所示。
 * <p>
 * <p>
 * <p>
 * 示例:
 * <p>
 * 输入:
 * [
 * [ 1, 2, 3 ],
 * [ 4, 5, 6 ],
 * [ 7, 8, 9 ]
 * ]
 * <p>
 * 输出:  [1,2,4,7,5,3,6,8,9]
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/06/29 15:30
 **/
public class FindDiagonalOrder {


    public static int[] findDiagonalOrder(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[0];
        }
        int h = matrix.length;
        int w = matrix[0].length;
        int[] result = new int[h * w];
        int x = 0;
        int y = 0;
        boolean up = true;
        int index = 0;
        while (x < h || y < w) {
            if (x < h && y < w) {
                result[index++] = matrix[x][y];
            }
            if (up) {
                x--;
                y++;
            } else {
                x++;
                y--;
            }
            if (x < 0) {
                x++;
                up = false;
            }
            if (y < 0) {
                y++;
                up = true;
            }
        }

        return result;

    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 6},
                {3, 5, 7},
                {4, 2, 8}
        };
        int[] diagonalOrder = findDiagonalOrder(matrix);
        for (int i = 0; i < diagonalOrder.length; i++) {
            System.out.print(diagonalOrder[i] + " ");
        }
    }
}
