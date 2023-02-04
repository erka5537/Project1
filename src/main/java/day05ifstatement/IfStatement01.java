package day05ifstatement;

import java.util.Scanner;

public class IfStatement01 {

    public static void main(String[] args) {

        //Example 1: Kullanıcıdan alınan sayının tek mi çift mi olduğunu ekrana yazan kodu yazınız.
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz...");
        int s = input.nextInt();

        //1.Yol:
        if(s%2==0){
            System.out.println("Çift sayı...");
        }
        if(s%2!=0){//"!=" demek "eşit değil" demektir
            System.out.println("Tek sayı...");
        }

        //2.Yol:
        if(s%2==0){
            System.out.println("Çift sayı");
        }else{
            System.out.println("Tek sayı");
        }

        //Example 2: Bir sayının negatif, pozitif veya nötr olduğunu söyleyen kodu yazınız
        System.out.println("Bir sayı giriniz...");
        double d = input.nextDouble();

        if(d>0){
            System.out.println("Pozitif...");
        }else if(d==0){
            System.out.println("nötr");
        }else {
            System.out.println("negatif");
        }
    }
}
