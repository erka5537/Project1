package sorular;

import java.util.Arrays;

public class Soru17 {

    public static void main(String[] args) {

//        int arr[] = {13,31,43,14};
//        int varMı = 10;
//        System.out.println(Arrays.binarySearch(arr,varMı));

        //Example 1: Size verilen pozitif ve negatif sayılar içeren bir Integer Arraydeki "en büyükk negatif" ve "en küçük pozitif elemanı bulunuz.

//        int arr[] = {-12, 18, -5, 23, -2, 0};
//
//        Arrays.sort(arr); //{-12, -5, 0, 18, 23}
//
//        int maxNegative = arr[0];
//        int minPozitive = arr[arr.length-1];
//
//
//
//        for (int w : arr){
//
//            if(w<0){
//                maxNegative = Math.max(w,maxNegative);
//            }
//            if(w>0){
//                minPozitive = Math.min(w,minPozitive);
//            }
//        }
//        System.out.println(maxNegative + " " + minPozitive);

        //Example 2: Bir Stringteki sesli harflerin sayısını bulan kodu yazınız
        //           a - e - i - o - u - A - E - I - O - U
        String str = "Java ogrenince para kazanmak kolay ogrenmeyince ne kolay ki.";

        String arr[] = str.split("");
        int kac = 0;
        for(String w : arr){

            switch(w.toLowerCase()){

                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    kac++;
            }
        }
        System.out.println(kac);
    }
}
