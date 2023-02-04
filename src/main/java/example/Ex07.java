package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {

        /* TASK :
        Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        sadece tek elemanlarını ayrı diziye bir metodda atayarak
         yazdırınız.

        */

        Scanner input = new Scanner(System.in);
        List<Integer> sayılar = new ArrayList<>();

        List<Integer> tekSayılar = new ArrayList<>();


        for (int i = 0; i < 6; i++) {
            System.out.println("Bir tam sayı eleman girin");
            int sayı = input.nextInt();
            sayılar.add(sayı);
        }
        System.out.println(sayılar);
        for (Integer w : sayılar) {
            if (w % 2 != 0) {
                tekSayılar.add(w);
            }
        }
        System.out.println(tekSayılar);
    }
}
