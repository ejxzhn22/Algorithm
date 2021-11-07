package com.company.sort;

public class SelectionSort {
    public static void main(String[] args) {
        int n = 6;
        int[] arr = {13,5,11,7,23,15};

        for(int i=0; i<n-1; i++){
            int num = arr[i];
            int idx = i;
            for(int j=i+1; j<n; j++){

                if(num > arr[j]){
                    num = arr[j];
                    idx = j;
                }
            }
            int tmp = arr[i];
            arr[i] = num;
            arr[idx] = tmp;

            for(int k : arr){
                System.out.print(k +" ");
            }
        }

    }
}
