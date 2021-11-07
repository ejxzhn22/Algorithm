package com.company.stackAndQueue;

import java.util.Stack;

public class CraneKakao {
    public static void main(String[] args) {
        int n = 5;
        int[][] board = {{0,0,0,0,0},
                         {0,0,1,0,3},
                         {0,2,5,0,1},
                         {4,2,4,4,2},
                         {3,5,1,3,1}};

        int m = 8;
        int[] moves = {1,5,3,5,1,2,1,4};
        int answer =0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(board[j][moves[i]-1] != 0){
                    int move = board[j][moves[i]-1];

                    if(stack.size()!=0 &&stack.peek()== move){
                      answer +=2;
                      stack.pop();
                    }else{
                        stack.push(move);
                    }
                    board[j][moves[i]-1] = 0;
                    break;
                }
            }
        }


        System.out.println(answer);
    }
}
