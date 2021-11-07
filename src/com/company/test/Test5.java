package com.company.test;

public class Test5 {
    public static void main(String[] args) {
        int rows = 6;
        int columns = 6;
        Test5 test5 = new Test5();
        test5.solution(rows,columns);

    }
    public int[][] solution(int rows, int columns) {
        // 지운 0의 갯수를 센다.
        int cnt =1;
        int num =1;
        int[][] answer = new int[rows][columns];
        answer[0][0] = 1;
        int r = 0, c = 0;

        int size = rows* columns;
        while(cnt != size){
            if( num%2 ==0) {
                r++;
                if( r == rows) {
                    r = 0;
                }
            }else{
                c++;
                if( c == columns){
                    c = 0;
                }
            }

            if(rows==columns && answer[r][c]== 1 ){
                break;
            }

            if( answer[r][c] == 0) {
                cnt ++;
            }
            num ++;
            answer[r][c] = num;

        }

        for( int i=0; i<answer.length; i++) {
            for(int j=0; j<answer[0].length; j++){
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }

        return answer;
    }
}
