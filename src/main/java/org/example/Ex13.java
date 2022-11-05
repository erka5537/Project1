package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {

        /* TASK :
         * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
         * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
         *
         * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
         * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
         * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
         * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
         * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
         *           for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         *           ortalama kazançtan yüksekse o günleri return yap.
         * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
         *           for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         *           ortalama kazançtan aşağıysa o günleri return yap.
         * */

        Scanner input = new Scanner(System.in);
        List<String> gunler = new ArrayList<>();
        gunler.add("Pazartesi");
        gunler.add("Salı");
        gunler.add("Çarşamba");
        gunler.add("Perşembe");
        gunler.add("Cuma");
        gunler.add("Cumartesi");
        gunler.add("Pazar");

        List<Double> gunlukKazanclar = new ArrayList<>();

        int idx = 0;
        while (idx < gunler.size()) {
            System.out.print(gunler.get(idx) + " gününün kazancını giriniz: ");
            gunlukKazanclar.add(input.nextDouble());
            idx++;
        }

        System.out.println("1 haftalık ortalama kazanç: " + getOrtalamaKazanc(gunlukKazanclar));
        getOrtalamaninUstundeKazancGünleri(gunler,gunlukKazanclar);
        System.out.println();
        getOrtalamaninAltindaKazancGünleri(gunler,gunlukKazanclar);

    }

    //Ortalama kazancı bulan method
    public static double getOrtalamaKazanc(List<Double> a) {
        double toplam = 0;
        for (Double w : a) {
            toplam = toplam + a.get(a.indexOf(w));
        }
        double ortalama = toplam / a.size();

        return ortalama;
    }

    //Ortlamanın üstende kazanç sağlanan günleri bulan method
    public static void getOrtalamaninUstundeKazancGünleri(List<String> a, List<Double> b){

        double skala = getOrtalamaKazanc(b);

        System.out.print("Ortalamanın üstende kazanç sağladığınız günler: ");

        int idx = 0;
        for(Double w : b){
            if(w>skala){
                System.out.print(a.get(idx) + ", ");
            }
            idx++;
        }
    }

    ////Ortlamanın altında kazanç sağlanan günleri bulan method
    public static void getOrtalamaninAltindaKazancGünleri(List<String> a, List<Double> b){

        double skala = getOrtalamaKazanc(b);

        System.out.print("Ortalamanın altında kazanç sağladığınız günler: ");
        int idx = 0;
        for(Double w : b){
            if(w<skala){
                System.out.print(a.get(idx) + ", ");
            }
            idx++;
        }
    }
}





