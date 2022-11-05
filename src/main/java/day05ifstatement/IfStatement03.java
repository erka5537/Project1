package day05ifstatement;

import java.util.Scanner;

public class IfStatement03 {
    /*
       İki tane String in birbirine eşit olup olmadığını anlamak için "==" değil "equals()" kullanırız
       İki tane String in birbirine eşit olup olmadığını kontrol etmek için iki tane method kullanılabilir
           i)equals()==> Büyük, küçük harfi önemser "A" ile "a" farklıdır
           ii)equalsIgnoreCase()==> Büyük, küçük harfi önemsemez "A" ile "a" aynıdır
    */

    public static void main(String[] args) {

        //Example 1: Kullanıcıdan gün isimlerini aliniz, o günün hafta sonun mu hafta içi mi olduğunun kullanıcya söyleyiniz.
        //           Pazartesi==> Hafta içi      Pazar==> Hafta sonu

        Scanner input = new Scanner(System.in);
        System.out.println("Gün ismini giriniz...");
        String gun = input.next();

        //1.Yol
        if(gun.equalsIgnoreCase("Pazar")){
            System.out.println("Hafta sonu...");
        }else if(gun.equalsIgnoreCase("Pazartesi")){
            System.out.println("Hafta içi");
        }else if(gun.equalsIgnoreCase("Salı")){
            System.out.println("Hafta içi");
        }else if(gun.equalsIgnoreCase("Çarşamba")){
            System.out.println("Hafta içi");
        }else if(gun.equalsIgnoreCase("Perşembe")){
            System.out.println("Hafta içi");
        }else if(gun.equalsIgnoreCase("Cuma")){
            System.out.println("Hafta içi");
        }else if(gun.equalsIgnoreCase("Cumaertesi")){
            System.out.println("Hafta sonu");
        }else{
            System.out.println("Geçerli bir gün ismi giriniz...");
        }

        //2.Yol:
        if(gun.equalsIgnoreCase("Pazar") ||
           gun.equalsIgnoreCase("Cumartesi")){
           System.out.println("Hafta sonu...");
        }else if(gun.equalsIgnoreCase("Pazartesi") ||
                 gun.equalsIgnoreCase("Sali") ||
                 gun.equalsIgnoreCase("Carsamba") ||
                 gun.equalsIgnoreCase("Persembe") ||
                 gun.equalsIgnoreCase("Cuma")){
            System.out.println("Hafta ici...");
        }else{
            System.out.println("Gecerli bir gun ismi giriniz...");
        }

        //3.Yol:
        boolean haftaSonu = gun.equalsIgnoreCase("Pazar") || gun.equalsIgnoreCase("Cumartesi");

        boolean haftaIci = gun.equalsIgnoreCase("Pazartesi") ||
                           gun.equalsIgnoreCase("Sali") ||
                           gun.equalsIgnoreCase("Carsamba") ||
                           gun.equalsIgnoreCase("Persembe") ||
                           gun.equalsIgnoreCase("Cuma");
        if(haftaSonu){
            System.out.println("Hafta sonu...");
        }else if(haftaIci){
            System.out.println("Hafta ici...");
        }else{
            System.out.println("Gecerli bir gun ismi giriniz...");
        }
    }
}
