package day16multidimensionalarraysarraylists;

import java.util.Arrays;

public class MultidimensionalArray02 {

    public static void main(String[] args) {

        //Bir multidimensional array deki en büyük ve en küçük elemanın toplamını veren kodu yazınız.
        int arr[][] = { {2, 5, 1}, {83, 75} };
        int maxElements = arr[0][0];
        int minElement = arr[0][0];
        for(int[] w : arr){
            for(int k : w){
                maxElements = Math.max(maxElements,k);
                minElement = Math.min(minElement,k);
            }
        }
        System.out.println(maxElements+minElement);
    }
}
