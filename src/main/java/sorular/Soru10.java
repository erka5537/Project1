package sorular;

import java.util.Scanner;

public class Soru10 {

    public static void main(String arg[]) {
//        Aşağıdaki çarpım tablosunu oluşturmak için kod yazınız.
//        3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30;

        int sayı = 3;

        for (int i=1; i<11;i++){

            System.out.print(sayı + "x" + i + "=" + sayı*i + " ");
        }
        System.out.println();

        int k = 1;
        int sayı1 = 3;

        while (k<11){
            System.out.print(sayı1 + "x" + k + "=" + sayı1*k + " ");
            k++;
        }
        System.out.println();

        int l = 1;
        int sayı2 = 3;
        do {
            System.out.print(sayı2 + "x" + l + "=" + sayı2*l + " ");
            l++;
        }while (l<11);
    }
}
