package com.company.twoPointersAndSlidingWindow;

public class MaxNum {

    public static void main(String[] args) {

        int n = 10;
        int k = 3;

        int[] arr = {12,15,11,20,25,10,20,19,13,15};

        int max = 0;

        for(int i = 0; i<k; i++){
            max += arr[i];
        }

        int num = max;
        for(int i = k; i<n; i++){

            num -= arr[i];
            num += arr[i-k];

            if( max < num){
                max = num;
            }
            max = Math.max(max, num);

        }

        System.out.println(max);
    }
}
