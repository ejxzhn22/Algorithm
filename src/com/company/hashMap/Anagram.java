package com.company.hashMap;

import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "abaCC";
        String str2 = "Caaab";
        String answer ="";

        HashMap<Character,Integer> map1 = new HashMap<>();
        for(char ch : str1.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch, 0)+1);
        }

        HashMap<Character,Integer> map2 = new HashMap<>();
        for(char ch : str2.toCharArray()){
            map2.put(ch,map2.getOrDefault(ch, 0)+1);
        }

        for(char key : map1.keySet()){
            if( map1.get(key) == map2.get(key)){
                answer = "YES";
            }else{
                answer = "NO";
                break;
            }
        }
        System.out.println(answer);
    }
}
