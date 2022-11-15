package project_questions;

import java.util.Arrays;

public class UpdateRange {

    public static void main(String[] args) {

        /*
        UpdateRange
   URange isminde bir metod yazınız,
   Bu metod parametre olarak int Array ve 2 adet int almalı.
   Metod kendisine gönderilen Array ın içindeki elemanlardan, yine kendisine gönderilen
   rakamlar arasında olanlarına -1 değerini atasın.oluşan yeni diziyi göndersin.main de yazdırınız.
   Örnek:
    int array = 1,6,12,15,22,18,30,16
    int 1 = 10
    int 2 = 20
    sonuc  1,6,-1,-1,22,-1,30,-1  olmalı.
         */

        int[] arr = {1, 6, 12, 15, 22, 18, 30, 16};
        int birinciSayi = 20;
        int ikinciSayi = 10;

        int[] sonucArray = updateRange(arr, birinciSayi, ikinciSayi);
        System.out.println(Arrays.toString(sonucArray));


    }
    public static int[] updateRange(int[] a, int b, int c){
        for(int i=0; i<a.length; i++){
            if((a[i]<c && a[i]>b) || (a[i]<b && a[i]>c)){
                a[i] = -1;
            }
        }
        return a;
    }
}
