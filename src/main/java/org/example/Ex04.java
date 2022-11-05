package org.example;

import java.util.ArrayList;
import java.util.List;

public class Ex04 {

    public static void main(String[] args) {

        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

        List<String> isimler = new ArrayList<>();
        isimler.add("Ali");
        isimler.add("Veli");
        isimler.add("Ayşe");
        isimler.add("Fatma");
        isimler.add("Ömer");

        List<String> silinecekler = new ArrayList<>();

        for(String w : isimler){

            if(w.toLowerCase().contains("a")){
                silinecekler.add(w);
            }
        }
        isimler.removeAll(silinecekler);
        System.out.println(isimler);
    }
}
