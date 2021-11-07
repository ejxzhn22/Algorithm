package com.company.twoPointersAndSlidingWindow;

public class ContinuousNum {
    public static void main(String[] args) {
        int n= 15;

        int pi=1, pj=2, sum = 1, answer =0;

        while(pj <n){
            sum += pj;

            if(sum == n){
                answer ++;
                pj++;
            }else{

                while(sum>=n){
                    sum-=pi;
                    pi++;
                    if(sum==n){
                        answer++;
                    }
                }
                pj++;
            }
        }
        System.out.println(answer);
    }
}
