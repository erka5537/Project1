package project_questions;

import java.util.Arrays;
import java.util.Scanner;

public class Manav {

    public static void main(String[] args) {

        /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         *           istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         *           Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.

        Ipucu:
        Class icinde 3 method olacak
         * main() isimli bir method
         * musteriSecimi() isimli bir method
         * kasa() isimli bir method
         * */


        String urunler[] = new String[5];
        urunler[0] = ("1 ==> Domates");
        urunler[1] = ("2 ==> Biber");
        urunler[2] = ("3 ==> Patlıcan");
        urunler[3] = ("4 ==> Elma");
        urunler[4] = ("5 ==> Armut");

        Double fiyatlar[] = new Double[5];
        fiyatlar[0] = (10.50);
        fiyatlar[1] = (7.60);
        fiyatlar[2] = (5.25);
        fiyatlar[3] = (3.40);
        fiyatlar[4] = (4.75);

        System.out.println("\t\t♦♦♦♦Hoşgeldiniz♦♦♦♦\n" +
                " Aşağıda Bulunan Ürünlerden Seçim Yapabilirsiniz \n\t\t\t\t\t▼▼▼\n" + Arrays.toString(urunler));
        System.out.println("\t("+fiyatlar[0]+"TL)\t\t("+fiyatlar[1]+"TL)\t\t  ("+fiyatlar[2]+"TL)\t\t("+fiyatlar[3]+"TL)\t\t("+fiyatlar[4]+"TL)");

        musteriSecimi(urunler,fiyatlar);
    }
/*                                    ↑↑                ↓↓
                                     Runner           Methods
                                      ↑↑                ↓↓
 */
    //Müşteriye ürünü seçtiren ve kasa() methodu ile toplam borcunu yazdıran method
    public static void musteriSecimi(String[] a, Double[] b){
        Scanner input = new Scanner(System.in);
        char qOrC = 'a';
        double borc =0;
        while(qOrC!='q'){
            System.out.print("Satın almak istediğiniz ürünün numarasını giriniz: ");
            int secilenUrun = input.nextInt();
            System.out.print("Kaç kilo almak istersiniz?: ");
            double kilo = input.nextDouble();
            borc = borc + kasa(kilo,b[secilenUrun-1]);
            System.out.println("Bitirmek için q alışverişe devam etmek için herhangi bir değer giriniz");
            qOrC = input.next().charAt(0);
        }
        System.out.println("Toplam ödemeniz gereken tutar: " + borc);
    }

    //Seçilen ürünün seçilen kilo kadar fiyatını hesaplayan method
    public static double kasa(double a, double b){
        double toplam = a*b;
        return toplam;
    }
}
