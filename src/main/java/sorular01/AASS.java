package sorular01;

import java.util.Scanner;

public class AASS {

    public static void main(String[] args) {

        /*
        Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
        isim-soyisim : m***** b*******
        kart no ' **** **** **** 1234
        */

        Scanner input = new Scanner(System.in);
        System.out.println("İsim ve soyisminizi giriniz...");//İsimden sonra enter'a basın
        String isim = input.next();
        String soyIsim = input.next();

        Scanner scan = new Scanner(System.in);
        System.out.println("Kart no giriniz...");
        String kartNo = scan.nextLine().replace(" ","");
        //String yeniKart = kartNo.replace(" ","");

        System.out.print(isim.charAt(0));
        for(int i=1; i<isim.length(); i++){
            System.out.print("*");
        }

        System.out.print("\n" + soyIsim.charAt(0));
        for(int i=1; i<soyIsim.length(); i++){
            System.out.print("*");
        }

        System.out.println();
        for(int i=1; i<kartNo.length()-12; i++){
            System.out.print("**** ");

        }
            System.out.print(kartNo.substring(12));


//        Scanner input = new Scanner(System.in);
//        System.out.println("İsim, giriniz...");
//        String isim = input.next();
//        System.out.println("soyisimgir");
//        String soyIsim = input.next();
//        System.out.println("kartgir");
//
//        long kartNo = input.nextLong();
//        String yeniIsim = isim.substring(1).replaceAll("[^ ]","*");
//        String yeniSoy = soyIsim.substring(1).replaceAll("[^ ]","*");
//        long yeniKart = kartNo%10000;
//
//        //String yeniKart = kartNo.substring(0,13).replaceAll("[^ ]","*") + kartNo.substring(13);
//        System.out.println(isim.charAt(0) + yeniIsim + " " + soyIsim.charAt(0) + yeniSoy);
//        System.out.println("**** **** **** " + yeniKart);
    }
}