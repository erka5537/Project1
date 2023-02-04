package Ant;

import java.util.Arrays;
import java.util.Scanner;

public class Method01 {

    public static void main(String[] args) {
        // Verilen bir cumlede istenen harfin kac defa kullanildigini yazdiran
        // bir method olusturun
//
        System.out.println(kacDefa(harfleriBul()));

    }
    public static String[] harfleriBul(){

        Scanner input = new Scanner(System.in);
        System.out.println("Bir cümle giriniz");
        String cumle = input.nextLine().toLowerCase();

        String harfler[] = cumle.split("");
        System.out.println(Arrays.toString(harfler));
        return harfler;
    }

    public static int kacDefa(String[] a) {

        Scanner input = new Scanner(System.in);
        System.out.println("Sorgulamak istediğiniz harf ?");
        String harf = input.next().substring(0,1);
        int counter = 0;

        for (String w : a) {
            if (w.equals(harf)) {
                counter++;
            }
        }
        return counter;
    }
}
