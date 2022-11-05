package day08stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {

    public static void main(String[] args) {

        //Example 1: Kullanıcıdan aldığınız ismin ilk ve son harfini ekrana yazdırınız
        //           Ramazan ==> Rn

        Scanner input = new Scanner(System.in);
        //System.out.println("Lütfen isminizi giriniz...");
        //String isim = input.next();
        //char ilkHarf = isim.charAt(0);
        //char sonHarf = isim.charAt(isim.length()-1);//Yazdığınız code sadece bazı durumlar için çalışırsa o code'a "Hard Coding" denir.
                                                    //Yazdığınız code sadece her durum için çalışırsa o code'a "Dynamic Coding" denir.
        //System.out.println("" + ilkHarf + sonHarf);

        //2.Yol:
        //String ilk = isim.substring(0,1);//İlk sayı dahil ikinci sayı hariç
        //String son = isim.substring(isim.length()-1);
        //System.out.println(ilk + son);

        //Example 2: Verilen String'teki sadece hayvan isimlerini ekrana yazdırınız
        //           "Ben kedi, eşim tavuk, oğlum sever inek"

        //String str = "Ben kedi, eşim tavuk, oğlum sever inek";

        //substring()'in iki kullanımı vardır
        //1)substring()(başlangıç indexi, bitiş indexi) String'in ortasından bir parça almaya yarar
        //2)substring()(başlangıç indexi) String'in verilen index'ten sonuna kadar almaya yarar
        //String kedi = str.substring(4,8);
        //String tavuk = str.substring(15,20);
        //String inek = str.substring(34);
        //System.out.println(kedi + tavuk + inek);

        //Example 3: İlk isim ve soy ismi içeren isimlerden ilk ve soyisimlerin baş harflerini ekrana yazdırınız
        //           Ali Can ==> AC    Tahsin Yurdakul ==> TY
        System.out.println("İlk ve soy isminizi giriniz...");
        String tamIsim = input.nextLine();

        String a = tamIsim.substring(0,1);

        String b = tamIsim.split(" ")[1].substring(0,1);
        System.out.println(a + b);
    }
}
