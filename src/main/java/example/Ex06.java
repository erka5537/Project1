package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
//        ABD'deki eyalet kısaltmalarının biçimini kontrol etmek için kod yazınız.
//        a) Kısaltma 2'den fazla karakter içeriyor ise kodunuz, "Eyalet kısaltmaları 2 karakterden fazla olamaz" yazmalıdır.
//        b) Kısaltmada küçük harfler var ise kodunuz, "Eyalet kısaltmaları küçük harf içeremez" yazmalıdır.
//        c) Kısaltmanın harflerinden farklı karakterler var ise kodunuz, "Eyalet kısaltmaları aşağıdakilerden farklı karakterler içeremez" yazmalıdır.
//
//                Not: Kısaltmada 1'den fazla hata varsa ilgili tüm hata mesajları yazdırılmalıdır.
//        örnek; "fl3" için kodunuz; "Eyalet kısaltmaları 2 karakterden fazla olamaz", "Eyalet kısaltmaları
//        küçük harf içeremez", ve "Eyalet kısaltmaları aşağıdakilerden farklı karakterler içeremez"
//        yazmalıdır.

        Scanner input = new Scanner(System.in);
        System.out.println("Eyaletin kısaltmasını giriniz...");
        String kısaltma = input.next();
        //DL
        boolean krksay = kısaltma.length()>2;
        boolean kckharf = kısaltma.replaceAll("[^a-z]","").length()!=0;
        boolean harfelr = kısaltma.replaceAll("[a-zA-Z]","").length()!=0;
//
//        if(krksay&&kckharf&&harfelr){
//            System.out.println("Eyalet kısaltmaları 2 karakterden fazla olamaz");
//            System.out.println("Eyalet kısaltmaları küçük harf içeremez");
//            System.out.println("Eyalet kısaltmaları aşağıdakilerden farklı karakterler içeremez");
//        }else if(krksay&&kckharf){
//            System.out.println("Eyalet kısaltmaları 2 karakterden fazla olamaz");
//            System.out.println("Eyalet kısaltmaları küçük harf içeremez");
//        }else if(kckharf&&harfelr){
//            System.out.println("Eyalet kısaltmaları küçük harf içeremez");
//            System.out.println("Eyalet kısaltmaları aşağıdakilerden farklı karakterler içeremez");
//        }else if(krksay&&harfelr) {
//            System.out.println("Eyalet kısaltmaları 2 karakterden fazla olamaz");
//            System.out.println("Eyalet kısaltmaları aşağıdakilerden farklı karakterler içeremez");
//        }else if (krksay){
//            System.out.println("Eyalet kısaltmaları 2 karakterden fazla olamaz");
//        }else if (kckharf) {
//            System.out.println("Eyalet kısaltmaları küçük harf içeremez");
//        }else if (harfelr) {
//            System.out.println("Eyalet kısaltmaları aşağıdakilerden farklı karakterler içeremez");
//        }else System.out.println("Doğru");


        if(krksay){
            System.out.println("Eyalet kisaltmalari 2 karakterden fazla olamaz ");
        }
        if(kckharf){
            System.out.println("Eyalet kisaltmalari kucuk harf iceremez ");
        }
        if(harfelr){
            System.out.println("Eyalet kisaltmalari asagidakilerden farkli karakterler iceremez ");
        }
        if(!krksay&&!kckharf&&!harfelr){
            System.out.println("Doğru");
        }
    }
}
