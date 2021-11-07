package com.company.twoPointersAndSlidingWindow;

public class MaxLength2
{
    public static void main(String[] args) {

        int n= 14;
        int k = 2;
        int[] arr = {1, 1, 0,0,1,1,0,1,1,0,1,1,0,1};

        int cnt =0, lt =0, answer =0;
        for(int rt=0; rt<n; rt++){
            if(arr[rt] == 0){
                cnt ++;
            }
            while(cnt >k){
                if(arr[lt] == 0){
                    cnt --;
                }
                lt ++;
            }
            answer= Math.max(answer, rt-lt+1);

        }

        System.out.println( answer+ " ");
    }
}
