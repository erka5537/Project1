package sorular;

import java.util.Scanner;

public class Soru03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Biriş karakterini girin");
        char ch1= input.next().charAt(0);


/*
A
B B
C C C
D D D D
E E E E E
F F F F F F
şekli yazdırınız
*/

        char ch= 'A';
        for(int i=65; i<=ch1; i++){

            for(int k=65; k<=i; k++){
                System.out.print(ch + " ");
            }
            ch++;
            System.out.println();
        }
    }
}
