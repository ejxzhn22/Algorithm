package com.company.hashMap;

import java.util.HashMap;
import java.util.Scanner;

public class ClassPresident {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = 15;
        String str = "BACBACCACCBDEDE";

        char answer = ' ';
        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        int max = Integer.MIN_VALUE;

        for(char key : map.keySet()){
            int val = map.get(key);
            if(max < val){
                max = val;
                answer = key;
            }
        }

        System.out.println(answer);
    }
}
