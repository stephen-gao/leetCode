package com.gao.solution.others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 杨辉三角 II
 * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
 *
 *
 *
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 *
 * 示例:
 *
 * 输入: 3
 * 输出: [1,3,3,1]
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/08/14 11:14
 **/
public class yanghui2 {

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> pre = Arrays.asList(1);
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if(j == 0 || j == i){
                    list.add(1);
                }else {
                    list.add(pre.get(j-1)+pre.get(j));
                }
            }
            pre = list;
        }
        return pre;
    }

    public static void main(String[] args) {
        int index = 2;
        List<Integer> row = getRow(index);
        for (int i = 0; i < row.size(); i++) {
            System.out.println(row.get(i));
        }
    }
}
