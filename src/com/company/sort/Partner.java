package com.company.sort;

import java.util.ArrayList;
import java.util.Arrays;

public class Partner {
    public static void main(String[] args) {
        int n = 9;
        int[] arr = {120,125,152,130,135,135,143,127,160};

        int[] tmp = new int[n];

        for(int i=0; i<n;i++) {
            tmp[i] = arr[i];
        }

        Arrays.sort(tmp);

        for(int i=0; i<n; i++){
            if(tmp[i] != arr[i]){
                System.out.print(i+1 + " ");
            }
        }
    }
}
