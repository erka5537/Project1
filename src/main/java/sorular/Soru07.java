package sorular;

import java.util.Scanner;

public class Soru07 {

    public static void main(String[] args) {

//                Cinsiyet "Erkek" ise "Erkek" yazdırınız.
//                Cinsiyet "Kadın" ise "Kız" yazdırınız.
//                Cinsiyet "Erkek" ve "Kadın"dan farklıysa "Diğerleri" yazdırınız.
//                Not : Bu seçenekler dışındakilerini yoksayınız.

        Scanner input = new Scanner(System.in);
        System.out.println("Cinsiyet giriniz...");
        String cinsiyet = input.next();

        switch (cinsiyet.toLowerCase()){

            case "Erkek":
                System.out.println("Erkek");
                break;
            case "Kadın":
                System.out.println("Kadın");
        }

    }
}
