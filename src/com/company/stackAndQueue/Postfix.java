package com.company.stackAndQueue;

import java.util.Stack;

public class Postfix {
    public static void main(String[] args) {

        String str = "352+*9-";
        Stack<Integer> stack = new Stack<>();

        for(char ch : str.toCharArray()){
            if(Character.isDigit(ch)){
                stack.push(ch -48);
            }else{
                int rt = stack.pop();
                int lt = stack.pop();

                if(ch == '+'){
                    stack.push(rt + lt);
                }else if(ch == '-'){
                    stack.push(lt - rt);
                }else if(ch =='*'){
                    stack.push(lt*rt);
                }else if(ch =='/'){
                    stack.push(lt/rt);
                }
            }
        }

        System.out.println(stack.get(0));
    }
}
