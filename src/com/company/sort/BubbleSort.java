package com.company.sort;

public class BubbleSort {
    public static void main(String[] args) {
        int n =10;
        int[] arr = {56, 68, 62, 69, 64 ,89, 56, 68, 93, 53};
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        for(int k : arr){
            System.out.print(k +" ");
        }
    }
}
