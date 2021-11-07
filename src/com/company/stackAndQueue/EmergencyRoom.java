package com.company.stackAndQueue;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class EmergencyRoom {

    public static void main(String[] args) {
        int n = 5;
        int m = 2;
        int [] arr = {60,50,70,80,90};

        HashMap<Integer,Integer> map = new HashMap<>();
        Queue<Map<Integer,Integer>> q = new LinkedList<>();

        for(int i=0; i<n; i++){
            map.put(i, arr[i]);
        }



    }
}
