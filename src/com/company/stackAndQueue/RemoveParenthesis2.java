package com.company.stackAndQueue;

import java.util.Stack;

public class RemoveParenthesis2 {
    public static void main(String[] args) {

        String str = "(A(BC)D)EF(G(H)(IJ)K)LM(N)";
        Stack<Character> stack = new Stack<>();
        String answer = "";

        for(char ch : str.toCharArray()){
            if(ch == ')'){
                while(stack.pop() != '(');
            }else{
                stack.push(ch);
            }
        }

        for(char ch : stack){
            answer += ch;
        }

        System.out.println( answer);


    }
}
