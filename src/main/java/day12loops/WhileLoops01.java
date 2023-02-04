package day12loops;

import java.util.Scanner;

public class WhileLoops01 {

    public static void main(String[] args) {

        //Example 1: 3 den 10 a kadar tamsayıları aynı satırda ekrana yazdıran kodu yazınız
        //1.Yol:

        for(int i=3; i<11;i++){
            System.out.print(i + " ");
        }

        System.out.println();

        //2.Yol
        int i=3;
        while(i<11){
            System.out.print(i + " ");

            i++;
        }
        System.out.println();
        //Example 2: 17 den 4 e kadar tüm çift sayıları ekrana aynı satırda yazdıran kodu yazınız

        int k=17;
        while(k>3){
            if(k%2==0) {
                System.out.print(k + " ");
            }
            k--;
        }
        System.out.println();
        //Example 3: 12 den 15 e kadar sayıların toplamını veren kodu yazınız
        int sum = 0;
        int m = 12;

        while (m<15){

            sum = sum + m;

            m++;
        }
        System.out.println(sum);

        //Example 4: Size verilen bir tam sayının rakamları toplamını ekrana yazdıran kodu yazınız

        int sonuc = 0;
        int sayı = 1234;

        while (sayı>0){
            sonuc = sonuc+sayı%10;
            sayı = sayı/10;
        }
        System.out.println(sonuc);

        //Example 5: Kullanıcıdan aldığınız bir sayının çarpım tablosunu ekrana yazdırınız
        //           3 ==> 3x1=3   3x2=6   3x3=9  ...   3x18=38

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz...");
        int s = input.nextInt();
        int artan = 1;

        while (artan<11){
            System.out.println("" + s + "x" + artan + "=" + s*artan);
            artan++;
        }
    }
}
