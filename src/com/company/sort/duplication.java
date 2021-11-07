package com.company.sort;

import java.util.Arrays;

public class duplication {
    public static void main(String[] args) {
        int n = 8;
        int[] arr = {20,25,52,30,39,33,43,33};

        Arrays.sort(arr);
        String answer = "U";

        for(int i=0; i<n-1; i++){
            if(arr[i] == arr[i+1]){
                answer = "D";
            }
        }

        System.out.println(answer);
    }
}
