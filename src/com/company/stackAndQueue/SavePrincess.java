package com.company.stackAndQueue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class SavePrincess {
    public static void main(String[] args) {
        int n = 8;
        int k = 3;
        int answer =0;

        Queue<Integer> q = new LinkedList<>();

        for( int i=1; i<=n; i++){
            q.add(i);
        }

        while(q.size()>1){
            for(int i=0; i<k; i++){
                if(i == k-1){
                    q.remove();
                }else{
                    int tmp = q.poll();
                    q.add(tmp);
                }
            }
        }

//        while(!q.isEmpty()){
//            for(int i=1; i<k; i++) q.offer(q.poll());
//            q.poll();
//            if(q.size() == 1) answer = q.poll();
//        }

        answer = q.poll();
        System.out.println(answer);
    }
}
