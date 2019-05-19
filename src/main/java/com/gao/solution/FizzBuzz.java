package com.gao.solution;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList();
        for (int i=1;i<=n;i++){
            String s = "";
            if(i % 3 == 0){
                s = s + "Fizz";
            }
            if(i % 5 == 0 ){
                s = s + "Buzz";
            }
            if("".equals(s)){
                s = s + i;
            }
            list.add(s);
        }

        return list;
    }

    public static void main(String[] args) {
        List<String> list = fizzBuzz(32);

        for(int i = 0 ;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
