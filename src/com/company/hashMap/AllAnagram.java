package com.company.hashMap;

import java.util.HashMap;

public class AllAnagram {
    public static void main(String[] args) {
        String S = "bacaAacba";
        String T = "abc";

        int answer = 0;

        char[] arr = S.toCharArray();
        HashMap<Character, Integer> sMap = new HashMap<>();
        for(int i=0; i<T.length()-1; i++){
            sMap.put(arr[i], sMap.getOrDefault(arr[i],0)+1);
        }

        HashMap<Character, Integer> tMap = new HashMap<>();
        for(char ch : T.toCharArray()){
            tMap.put(ch , tMap.getOrDefault(ch, 0)+1);
        }

        int lt =0;
        for(int rt=T.length()-1; rt<S.length(); rt++){
            sMap.put(arr[rt],sMap.getOrDefault(arr[rt],0)+1);

//            int cnt =0;
//            for(char a : tMap.keySet()){
//                if(tMap.containsKey(a) && sMap.get(a)==tMap.get(a)){
//                    cnt ++;
//                }
//            }
//            if(cnt == tMap.size()){
//                answer ++;
//            }

            if(tMap.equals(sMap)){
                answer ++;
            }

            sMap.put(arr[lt], sMap.get(arr[lt])-1);
            if(sMap.get(arr[lt]) == 0){
                sMap.remove(arr[lt]);
            }
            lt++;
        }
        System.out.println(answer);
    }
}
