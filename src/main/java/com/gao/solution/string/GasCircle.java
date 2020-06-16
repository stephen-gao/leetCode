package com.gao.solution.string;

/**
 * @Author gs
 * @Date created time 2019/5/20 14:50
 * @Description
 */
public class GasCircle {

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int length = gas.length;
        int sum;
        for (int i = 0; i < length; i++) {
            int s = i;
            sum = 0;
            while (true) {
                sum = sum + gas[s % length];
                sum = sum - cost[s % length];
                if (sum < 0) {
                    break;
                }
                if (s != i && s % length == i) {
                    return i;
                }
                s++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
//        int[] gas = {2,3,4};
//        int[] cost = {3,4,3};
        int res = canCompleteCircuit(gas, cost);
        System.out.println(res);
    }
}
