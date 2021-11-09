package com.company.test;

import java.util.*;

public class Test4 {
    public static void main(String[] args) {
        String s = "aaabbaaa";

        Test4 test4 = new Test4();
        test4.solution(s);
    }

    public List<Integer> solution(String s) {

        List<Integer> answer = new ArrayList<>();

        Queue<Character> q = new LinkedList<>();

        for(char ch : s.toCharArray() ){
            q.offer(ch);
        }


        for(int i=0; i<q.size(); i++){
            char tmp = q.poll();
            if( tmp != q.peek()){
                q.offer(tmp);
                break;
            }else{
                q.offer(tmp);
            }
        }

        int cnt =1;
        while(!q.isEmpty()) {
            char ch = q.poll();
            if(q.isEmpty()){
                answer.add(cnt);
            }
            else if(  ch != q.peek()){
                answer.add(cnt);
                cnt = 1;
            }else{
                cnt ++;
            }
        }

        Collections.sort(answer);
        for( int i : answer){
            System.out.println("i = " + i);
        }
        return answer;
    }
}
