package com.company.dfsAndBfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bfs14v2 {
    static int n, m, l;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;
    public void BFS(int v) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(v);
        ch[v] = 1;
        l = 0;

        while(!q.isEmpty()){
            int len = q.size();
            for(int i=0; i<len; i++){
                int x = q.poll();

            }
        }


    }

    public static void main(String[] args) {
        Bfs14v2 t = new Bfs14v2();
        Scanner in = new Scanner(System.in);

        n=in.nextInt();
        m=in.nextInt();
        graph=new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<Integer>());
        }
        ch=new int[n+1];

        for(int i=0; i<m; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            graph.get(a).add(b);
        }
        t.BFS(1);




    }
}
