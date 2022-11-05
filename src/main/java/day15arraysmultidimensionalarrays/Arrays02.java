package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays02 {

    public static void main(String[] args) {

        //Example 1: Size verilen pozitif ve negatif sayılar içeren bir Integer Arraydeki "en büyükk negatif" ve "en küçük pozitif elemanı bulunuz.
        int arr[] = {-12, 18, -5, 23, 0};

        Arrays.sort(arr);// [-12, -5, 0, 18, 23]

        int maxNegative = arr[0];
        int minPositive = arr[arr.length-1];

        for(int w : arr){

            if(w<0){
                maxNegative = Math.max(maxNegative,w);
            }
            if(w>0){
                minPositive = Math.min(minPositive, w);
            }
        }
        System.out.println("En büyük negatif" + maxNegative
                          +"\nEn küçük pozitif" + minPositive);
    }
}
