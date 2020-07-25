package com.gao.solution.others;

import org.apache.commons.lang3.StringUtils;

/**
 * 汉明距离
 * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 * <p>
 * 给出两个整数 x 和 y，计算它们之间的汉明距离。
 * <p>
 * 注意：
 * 0 ≤ x, y < 231.
 * <p>
 * 示例:
 * <p>
 * 输入: x = 1, y = 4
 * <p>
 * 输出: 2
 * <p>
 * 解释:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 * ↑   ↑
 * <p>
 * 上面的箭头指出了对应二进制位不同的位置。
 *
 * @author GaoSheng
 * @version 1.0
 * @blame GaoSheng
 * @since 2020/06/22 20:10
 **/
public class HanmingDistance {

    public static int hammingDistance(int x, int y) {
        int count = 0;
        String sx = Integer.toBinaryString(x);
        String sy = Integer.toBinaryString(y);
        int xl = sx.length();
        int yl = sy.length();
        int l = xl >= yl ? xl : yl;
        for (int i = 0; i < l; i++) {
            char ix = '0';
            char iy = '0';
            if(xl == l){
                ix = sx.charAt(l-i-1);
                if(yl - i -1 < 0){
                    iy = '0';
                }else {
                    iy = sy.charAt(yl-i-1);
                }
            }else {
                if(xl - i -1 < 0){
                    ix = '0';
                }else {
                    ix = sx.charAt(xl-i-1);
                }
                iy = sy.charAt(l-i-1);
            }
            if(ix != iy){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int x = 0;
        int y = 10;
        String sx = Integer.toBinaryString(x);
        String sy = Integer.toBinaryString(y);
        System.out.println(StringUtils.leftPad(sx, 32, '0'));
        System.out.println(StringUtils.leftPad(sy, 32, '0'));
        System.out.println("********************");
        int distance = hammingDistance(x, y);
        System.out.println(distance);
    }
}
