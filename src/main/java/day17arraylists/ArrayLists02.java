package day17arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayLists02 {

    public static void main(String[] args) {

        //Example 1: Verilen bir List'deki elemanları tekrarsız olarak yazınız
        //           [2, 3, 2, 2, 5] ==> [2, 3, 5]

        List<Integer> original = new ArrayList<>();
        original.add(2);
        original.add(3);
        original.add(2);
        original.add(2);
        original.add(5);

        List<Integer> yeni = new ArrayList<>();
        for(Integer w : original){
            if(!yeni.contains(w)){
                yeni.add(w);
            }
        }
        System.out.println(yeni);

        //Example 2: Kullanıcıdan bir harf alınız, harf sizdeki List'in içinde varsa o harfi "Bulundu" ya çeviriniz yoksa o harfi Liste ekleyiniz
        //           [A, K, R, S] ==> R ==> [A, K, Bulundu, S]
        //           [A, K, R, S] ==> X ==> [A, K, R, S, X]

        Scanner input = new Scanner(System.in);
        String harf = "";

        List<String> c = new ArrayList<>();
        c.add("A");
        c.add("K");
        c.add("R");
        c.add("S");

        do {
            System.out.println("Bir harf girin");
            harf = input.next().substring(0,1);

            if (c.contains(harf)) {
                c.set(c.indexOf(harf), "Bulundu");
            } else if(!harf.equals("Q")){
                c.add(harf);
            }
            System.out.println(c);
        }while(!harf.equals("Q"));
    }
}
