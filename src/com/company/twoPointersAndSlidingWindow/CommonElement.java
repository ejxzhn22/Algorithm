package com.company.twoPointersAndSlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CommonElement {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

        int n= 5;
        int[] arr1 = {3, 2, 5, 7, 8};

        int m = 5;
        int[] arr2 = {1,3,9,5,2};

        List<Integer> answer = new ArrayList<>();

        Arrays.sort(arr1);
        Arrays.sort(arr2);


        int pi =0, pj=0;
        while(pi<n && pj< m){
            if(arr1[pi] <= arr2[pj]){
                System.out.print("pi = " + pi);
                System.out.println("pj = " + pj);

                if(arr1[pi] == arr2[pj]){
                    answer.add(arr1[pi]);
                    pi++;
                    pj++;
                }else{
                    pi++;
                }
            }else{
                pj++;
            }
        }

        for(int i : answer){
            System.out.print( i+" ");
        }

    }
}
