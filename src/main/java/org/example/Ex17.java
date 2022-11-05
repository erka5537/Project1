package org.example;

import java.util.ArrayList;
import java.util.List;

public class Ex17 {

    public static void main(String[] args) {

        //11) Döngüleri kullanarak tamsayılardan oluşan bir listenin tüm öğelerinin benzersiz (tekrarsız) olup olmadığını kontrol ediniz.

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(47);
        sayilar.add(65);
        sayilar.add(456);
        sayilar.add(852);
        sayilar.add(789);

        Integer counter = 0;
        for(Integer w : sayilar){
            for(Integer k : sayilar){
                if(w==k){
                    counter++;
                }
            }
        }
        if(counter==sayilar.size()){
            System.out.println("Tekrarlanan oge yoktur");
        }else{
            System.out.println("En az 1 oge tekrarlanmistir");
        }
    }
}
