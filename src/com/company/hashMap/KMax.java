package com.company.hashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class KMax {
    public static void main(String[] args) {
        int n = 10;
        int k =3;
        int[] arr = {13,15,34,23,45,65,33,11,26,42};
        int answer = -1;
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int l=j+1; l<n; l++){
                    set.add(arr[i]+ arr[j]+arr[l]);
                }
            }
        }

        int cnt =0;
        for(int x: set){
            cnt ++;
            if(cnt == k){
                answer= x;
                break;
            }
        }
        System.out.println(answer + " ");
    }
}
