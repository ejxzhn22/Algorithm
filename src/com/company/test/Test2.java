package com.company.test;

public class Test2 {
    public static void main(String[] args) {
        String[] log = {"01:00", "08:00", "15:00", "15:04", "23:00", "23:59"};
        Test2 t2 = new Test2();
        t2.solution(log);
    }
    public String solution(String[] log) {
        String answer = "";
        int total = 0;

        int tmph ,tmpm =0;

        String start = "";
        String end = "";
        for( int i =0; i< log.length; i+=2){
            start =log[i];
            end = log[i+1];

            System.out.println("start = " + start);
            System.out.println("end = " + end);

            int sh = Integer.parseInt(start.split(":")[0]);
            int sm = Integer.parseInt(start.split(":")[1]);

            System.out.println("sh = " + sh);
            System.out.println("sm = " + sm);

            int eh = Integer.parseInt(end.split(":")[0]);
            int em = Integer.parseInt(end.split(":")[1]);

            System.out.println("eh = " + eh);
            System.out.println("em = " + em);


            if( em == 0 && sm !=0) {
                em = 60;
                eh--;
            }

            tmpm = em-sm;
            tmph = eh-sh;

            System.out.println("tmph = " + tmph);
            System.out.println("tmpm = " + tmpm);

            if(tmph ==0 && tmpm<5){
                tmph =0;
                tmpm =0;
            }else if(tmph > 1 || tmph ==1&& tmpm >45){
                tmph = 1;
                tmpm = 45;
            }

            total += (tmph * 60) + tmpm;

            System.out.println("total = " + total);

        }

        String h = Integer.toString(total/60);
        if(h.length() ==1){
            h = "0"+h;
        }
        String m = Integer.toString(total%60);
        if(m.length() == 1) {
            m = "0"+m;
        }

        answer = h+":"+m;

        System.out.println("answer = " + answer);
        return answer;
    }
}
