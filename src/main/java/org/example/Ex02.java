package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        //Example 1: Verilen bir List'deki elemanları tekrarsız olarak yazınız
        //           [2, 3, 2, 2, 5] ==> [2, 3, 5]

//        List<Integer> original = new ArrayList<>();
//        original.add(2);
//        original.add(3);
//        original.add(2);
//        original.add(2);
//        original.add(5);
//
//        List<Integer> a = new ArrayList<>();
//
//        for(Integer w : original){
//
//            if(!a.contains(w)){
//                a.add(w);
//            }
//        }
//        System.out.println(a);

        //Example 2: Kullanıcıdan bir harf alınız, harf sizdeki List'in içinde varsa o harfi "Bulundu" ya çeviriniz yoksa o harfi Liste ekleyiniz
        //           [A, K, R, S] ==> R ==> [A, K, Bulundu, S]
        //           [A, K, R, S] ==> X ==> [A, K, R, S, X]

        List<String> harfler = new ArrayList<>();
        harfler.add("A");
        harfler.add("K");
        harfler.add("R");
        harfler.add("S");

        Scanner input = new Scanner(System.in);
        String harf = "";

        do {
            System.out.println("Harf gir");
            harf = input.next().substring(0, 1);

            if (harfler.contains(harf)) {
                harfler.set(harfler.indexOf(harf), "Bulundu");
                System.out.println("Bulundu");
            } else if(!harf.equals("Q")){
                harfler.add(harf);
                System.out.println("Yanlış");
            }
        }while(!harf.equals("Q"));
        System.out.println(harfler);
    }
}
