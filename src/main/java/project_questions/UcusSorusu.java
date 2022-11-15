package project_questions;

import java.util.Scanner;

public class UcusSorusu {

    public static void main(String[] args) {

        /*
    A şehrinden uçmak isteyen bir yolcu
    B şehrine 500km
    C şehrine  700km
    D şehrine  900 km mesafededir.
    Bilet tarifesi:
    km birim fiyati : 0.10$
    yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
    12 ve 24 yas arasindaysa 10% indirim,
    65 yasindan buyukse 30% indirim,
    bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz
 */

        Scanner input = new Scanner(System.in);
        System.out.println("Gitmek istediğiniz şehri yazınız\n" +
                "Ankara   ==> 500km\n" +
                "İstanbul ==> 700km\n" +
                "Samsun   ==> 900km");
        String sehir = input.next().toLowerCase();
        System.out.println("Yaşınızı belirtiniz");
        int yas = input.nextInt();
        System.out.println("Gidiş-Dönüş almak için ==>A");
        System.out.println("Tek yön almak için     ==>B");
        char gidisDonus = input.next().toUpperCase().charAt(0);

        double fiyat = 0;

        if(sehir.equals("ankara")){
            fiyat = yonIndirim(gidisDonus, indirim(yas, 500*0.10));
        }else if(sehir.equals("istanbul")){
            fiyat = yonIndirim(gidisDonus, indirim(yas, 700*0.10));
        }else if(sehir.equals("samsun")){
            fiyat = yonIndirim(gidisDonus, indirim(yas, 900*0.10));
        }else{
            System.out.println("Belirtilen şehirler harici bilet satışı yoktur");
        }
        System.out.println("Ödemeniz gereken tutar: "+fiyat+"$");
    }

    public static double indirim(int yas, double fiyat){
        double result = 0;
        if(yas<12){
            result = fiyat / 2;
        }else if(yas>=12 && yas<=24){
            result = fiyat*(100-10) / 100;
        }else if(yas>65){
            result = fiyat*(100-30) / 100;
        }else result = fiyat;
        return result;
    }
    public static double yonIndirim(char y, double s){
        double sonuc = 0;
        if(y=='A'){
            sonuc = (s * 2)*(100-20) / 100;
        }else if(y=='B'){
            sonuc = s;
        }else System.out.println("Hatalı giriş yaptınız");
        return sonuc;
    }
}
