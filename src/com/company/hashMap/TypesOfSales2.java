package com.company.hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TypesOfSales2 {
    public static void main(String[] args) {
        int n = 7;
        int k = 4;
        int[] arr = {20,12,20,10,23,14,10};
        List<Integer> answer = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<k-1; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }

        int lt=0;
        for(int rt=k-1; rt<n; rt++){
            map.put(arr[rt],map.getOrDefault(arr[rt],0)+1);
            answer.add(map.size());
            map.put(arr[lt], map.get(arr[lt])-1);

            if(map.get(arr[lt])==0){
                map.remove(arr[lt]);
            }
            lt++;
        }

        for(int a: answer){
            System.out.print(a + " ");
        }
    }
}
