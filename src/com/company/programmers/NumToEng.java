package com.company.programmers;

import java.util.stream.IntStream;

public class NumToEng {
    public static void main(String[] args) {
        String s = "one4seveneight";
        NumToEng n = new NumToEng();
        n.solution(s);
    }
    public int solution(String s) {
        int answer = 0;
        String numStr = "";
        String tmp ="";

        for( char ch : s.toCharArray()){
            if(Character.isDigit(ch)) numStr += ch;
            else{
                tmp += ch;
                if (tmp.equals("zero")){
                    numStr += 0;
                    tmp = "";
                }
                else if(tmp.equals("one")){
                    numStr += 1;
                    tmp = "";
                }
                else if(tmp.equals("two")){
                    numStr += 2;
                    tmp = "";
                }
                else if(tmp.equals("three")){
                    numStr += 3;
                    tmp = "";
                }
                else if(tmp.equals("four")){
                    numStr += 4;
                    tmp = "";
                }
                else if(tmp.equals("five")){
                    numStr += 5;
                    tmp = "";
                }
                else if(tmp.equals("six")){
                    numStr += 6;
                    tmp = "";
                }
                else if(tmp.equals("seven")){
                    numStr += 7;
                    tmp = "";
                }
                else if(tmp.equals("eight")){
                    numStr += 8;
                    tmp = "";
                }
                else if(tmp.equals("nine")){
                    numStr += 9;
                    tmp = "";
                }

            }
        }
        answer = Integer.parseInt(numStr);
        System.out.println("answer = " + answer);
        return answer;
    }


}
