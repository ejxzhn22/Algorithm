package com.company.twoPointersAndSlidingWindow;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TwoArray {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[] arr1 = new int [n];
        for ( int i=0; i<n; i++){
            arr1[i] = in.nextInt();
        }

        int m = in.nextInt();
        int[] arr2 = new int[m];
        for ( int i=0; i<m; i++){
            arr2[i] = in.nextInt();
        }

        List<Integer> answer = new ArrayList<>();

        int pi = 0, pj=0;

        while( pi < n && pj < m){
            if(arr1[pi] <= arr2[pj]){
                answer.add(arr1[pi]);
                pi++;
            }else{
                answer.add(arr2[pj]);
                pj++;
            }
        }
        if( pi< n){
            for( int i = pi; i< n; pi ++){
                answer.add(arr1[pi]);
            }
        }else if( pj < m){
            for(int j = pj; j<m; j++){

                answer.add(arr2[j]);

            }
        }



        for(int a : answer){
            System.out.print(a+" ");
        }
    }
}