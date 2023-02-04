package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex16 {

    public static void main(String[] args) {

//        10) Bir String listesinde verilen en düşük ve en büyük fiyatın toplamını bulunuz.
//        Örnek: List<String> myList = new List<String>{'$12.99', '$8.25', '$23.60', '$54.45'}; ==> 62.70

        List<String> myList = new ArrayList<>();
        myList.add("$12.99");
        myList.add("$8.25");
        myList.add("$23.60");
        myList.add("$54.45");

        List<Double> doubleMyList = new ArrayList<>();

        for(String w : myList){
            doubleMyList.add(Double.valueOf(w.replace("$","")));
        }
        Collections.sort(doubleMyList);
        double ilkEleman = doubleMyList.get(0);
        double sonEleman = doubleMyList.get(doubleMyList.size()-1);

        System.out.println(ilkEleman+sonEleman);
    }
}
