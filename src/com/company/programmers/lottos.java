package com.company.programmers;

import java.util.Arrays;
import java.util.stream.IntStream;

public class lottos {
    public static void main(String[] args) {
        int [] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};

        lottos l = new lottos();
        l.solution(lottos, win_nums);
    }
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int cnt = 0;
        int cnt0 = 0;

        for( int i : lottos){
            boolean isContain =  IntStream.of(win_nums).anyMatch(x -> x == i);
            System.out.println("isContain = " + isContain);
            if(isContain){
                cnt ++;
            }
            if(i == 0){
                cnt0 ++;
            }
        }

        int max = cnt+ cnt0;
        int min = cnt;
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        answer[0] = rank(max);
        answer[1] = rank(min);

        for(int i : answer){
            System.out.println(i + " ");
        }
        return answer;
    }

    private int rank(int n) {
        if(n == 6) return 1;
        else if(n==5) return 2;
        else if(n==4) return 3;
        else if(n==3) return 4;
        else if(n==2) return 5;
        else {
            return 6;
        }
    }
}
