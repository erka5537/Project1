package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex18 {

    public static void main(String[] args) {
        //1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
        List<String> gunler = new ArrayList<>();
        gunler.add("Pazartesi");
        gunler.add("Sali");
        gunler.add("Çarşamba");
        gunler.add("Perşembe");
        gunler.add("Cuma");
        gunler.add("Cumartesi");
        gunler.add("Pazar");
        //2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
        List<Integer> gunlukKazanclar = new ArrayList<>();
        //3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
        Scanner input = new Scanner(System.in);
        int i = 1;
        while (i < 8) {
            System.out.println(gunler.get(i - 1) + " gününün kazancını giriniz");
            gunlukKazanclar.add(input.nextInt());
            i++;
        }
        //4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
        Integer ortalamaKazanc = getOrtalamaKazanc(gunlukKazanclar);
        System.out.println("Haftanın Ortalama Kazancı = " + ortalamaKazanc);
        //5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
        //     *           for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
        //     *           ortalama kazançtan yüksekse o günleri return yap.
        String ortUstuKazancGunleri = getOrtalamaninUstundeKazancGunleri(gunlukKazanclar, gunler);
        System.out.println("Ortalamanın üstündeki kazanç günleri ==> " + ortUstuKazancGunleri);
        //6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
        //     *           for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
        //     *           ortalama kazançtan aşağıysa o günleri return yap.
        String ortAltiKazancGunleri = getOrtalamaninAltindaKazancGunleri(gunlukKazanclar, gunler);
        System.out.println("Ortalamanın altındaki kazanç günleri ==> " + ortAltiKazancGunleri);
    }
    //4. Adım : getOrtalamaKazanc() adlı method oluşturduk
    public static Integer getOrtalamaKazanc(List<Integer> a) {
        int sum = 0;
        for (Integer w : a) {
            sum = sum + w;
        }
        return sum / a.size();
    }
    //5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
    public static String getOrtalamaninUstundeKazancGunleri(List<Integer> a, List<String> b) {
        Integer ortKazanc = getOrtalamaKazanc(a);
        String ortalamUstundekiGunler = "";
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > ortKazanc) {
                ortalamUstundekiGunler = ortalamUstundekiGunler + b.get(i) + ":" + a.get(i) + " ";
            }
        }
        return ortalamUstundekiGunler;
    }
    //6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
    public static String getOrtalamaninAltindaKazancGunleri(List<Integer> a, List<String> b) {
        Integer ortKazanc = getOrtalamaKazanc(a);
        String ortalamAltindakiGunler = "";
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) < ortKazanc) {
                ortalamAltindakiGunler = ortalamAltindakiGunler + b.get(i) + ":" + a.get(i) + " ";
            }
        }
        return ortalamAltindakiGunler;
    }
}
