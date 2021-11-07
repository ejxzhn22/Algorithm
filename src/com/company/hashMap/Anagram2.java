package com.company.hashMap;

import java.util.HashMap;

public class Anagram2 {
    public static void main(String[] args) {
        String str1 = "abaCC";
        String str2 = "Caaab";
        String answer ="YES";

        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : str1.toCharArray()){
            map.put(ch,map.getOrDefault(ch, 0)+1);
        }


        for(char key : str2.toCharArray()){
            if(!map.containsKey(key) || map.get(key) == 0){
                answer = "NO";
                break;
            }
            map.put(key,map.get(key)-1);
        }
        System.out.println(answer);
    }
}
