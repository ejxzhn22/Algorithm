package com.company.sort;

public class InsertionSort {

    public static void main(String[] args) {
        int n = 6;
        int[] arr = {11,7,5,6,10,9};

        for(int i=1; i<n; i++){
            int tmp = arr[i], j;
            for(j = i-1; j>=0; j--){
                if(arr[j]> tmp){
                    arr[j+1] = arr[j];
                }else{
                    break;
                }
            }
            arr[j+1]= tmp;
        }
        for(int k : arr){
            System.out.print(" " + k);
        }
    }
}
