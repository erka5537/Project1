package sorular01;

import java.util.Scanner;

public class Soru08 {

    public static void main(String[] args) {

        /* TASK :
 Kullanıcıdan x  girilene kadar ekrana "Program çalışıyor" yazan
  ve x girildiğinde ise "Program bitti" yazan programı yazınız.

 */

        Scanner input = new Scanner(System.in);
        String karakter;
        do {
            System.out.println("karakter girin");
            karakter = input.next();

            if (!karakter.equals("x")){
                System.out.println("Program çalışıyor");
            }

        }while (!karakter.equals("x"));
        System.out.println("Program bitti");

    }
}
