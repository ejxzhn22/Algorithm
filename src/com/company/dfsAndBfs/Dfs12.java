package com.company.dfsAndBfs;

import java.util.Scanner;

public class Dfs12 {
    static int n, m, answer =0;
    static int [][] graph;
    static int[] ch;
    public static void main(String[] args) {
        Dfs12 T = new Dfs12();
        Scanner in = new Scanner(System.in);

         n = in.nextInt();
         m = in.nextInt();
         graph = new int[n+1][n+1];
         ch = new int[n+1];

        for(int i=0; i<m; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            graph[a][b] = 1;
        }

        ch[1] = 1;
        T.DFS(1);
        System.out.println(answer);
    }

    public static void DFS(int v) {
        if(v == n) {
            answer ++;
        }else{
            for(int i=1; i<=n; i++){
                if( graph[v][i] == 1 && ch[i] == 0){
                    ch[i] = 1;
                    DFS(i);
                    //DFS 실행후 돌아오면 체크를 풀어준다.
                    ch[i] = 0;
                }
            }
        }

    }
}
