package sorular;

import java.util.Scanner;

public class Soru11 {

    public static void main(String[] args) {

        /*
        Soru 5 ) Kullanicidan bîr şifre girmesini isteyin. Girilen şifreyi asagidaki şartlara gore kontrol edin ve şifredeki hatalari yazdirin.
        Kullanici geçerli bir şifre girinceye kadar bu işlemi tekrar edin ve geçerli şifre girdiğinde
        "Şifreniz Kabul edilmiştir" yazdirin.
        - Şifre kucuk harf içermelidir
         - Şifre buyuk harf içermelidir
         - Şifre özel karakter içermelidir
         - Şifre en az 8 karakter olmalidir.
         */


        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Lutfen bir sifre giriniz");
            String pwd = input.next();
            boolean uzunluk = pwd.length() > 7;
            boolean buyukHarf = pwd.replaceAll("[^A-Z]", "").length() > 0;
            boolean kucukHarf = pwd.replaceAll("[^a-z]", "").length() > 0;
            boolean ozelKarakter = pwd.replaceAll("\\w", "").length() > 0;


            if (uzunluk && buyukHarf && kucukHarf && ozelKarakter) {
                System.out.println("Şifreniz Kabul edilmiştir");
                break;
            }else if(uzunluk && buyukHarf && ozelKarakter){
                System.out.println("şifre küçük harf içermiyor");
            }
            else if(uzunluk && buyukHarf && kucukHarf){
                System.out.println("şifre özel karakter içermiyor");
            }
            else if(buyukHarf && kucukHarf && ozelKarakter){
                System.out.println("şifre en az 8 karakter olmalı");
            }
            else if(uzunluk && kucukHarf && ozelKarakter){
                System.out.println("şifre büyük harf içermeli");
            }

        } while (true);

        /*
        //Write code here

		    String b = "Java 1235 ?!@$_";

		    // \\d ifadesi tum rakamlari(digit) temsil eder.
		System.out.println(b.replaceAll("\\d","*"));
		System.out.println(b);
		// ===>  \\D rakamlardisindaki hersey
		System.out.println(b.replaceAll("\\D","*"));

		//==> \\S space disindaki hersey
		System.out.println(b.replaceAll("\\S","*"));

		//==> \\s space ifadesidir.
		System.out.println(b.replaceAll("\\s","*"));
		// replace ile yapma
		System.out.println(b.replace(" ","*"));

		//==>  \\w ifadesi (word->kelime ve hadf) a-z A-Z 0-9 _  bunlari kapsar
		System.out.println(b.replaceAll("\\w","*"));

		//==>  \\W ifadesi a-z A-Z 0-9 _ disindakileri kapsar

		System.out.println(b.replaceAll("\\W","*"));
         */
    }
}
