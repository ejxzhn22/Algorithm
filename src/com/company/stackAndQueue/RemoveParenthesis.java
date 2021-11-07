package com.company.stackAndQueue;

import java.util.Stack;

public class RemoveParenthesis {
    public static void main(String[] args) {

        String str = "(A(BC)D)EF(G(H)(IJ)K)LM(N)";
        Stack<Character> stack = new Stack<>();
        String answer = "";

        for(char ch : str.toCharArray()){
            if(ch == '('){
                stack.push(ch);
            }else if(ch == ')'){
                stack.pop();
            }else{
                if(stack.isEmpty()){
                    answer += ch;
                }
            }
        }

        System.out.println("answer = " + answer);


    }
}
