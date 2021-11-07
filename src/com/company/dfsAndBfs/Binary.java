package com.company.dfsAndBfs;

public class Binary {
    public void DFS( int n){
        if(n/2 == 0){
            return;
        }else{
            DFS(n/2);
            System.out.print(n%2 + " ");
        }
    }

    public static void main(String[] args) {
        Binary b = new Binary();
        b.DFS(11);
    }
}
