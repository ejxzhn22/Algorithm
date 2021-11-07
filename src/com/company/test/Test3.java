package com.company.test;


import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Menu {
    String menu_name;
    String ing_list;
    String menu_price;

    public Menu() {

    }

    public Menu(String menu_name, String ing_list, String menu_price) {
        this.menu_name = menu_name;
        this.ing_list = ing_list;
        this.menu_price = menu_price;
    }
}
public class Test3 {
    public static void main(String[] args) {
        String[] ings = {"r 10", "a 23", "t 124", "k 9"};
        String[] menu = {"PIZZA arraak 145", "HAMBURGER tkar 180", "BREAD kkk 30", "ICECREAM rar 50", "SHAVEDICE rar 45", "JUICE rra 55", "WATER a 20"};
        String[] sell = {"BREAD 5", "ICECREAM 100", "PIZZA 7", "JUICE 10", "WATER 1"};

        Test3 t3 = new Test3();

        t3.solution(ings,menu,sell);
    }
    public int solution(String[] ings, String[] menu, String[] sell) {

        //재료 맵
        HashMap<String, Integer> ings_map = new HashMap<>();
        for(String ing : ings){
            ings_map.put(ing.split(" ")[0], Integer.parseInt(ing.split(" ")[1]));
        }
        for(String i : ings_map.keySet()){
            System.out.println(i +" : " + ings_map.get(i));
        }

        //메뉴 리스트
        List<Menu> menuList = new ArrayList<>();
        for( String s : menu){
            Menu m = new Menu(s.split(" ")[0],s.split(" ")[1],s.split(" ")[2]);
            menuList.add(m);
        }


        int answer = 0;
        int menu_price = 0;

        for(String str : sell){

            String sell_name = str.split(" ")[0];
            int sell_count = Integer.parseInt(str.split(" ")[1]);

            for(Menu m : menuList){
                if(m.menu_name.equals(sell_name)){
                    menu_price = Integer.parseInt(m.menu_price);  //판매 가격

                    HashMap<String, Integer> tmp_ings = new HashMap<>();
                    for(char ch : m.ing_list.toCharArray()){
                        tmp_ings.put(Character.toString(ch), tmp_ings.getOrDefault(Character.toString(ch), 0)+1);
                    }
                    for(String i : tmp_ings.keySet()){
                        System.out.println("여기 "+i +" : " + tmp_ings.get(i));
                    }
                    int tmp_price = 0;
                    for( String ch : tmp_ings.keySet()){
                        if( ings_map.containsKey(ch)){
                            System.out.println("ch = " + ch);
                            tmp_price += ings_map.get(ch) * tmp_ings.get(ch);
                            System.out.println("ings_map.get(ch) = " + ings_map.get(ch));
                            System.out.println("tmp_ings.get(ch) = " + tmp_ings.get(ch));
                        }
                    }

                    answer += (menu_price - tmp_price) *sell_count;

                    System.out.println("answer = " + answer);

                }
            }
        }

        System.out.println("answer = " + answer);
        System.out.println("answer = " + answer);

        return answer;
    }
}
