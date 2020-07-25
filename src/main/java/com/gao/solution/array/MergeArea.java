package com.gao.solution.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 合并区间
 * 给出一个区间的集合，请合并所有重叠的区间。
 *
 * 示例 1:
 *
 * 输入: [[1,3],[2,6],[8,10],[15,18]]
 * 输出: [[1,6],[8,10],[15,18]]
 * 解释: 区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
 * 示例 2:
 *
 * 输入: [[1,4],[4,5]]
 * 输出: [[1,5]]
 * 解释: 区间 [1,4] 和 [4,5] 可被视为重叠区间。
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/06/29 10:49
 **/
public class MergeArea {

    public static int[][] mergeArea(int[][] intervals) {
        if(intervals.length == 0){
            return intervals;
        }
        List<int[]> list = new ArrayList<>();
        int[] startArray = new int[intervals.length];
        int[] endArray = new int[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            startArray[i] = intervals[i][0];
            endArray[i] = intervals[i][1];
        }
        Arrays.sort(startArray);
        Arrays.sort(endArray);

        int[] current = {startArray[0],endArray[0]};
        for (int i = 1; i < startArray.length; i++) {
            if(current[1] < startArray[i]){
                list.add(current);
                current = new int[]{startArray[i],endArray[i]};
            }else {
                current[1] = endArray[i];
            }
        }
        list.add(current);
        intervals = new int[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            intervals[i] = list.get(i);
        }
        return intervals;
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 4}, {4, 10}};
        int[][] mergeArea = mergeArea(intervals);
        System.out.println(mergeArea.toString());
    }
}
