package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex09 {

    public static void main(String[] args) {

//        4) Bir listedeki öğelerin azalan sırada olup olmadığını kontrol ediniz.
//                Örnek: (Yellow, Blue, Red, Green) ==> Çıktı: Azalan sırada değil
//                (Yellow, Red, Green, Blue) ==> Çıktı: Azalan sıradadır*/

        //İlk ve son karakterleri aynı olan array öğelerini bulmak için kod yazınız.

        List<String> renkler = new ArrayList<>();
        renkler.add("Yellow");
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");

        List<String> sıralı = new ArrayList<>();
        sıralı.addAll(renkler);
        Collections.sort(sıralı);

        int counter = 0;

        for(int i=0; i<sıralı.size(); i++){

            if(renkler.get(i).equals(sıralı.get(sıralı.size()-i-1))){
                counter++;
            }
        }
        if(counter == sıralı.size()){
            System.out.println("Azalan sıradadır");
        }else System.out.println("Azalan sırada değildir");
    }
}
