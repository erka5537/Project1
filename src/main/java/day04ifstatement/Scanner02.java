package day04ifstatement;

import java.util.Scanner;

public class Scanner02 {

    /*
       Not: char variable leri matematiksel işlemlerde kullanırsanız java onların ascii değerlerini kullanır
            örneğin: System.out.println('A' + 'C'); ekrana AC yerine 132 yazdırır
       Note: Java'da "+" sembolünün iki anlamı vardır 1.anlam toplama 2.anlam birleştirme
             Java "+" sembolü görünce önce toplama yapmaya çalışır yapamazsa birleştirme(concatenation) yapmaya çalışır o da olmazsa hata verir.

     */

    public static void main(String[] args) {

        //Example 1 : Kullanıcıdan ilk ve soy ismini alınız. ilk ve soyisminin ilk harflerini ekrana yazdırınız.
        //            Ali Can ==> AC

        Scanner input = new Scanner(System.in);

        //1.Yol:
//        System.out.println("İlk isminizi giriniz...");
//        char ilk = input.next().charAt(0);//A
//
//        System.out.println("Soy ismini gir...");
//        char soy = input.next().charAt(0);//C
//
//        System.out.println("" + ilk + soy);

        //2.Yol:
        System.out.println("Tam isminizi giriniz...");

        String tamIsim = input.nextLine();//Ali Can
        char ilkHarf = tamIsim.charAt(0);
        System.out.print(ilkHarf);
        char soyIsminIlkHarfi = tamIsim.split(" ")[1].charAt(0);
        System.out.println(soyIsminIlkHarfi);


    }
}
