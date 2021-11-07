package com.company.stackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

public class Curriculum {
    public static void main(String[] args) {
        String need = "CBA";
        String plan = "CBDAGE";

        String answer ="YES";

        Queue<Character> q = new LinkedList<>();

        for(char ch : need.toCharArray()){
            q.offer(ch);
        }

        for(char ch : plan.toCharArray()){
            if(q.contains(ch)){
               if(q.poll() != ch){
                   answer = "NO";
               }
            }
        }
        if(q.isEmpty()) answer = "NO";

        System.out.println("answer = " + answer);
    }
}
