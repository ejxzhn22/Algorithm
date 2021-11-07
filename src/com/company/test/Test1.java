package com.company.test;

import java.util.HashMap;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        Test1 t1 = new Test1();
        t1.solution(arr);
    }

    public int[] solution(int[] arr) {
        int[] answer = new int[3];
        int[] tmp = { 0,0,0};

        for(int i : arr){
            tmp[i-1] += 1;
        }

        int max = -1;
        // 최대값 구하기
        for(int j : tmp) {
            if( j> max){
                max= j;
            }
        }

        for(int i=0; i<tmp.length; i++){
            for(int j=0; j<max-tmp[i]; j++){
                answer[i] += 1;
            }
        }

        for(int i : answer){
            System.out.println("i = "+ i);
        }
        return answer;
    }

}
