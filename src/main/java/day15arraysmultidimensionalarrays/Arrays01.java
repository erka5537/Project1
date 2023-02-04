package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        //binarySearch() Method: Bu methodu kullanarak bir elemanın arrayde olup olmadığını anlarız.
        //                       binarySearch() methodunu kullanmadan önce mutlaka "Arrays.sort()" kullanılmalıdır.
        //                       binarySearch() method'u aradığınız eleman Array'de varsa o elemanın indexini return eder

        //                       binarySearch() method'u aradığınız eleman Array'de yoksa "-a" şeklinde bir negatif sayı alırsınız.
        //                       Bu sayıdaki "-" işaretinin anlamı bu eleman array de yok demektir
        //                       Bu sayıdaki "a" nın anlamı olsaydı kaçıncı sırada olurdu demektir.

        //                       binarySearch() Method'u tekrarlayan elemanlar için kullanılmaz.

        int arr[] = {12, 31, 43, 14};

        //varsa durumu
        int sayı1 = 43;
        Arrays.sort(arr);// [12, 14, 31, 43]
        int idx1 = Arrays.binarySearch(arr,sayı1);
        System.out.println(idx1);//3

        //yoksa durumu
        int sayı2 = 17;
        int sonuc = Arrays.binarySearch(arr,sayı2);
        System.out.println(sonuc);//-3
    }
}
