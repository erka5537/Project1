package Ant;

import java.util.Scanner;

public class S04 {

    public static void main(String[] args) {

        //Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın ve tersine ters çevrilmiş String'e atayın.
        Scanner input = new Scanner(System.in);
        String cümle = "";
        System.out.println("Programı sonlandırmak için 'q' yazıp enter a basın");
        do {
            System.out.println("Bir cümle girip enter a basın");
            cümle = input.nextLine();

            String arr[] = cümle.split(" ");

            for (int i = arr.length - 1; i >= 0; i--) {

                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }while(!cümle.equalsIgnoreCase("q"));
    }
}
