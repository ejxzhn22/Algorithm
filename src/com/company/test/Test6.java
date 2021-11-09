package com.company.test;

import java.util.Stack;

public class Test6 {
    public static void main(String[] args) {
        double time = 3.5;
        String [][] plans = {{"홍콩", "11PM", "9AM"},{"엘에이", "3PM", "2PM"}};

        Test6 test6 = new Test6();
        test6.solution(time, plans);
    }
    public String solution(double time, String[][] plans) {
        double mon = 13;
        double fri = 9.5;
        double endWork = 18;

        Stack<String> stack = new Stack();

        String name ="";
        String start = "";
        String arrival = "";

        for(int i=0; i<plans.length; i++){
            name = plans[i][0];
            start = plans[i][1];
            arrival = plans[i][2];

            double startTmp = Integer.parseInt(start.replaceAll("[^0-9]",""));
            if( start.replaceAll("[^A-Z]","").equals("PM")){
                startTmp += 12;
            }
            System.out.println("startTmp = " + startTmp);

            double arrivalTmp = Integer.parseInt(arrival.replaceAll("[^0-9]",""));
            if( arrival.replaceAll("[^A-Z]","").equals("PM")){
                arrivalTmp += 12;
            }
            System.out.println("arrivalTmp = " + arrivalTmp);

            double needTime = 0;
            if(startTmp <= fri){
               needTime += 8.5;
            }else if( startTmp >fri && startTmp <= endWork){
                needTime += endWork - startTmp;
            }
            System.out.println("needTime1 = " + needTime);

            if( arrivalTmp > mon && arrivalTmp <= endWork){
                needTime +=  arrivalTmp - mon;
            }else if(arrivalTmp > endWork){
                needTime += 5;
            }

            System.out.println("needTime2 = " + needTime);


            System.out.println("needTime = " + needTime);
            System.out.println("time = " + time);
            if ( needTime < time){
                stack.push(name);
            }

        }

        String answer = "";
        if(stack.isEmpty()) {
            answer = "호치민";
        }else{
            answer = stack.pop();
        }

        System.out.println("answer = " + answer);

        return answer;
    }
}
