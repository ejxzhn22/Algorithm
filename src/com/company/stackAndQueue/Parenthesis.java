package com.company.stackAndQueue;

import java.util.HashMap;
import java.util.Stack;

public class Parenthesis {
    public static void main(String[] args) {
        String str = "(()(()))(()";
        String answer = "YES";
        Stack<Character> stack = new Stack<>();

        for(char ch : str.toCharArray()){
            if(ch == '('){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){ // 닫는 괄호가 더 많을 때
                    answer = "NO";
                    break;
                }
                stack.pop();

            }
        }

        // 여는 괄호가 더 많을 때
        if(!stack.isEmpty()){
            answer = "NO";
        }

        System.out.println(answer);

    }
}
