package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex14 {

    public static void main(String[] args) {

//        7) Bir tamsayı listesinde en yakın 2 tamsayıyı bulunuz.
//        Örnek: (12, 31, 15, 13, 54) ==> Çıktı 12 ve 13'tür

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(12);
        sayilar.add(31);
        sayilar.add(15);
        sayilar.add(50);
        sayilar.add(54);
        Collections.sort(sayilar);

        int minFark = Integer.MAX_VALUE;

        int idx = 1;

        for(Integer w : sayilar){

            minFark = Math.min(minFark,sayilar.get(idx)-sayilar.get(idx-1));

        }

        for(Integer w : sayilar){
            if(sayilar.contains(w+minFark)){
                System.out.println(w +" "+ (w+minFark));
            }
        }
    }
}
