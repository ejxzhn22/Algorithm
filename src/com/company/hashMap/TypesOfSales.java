package com.company.hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TypesOfSales {
    public static void main(String[] args) {
        int n = 7;
        int k = 4;
        int[] arr = {20,12,20,10,23,14,10};
        List<Integer> answer = new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        for(int i : arr){
            list.add(i);
        }


        int cnt = list.size();

        while(cnt >= k){
            HashMap<Integer,Integer> map = new HashMap<>();
            for( int i=0; i<k; i++){
                map.put(list.get(i),map.getOrDefault(list.get(i),0)+1);
            }
            answer.add(map.size());
            list.remove(0);
            cnt = list.size();
        }

        for(int a : answer){
            System.out.println( a+" ");
        }
    }
}
