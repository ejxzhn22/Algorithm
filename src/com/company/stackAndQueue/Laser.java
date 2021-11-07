package com.company.stackAndQueue;

import java.util.Stack;

public class Laser {
    public static void main(String[] args) {
        String str = "(((()(()()))(())()))(()())";
        Stack<Character> stack = new Stack<>();

        int answer =0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '('){
                stack.push('(');
            }else{
                stack.pop();
                if(str.charAt(i-1) == '('){
                    answer += stack.size();

                }else{
                    answer ++;
                }
            }

        }
        System.out.println(answer);
    }
}
