package com.company.twoPointersAndSlidingWindow;

public class MaxLength
{
    public static void main(String[] args) {

        int n= 14;
        int k = 2;
        int[] arr = {1, 1, 0,0,1,1,0,1,1,0,1,1,0,1};

        int pi=0, pj=0, answer =0, p1=-1, p2=-1;
        while (pj < n) {
            if(arr[pj] == 0){
                if(p1 == -1){
                    p1 =pj;

                }else if(p2 == -1 ){
                    p2 = pj;

                }else{
                    answer = Math.max(answer, pj-pi);

                    pi = p1+1;
                    p1 = p2;
                    p2 = pj;

                }
            }
            pj++;
        }

        System.out.println( answer+ " ");
    }
}
