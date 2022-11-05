package sorular;

import java.util.Scanner;

public class Soru02 {

    public static void main(String[] args) {

        /* TASK :
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       */


//        System.out.println("İsim ve soyisminizi girin");//Erkam Kılınç
//        String isimSoyIsim = input.nextLine();
//        String isim = isimSoyIsim.split(" ")[0];
//        String soyIsim = isimSoyIsim.split(" ")[1];
//
//        System.out.println(isim+ "\n" + soyIsim);

        Scanner input = new Scanner(System.in);
        System.out.print("kart no gir");
        String kartNo = input.next()+" "+input.next() + " " + input.next()+" "+input.next();

        System.out.println(kartNo);


    }
}
