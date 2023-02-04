package sorular01;

import java.util.Scanner;

public class Soru04 {

    public static void main(String[] args) {

        //Soru 4) Kullanicidan baslangic ve bitiş haflerini alin ve baslangic harfinden baslayip bitiş harfinde biten tum harfleri
        //buyuk harf olarak ekrana yazdirin. Kullanicinin hata yapmadigini farz edin.

        Scanner input = new Scanner(System.in);
        System.out.println("Başlangıç ve bitiş harflerini giriniz");
        char ilkHarf = input.next().toUpperCase().charAt(0);
        char ikinciHarf = input.next().toUpperCase().charAt(0);

//        char başlangıç = ilkHarf<ikinciHarf ? ilkHarf : ikinciHarf;
//        char bitiş = ilkHarf>ikinciHarf ? ilkHarf : ikinciHarf;
//
//        for (char i = başlangıç; i<=bitiş;i++){
//
//            System.out.print("" + i + " ");
//        }

        boolean kosul = ilkHarf<ikinciHarf;//a - z
        boolean kosul2 = ikinciHarf<ilkHarf;//z - a
        boolean kosul3 = ilkHarf>='A' && ilkHarf<='Z' && ikinciHarf>='A' && ikinciHarf<='Z';

        if (kosul3) {

            if (kosul) {
                for (char i = ilkHarf; i <= ikinciHarf; i++) {

                    System.out.print("" + i + " ");
                }
            } else if (kosul2) {

                for (char i = ilkHarf; i >= ikinciHarf; i--) {
                    System.out.print("" + i + " ");
                }

            }
        }else {
            System.out.println("Harf girmediniz");
        }





    }
}
