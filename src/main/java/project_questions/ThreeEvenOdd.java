package project_questions;

public class ThreeEvenOdd {

    public static void main(String[] args) {

        /*
   Parametre olarak int dizisi verildiğinde
   array 3 tane çift veya 3 tane  tek değer içeriyorsa true değerini döndürür.
   Örnek:
   intArray([2, 1, 3, 5]) sonuc  true olmalı
   intArray([2, 1, 2, 5]) sonuc   false olmalı
   intArray([2, 4, 2, 5]) sonuc   true olmalı
   */

        int[] arr1 = {2, 1, 3, 5};
        int[] arr2 = {2, 1, 2, 5};
        int[] arr3 = {2, 4, 2, 5};

        System.out.println(threeEvenOdd(arr1));
        System.out.println(threeEvenOdd(arr2));
        System.out.println(threeEvenOdd(arr3));
    }
    public static boolean threeEvenOdd(int[] a){
        int ciftCounter = 0;
        int tekCounter = 0;
        boolean result = false;

        for(int w : a){
            if(w%2==0){
                ciftCounter++;
            }
        }
        for(int w : a){
            if(w%2!=0){
                tekCounter++;
            }
        }
        if(ciftCounter==3 || tekCounter==3){
            result = true;
        }
        return result;
    }
}
