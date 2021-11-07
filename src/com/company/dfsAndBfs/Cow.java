package com.company.dfsAndBfs;

import java.util.LinkedList;
import java.util.Queue;

public class Cow {
    public static void main(String[] args) {
        int s = 5;
        int e = 14;
        int answer = 0;
        int L = 0;

        int[] dist = {1, -1, 5};
        int[] arr = new int[10001];
        Queue<Integer> q = new LinkedList<>();

        arr[s] = 1;
        q.offer(s);

        while(answer == 0){
            int len = q.size();
            for(int i =0; i<len; i++){
                int x = q.poll();
                for(int j=0; j<3; j++){
                    int nx = x +dist[j];
                    if(nx >= 1 && nx<= 10000 && arr[nx] == 0){
                        if(nx == e) {
                            answer = L+1;
                            break;
                        }
                        arr[nx] = 0;
                        q.offer(nx);
                    }
                }
            }
            L++;

        }

        System.out.println("answer = " + answer);
    }
}
