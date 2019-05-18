package com.gao.solution;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author gs
 * @Date created time 2019/5/18 18:38
 * @Description 快乐数
 */
public class HappyNum {

    public static boolean isHappy(int n) {
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        map.put(n,n);
        int sum = n;
        while(true){
            while (true){

            }
//            if(map.containsKey(sum)) {
//
//            }
        }

//        return false;
    }

    public static void main(String[] args) {
        boolean b = isHappy(19);
        System.out.println(b);
    }
}
