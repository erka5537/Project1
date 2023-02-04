package org.example;

import java.util.ArrayList;
import java.util.List;

public class Ex15 {

    public static void main(String[] args) {

//        9) String bir listede verilen tüm fiyatların toplamını bulunuz.
//        Örnek: List<String> myList = new List<String>{'$12.99',  '$23.60',  '$54.45'}; ==> 91.04

        List<String> myList = new ArrayList<>();
        myList.add("$12.99");
        myList.add("$23.60");
        myList.add("$54.45");
        double toplam = 0;
        for(String w : myList){
            toplam = toplam + Double.valueOf(w.replace("$",""));
        }
        System.out.println(toplam);
    }
}
