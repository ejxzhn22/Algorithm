package com.company.programmers;

import java.util.Stack;

public class Dart {
    public static void main(String[] args) {
        String dartResult = "1S2D*3T";
        Dart d = new Dart();
        d.solution(dartResult);

    }
    public int solution(String dartResult) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for(char ch : dartResult.toCharArray()){
            if(Character.isDigit(ch)){
                stack.push(ch-48);
            }else{
                int rt = stack.pop();
                int lt = stack.pop();
                int tmp =0;
                if(ch == 'S') {
                    tmp = lt + (rt *1);
                    stack.push(tmp);
                }else if(ch == 'D'){
                    tmp = lt + (rt*rt);
                    stack.push(tmp);
                }else if(ch == 'T') {
                    tmp = lt + (rt * rt * rt);
                    stack.push(tmp);
                } else if ( ch == '*'){
                    tmp = lt *2 + rt*2;
                    stack.push(tmp);
                } else if( ch == '#'){
                    tmp = lt * -1 + rt *-1;
                    stack.push(tmp);
                }
            }
        }
        answer = stack.pop();
        System.out.println("answer = " + answer);
        return answer;
    }
}
