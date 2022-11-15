package project_questions;

import java.util.Scanner;

public class ATM {

    static String crKartNo = "4022851595753412";
    static String crSifre = "8365";
    static String sifre = "";
    static double bakiye = 8500.47;

    public static void main(String[] args) {

         /*      ATM
        Kullaniciya giriş için kart numarasi ve şifresini isteyin, eger herhangi birini yanlis girerse tekrar isteyin.
        Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
        Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,
        Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis.
        Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,
        Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger değilse menü ekranina geri donsun.
        Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,       */

        Scanner input = new Scanner(System.in);

        String kartNo = "";
        int islem = 0;
        while(true){
            if(islem==0){
                if(sifre.isEmpty()){
                    System.out.println("Kart numaranızı giriniz");
                    kartNo = input.nextLine().replace(" ","");
                    if(!crKartNo.equals(kartNo)){
                        System.err.println("Kart numarası yanlış");
                        continue;
                    }
                }

                System.out.println("Kart şifrenizi giriniz");
                sifre = input.nextLine();
                if(!crSifre.equals(sifre)){
                    System.err.println("Kart şifresi yanlış");
                    continue;
                }
            }

            if(crKartNo.equals(kartNo) && crSifre.equals(sifre)){
                islem = anaMenu();
                if(islem == 1){
                    System.out.println(bakiye);
                    System.out.println("Ana menü için ==> 1\nÇıkış için ==> 2");
                    int sorgu = input.nextInt();
                    if (sorgu == 1) {
                        continue;
                    }else if (sorgu == 2) {
                        cıkıs();
                        break;
                    }else System.err.println("Hatalı giriş yaptınız");
                    while (true) {
                        System.out.println("Ana menü için ==> 1\nÇıkış için ==> 2");
                        sorgu = input.nextInt();
                        if (sorgu == 1) {
                            break;
                        }else if (sorgu == 2) {
                            cıkıs();
                            break;
                        } else {
                             System.err.println("Hatalı giriş yaptınız");
                        }
                    }
                    break;

                }else if(islem == 2){
                    paraCek();
                    System.out.println("Ana menü için ==> 1\nÇıkış için ==> 2");
                    int sorgu = input.nextInt();
                    if(sorgu == 1){
                        continue;
                    }else System.err.println("Hatalı giriş yaptınız");
                    while (true) {
                        System.out.println("Ana menü için ==> 1\nÇıkış için ==> 2");
                        sorgu = input.nextInt();
                        if (sorgu == 1) {
                            break;
                        }else if (sorgu == 2) {
                            cıkıs();
                            break;
                        } else {
                            System.err.println("Hatalı giriş yaptınız");
                        }
                    }
                    break;

                }else if(islem == 3){
                    paraYatir();
                    System.out.println("Ana menü için ==> 1\nÇıkış için ==> 2");
                    int sorgu = input.nextInt();
                    if(sorgu == 1){
                        continue;
                    }else System.err.println("Hatalı giriş yaptınız");
                    while (true) {
                        System.out.println("Ana menü için ==> 1\nÇıkış için ==> 2");
                        sorgu = input.nextInt();
                        if (sorgu == 1) {
                            break;
                        }else if (sorgu == 2) {
                            cıkıs();
                            break;
                        } else {
                            System.err.println("Hatalı giriş yaptınız");
                        }
                    }
                    break;

                }else if(islem == 4){
                    paraGonder();
                    System.out.println("Ana menü için ==> 1\nÇıkış için ==> 2");
                    int sorgu = input.nextInt();
                    if(sorgu == 1){
                        continue;
                    }else System.err.println("Hatalı giriş yaptınız");
                    while (true) {
                        System.out.println("Ana menü için ==> 1\nÇıkış için ==> 2");
                        sorgu = input.nextInt();
                        if (sorgu == 1) {
                            break;
                        }else if (sorgu == 2) {
                            cıkıs();
                            break;
                        } else {
                            System.err.println("Hatalı giriş yaptınız");
                        }
                    }
                    break;

                }else if(islem == 5){
                    sifreDegistir();
                    System.out.println("Ana menü için ==> 1\nÇıkış için ==> 2");
                    int sorgu = input.nextInt();
                    if(sorgu == 1){
                        continue;
                    }else System.err.println("Hatalı giriş yaptınız");
                    while (true) {
                        System.out.println("Ana menü için ==> 1\nÇıkış için ==> 2");
                        sorgu = input.nextInt();
                        if (sorgu == 1) {
                            break;
                        }else if (sorgu == 2) {
                            cıkıs();
                            break;
                        } else {
                            System.err.println("Hatalı giriş yaptınız");
                        }
                    }
                    break;

                }else if(islem == 6){
                    cıkıs();
                    break;
                }



            }
        }

    }
    public static int anaMenu(){
        Scanner input = new Scanner(System.in);
        System.out.println("   ↓↓↓↓↓        İşlemler Menüsü   ↓↓↓↓↓");
        System.out.println("Bakiye Sorgula         ||         ==> 1");
        System.out.println("Para Çek               ||         ==> 2");
        System.out.println("Para Yatır             ||         ==> 3");
        System.out.println("Para Gönder            ||         ==> 4");
        System.out.println("Şifre Değiştir         ||         ==> 5");
        System.out.println("Çıkış                  ||         ==> 6");
        int islem = input.nextInt();
        return islem;
    }

    public static void paraCek(){
        Scanner input = new Scanner(System.in);
        System.out.println("Çekmek istediğiniz tutarı giriniz");
        double tutar = input.nextDouble();
        bakiye -= tutar;
        System.out.println("Kalan bakiye: "+bakiye);
    }
    public static void paraYatir(){
        Scanner input = new Scanner(System.in);
        System.out.println("Yatırmak istediğiniz tutarı giriniz");
        double tutar = input.nextDouble();
        bakiye += tutar;
        System.out.println("Kalan bakiye: "+bakiye);
    }
    public static void paraGonder(){
        Scanner input = new Scanner(System.in);
        System.out.println("IBAN no giriniz\nIBAN 'TR' ile başlamalı\ttoplam 26 karakterden oluşmalı");
        String iban = input.next().toUpperCase();
        if(iban.length()>26 || iban.length()<0 || !iban.startsWith("TR")){
            anaMenu();
        }else{
            System.out.println("Göndermek istediğiniz tutarı giriniz");
            double tutar = input.nextDouble();
            bakiye -= tutar;
            System.out.println("Kalan bakiye: "+bakiye);
        }

    }
    public static void sifreDegistir(){
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Mevcut şifreyi giriniz");
            String mevcut = input.next();
            if(crSifre.equals(mevcut)){
                System.out.println("Yeni şifreyi giriniz");
                String yeni = input.next();
                crSifre = yeni;
                sifre = yeni;
                break;
            }else{
                System.err.println("Mevcut şifre hatalı\n");
            }
        }
    }
    public static void cıkıs(){
        System.out.println("İyi günler...");
    }
}
