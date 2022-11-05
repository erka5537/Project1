package sorular;

import java.util.Scanner;

public class Soru12 {

    public static void main(String[] args) {

//        Soru 3) Kullanicidan toplamak üzere pozitif sayilar isteyin, işlemi bitirmek için 0’a basmasini söyleyin.
//                Kullanici 0’a bastiginda toplam kac pozitif şayi girdiğini ve girdigi pozitif sayilarin toplaminin kac olduğunu yazdirin.

//                Soru 4) Kullanicidan toplamak üzere pozitif sayilar isteyin, işlemi bitirmek için 0’a basmasini söyleyin.
//                Kullanici yanlislikla negative şayi girerse o sayiyi dikkate almayin ve "Negatif şayi giremezsiniz" yazdirip basa donun
//        Kullanici 0’a bastiginda toplam kac pozitif şayi girdiğini, yanlislikla kac negative şayi girdiğini ve girdigi pozitif
//        sayilarin toplaminin kac olduğunu yazdirin.

        Scanner input = new Scanner(System.in);

        int toplam = 0;
        int sayac = -1;
        do {
            System.out.println("Pozitif bir sayı giriniz... \nBitirmek için 0'a basın");
            int sayı = input.nextInt();
            sayac++;
            toplam = toplam + sayı;

            if(sayı==0){
                System.out.println("bitti");
                break;
            }

        }while(true);
        System.out.println("sayıların toplamı =" + toplam + "\n" + sayac + " sayı girdiniz");


//        int sayi;
//        int toplam=0;
//        int sayac=0;
//        do {
//            System.out.println("Lutfen pozitif sayi giriniz: ");
//            System.out.println("Islemi bitirmek icin 0'a basiniz");
//            sayi=input.nextInt();
//            toplam= toplam + sayi;
//            sayac = sayac + 1;
//
//        } while (sayi!=0);
//        System.out.println(sayac+" sayi girilmistir");
//        System.out.println("toplami : "+toplam);

    }
}
