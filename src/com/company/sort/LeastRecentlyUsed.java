package com.company.sort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeastRecentlyUsed {
    public static void main(String[] args) {
        int s=5;
        int n = 9;
        int[] arr = {1,2,3,2,6,2,3,5,7};

        int[] cache = new int[s];

        for(int x : arr) {
            int pos = -1;
            for(int i=0; i<s; i++) {
                if(x == cache[i]){
                    pos = i;
                }
            }

            if(pos == -1) {
                for (int i = s-1; i>=1; i--){
                    cache[i]=cache[i-1];
                }
                cache[0] = x;
            }else{
                for (int i = pos; i>=1; i--){
                    cache[i]=cache[i-1];
                }
                cache[0] = x;
            }
        }

        for(int i : cache){
            System.out.print(" " + i);
        }
    }
}
