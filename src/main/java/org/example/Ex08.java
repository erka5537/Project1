package org.example;

import java.util.Arrays;

public class Ex08 {

    public static void main(String[] args) {

//        2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
//        listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
//        Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
//        Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]

       String arr[][] = {{"Ali","Veli","Ayse"},{"Hasan","Can"},{"Suzan"}};

       String brr[] = new String[6];
       int idx = 0;
       for(String[] w : arr){

           for(String k : w){
               brr[idx] = k;
               idx++;
           }
       }
        System.out.println(Arrays.toString(brr));

    }
}
