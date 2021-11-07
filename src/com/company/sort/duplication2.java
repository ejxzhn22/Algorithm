package com.company.sort;

import java.util.Arrays;
import java.util.HashMap;

public class duplication2 {
    public static void main(String[] args) {
        int n = 8;
        int[] arr = {20,25,52,30,39,33,43,33};

        String answer = "U";
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : arr){
            if(map.containsKey(i)){
                answer = "D";
                break;
            }else{
                map. put(i, 1);
            }
        }


        System.out.println(answer);
    }
}
