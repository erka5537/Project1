package Ant;

import java.util.Arrays;
import java.util.Scanner;

public class S02 {

    public static void main(String[] args) {

        /* TASK :
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini yazdıran java code create ediniz (negatif sayilar da dahil olsun)

         */
        Scanner input = new Scanner(System.in);

        int arr[] = new int[8];
        int count = 0;
        for(int i=0; i<arr.length; i++){
            System.out.println("Sayıyı girip entera basın");
            int sayı = input.nextInt();
            arr[i] = sayı;
            if(sayı%3==0){
                count++;
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(arr)+"\n3 e bölünenlerin sayısı = "+count);
    }
}
