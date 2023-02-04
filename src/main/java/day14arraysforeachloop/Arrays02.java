package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays02 {

    public static void main(String[] args) {

        // Example 1: [0, 2, 3, 0, 12, 0] sıfırları en sona koyunuz
        //            [2, 3, 12, 0,  0,  0]

        int original[] = {0,2,3,0,12,0};

        int yeni[]= new int[original.length];

        int idx = 0;

        for(int i=0; i<original.length; i++){

            if(original[i] != 0){
                yeni[idx] = original[i];
                idx++;
            }
        }
        System.out.println(Arrays.toString(yeni));

        //Example 2: Bir Array'in içinde herhangi bir elemanın olup olmadığını kontrol eden ve kaç kere tekrarlandığını gösteren eden kodu yazınız
        //           [ 2, 1, 2, -3, 2] ==> Kullanıcı 2'yi sordu ==> 2 elemanı var ve 3 kere tekrarlandı
        //                             ==> Kullanıcı 6'yı sordu ==> 6 array'de yok

        int arr[] = {2,1,2,-3,2};

        int eleman = 2;

        int counter = 0;// "flag": Bazı durumlarda olup olmadığını kontrol etmek için "flag" kullanılır.

        for(int w : arr){

            if(w==eleman){
                counter++;
            }

        }
        if(counter>0){
            System.out.println(eleman + " array'de var " + counter + " kere tekrarlandi");
        }else{
            System.out.println(eleman + " array'de yok");
        }

        //Example  3: Size verilen bir cümledeki en uzun kelimeyi bulan kodu yazınız
        //            "Java kolaydır çalışana, ne kolay ki çalışmayana" ==> çalışmayana

        String sentence = "Java kolaydır çalışana, ne kolay ki çalışmayana";

        sentence = sentence.replaceAll("\\p{Punct}","");

        String kelimeler[] =sentence.split(" ");

        Arrays.sort(kelimeler, Comparator.comparingInt(String::length));
        System.out.println(kelimeler[kelimeler.length-1]);//[ne, ki, Java, kolay, kolaydır, çalışana, çalışmayana]




    }
}
