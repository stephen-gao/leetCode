package com.gao.solution.queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 岛屿数量
 * 给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。
 * <p>
 * 岛屿总是被水包围，并且每座岛屿只能由水平方向或竖直方向上相邻的陆地连接形成。
 * <p>
 * 此外，你可以假设该网格的四条边均被水包围。
 * <p>
 *  
 * <p>
 * 示例 1:
 * <p>
 * 输入:
 * [
 * ['1','1','1','1','0'],
 * ['1','1','0','1','0'],
 * ['1','1','0','0','0'],
 * ['0','0','0','0','0']
 * ]
 * 输出: 1
 * 示例 2:
 * <p>
 * 输入:
 * [
 * ['1','1','0','0','0'],
 * ['1','1','0','0','0'],
 * ['0','0','1','0','0'],
 * ['0','0','0','1','1']
 * ]
 * 输出: 3
 * 解释: 每座岛屿只能由水平和/或竖直方向上相邻的陆地连接而成。
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/08/18 15:56
 **/
public class NumIslands {

    static LinkedList<Integer[]> queue = new LinkedList();

    public static int numIslands(char[][] grid) {

        int nums = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '0') {
                    continue;
                }
                Integer[] flg = {i, j};
                queue.addLast(flg);
                grid[i][j] = '0';
                nums++;
                loop(grid);
            }
        }
        return nums;
    }

    private static void loop(char[][] grid) {
        while (!queue.isEmpty()) {
            Integer[] pop = queue.pop();
            Integer[] u = {pop[0] - 1, pop[1]};
            Integer[] d = {pop[0] + 1, pop[1]};
            Integer[] l = {pop[0], pop[1] -1};
            Integer[] r = {pop[0], pop[1] +1};
            if (u[0] >= 0 && grid[u[0]][u[1]] == '1') {
                queue.addLast(u);
                grid[u[0]][u[1]] = '0';
            }
            if (d[0] < grid.length && grid[d[0]][d[1]] == '1') {
                queue.addLast(d);
                grid[d[0]][d[1]] = '0';
            }
            if (l[1] >= 0 && grid[l[0]][l[1]] == '1') {
                queue.addLast(l);
                grid[l[0]][l[1]] = '0';
            }
            if (r[1] < grid[0].length && grid[r[0]][r[1]] == '1') {
                queue.addLast(r);
                grid[r[0]][r[1]] = '0';
            }


        }
    }

    public static void main(String[] args) {
//        char[][] grid = {
//                {'1', '1', '1', '1', '0'},
//                {'1', '1', '0', '1', '0'},
//                {'1', '1', '0', '0', '0'},
//                {'0', '0', '0', '0', '0'}
//        };
//        char[][] grid = {
//                {'1','1','0','0','0'},
//                {'1','1','0','0','0'},
//                {'0','0','1','0','0'},
//                {'0','0','0','1','1'}
//        };
//        char[][] grid = {
//                {'1'},
//                {'1'}
//        };
        char[][] grid = {
                {'1', '1', '1'},
                {'0', '1', '0'},
                {'1', '1', '1'}
        };
        int islands = numIslands(grid);
        System.out.println(islands);
    }
}
