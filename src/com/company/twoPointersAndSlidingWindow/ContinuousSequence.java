package com.company.twoPointersAndSlidingWindow;

public class ContinuousSequence {

    public static void main(String[] args) {
        int n = 8;
        int m = 6;
        int[] arr = {1, 2, 1, 3, 1, 1, 1, 2};

        int pi=0, pj =1,  answer =0;
        int sum = 0;
        while(pj <n){
            sum += arr[pj];
            if(sum == m){
                answer ++;
                sum -= arr[pi];
                pi++;
                pj++;

            }else if(sum <m){
                pj++;
            }else{
                while(sum >=m){
                    sum -= arr[pi];
                    pi++;

                    if(sum == m){
                        answer ++;
                    }
                }
                pj++;



            }
        }

        System.out.println(answer);
    }
}
