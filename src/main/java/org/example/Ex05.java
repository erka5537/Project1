package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex05 {

    public static void main(String[] args) {

        /*TASK :
        2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
        listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
        Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
           Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]

         */
        String arr[][] = {{"Ali","Veli","Ayse"},{"Hasan","Can"},{"Suzan"}};

        List<String> kopya = new ArrayList<>();
        for(String[] w : arr){

            for(String k : w){
                kopya.add(k);
            }
        }
        Collections.sort(kopya);
        System.out.println(kopya);
    }
}
