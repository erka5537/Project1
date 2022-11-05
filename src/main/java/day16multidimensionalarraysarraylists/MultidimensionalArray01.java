package day16multidimensionalarraysarraylists;

import java.util.Arrays;

public class MultidimensionalArray01 {

    /*
        Array veya Collection varsa "for-each-loop" kullanarak ilk tercihiniz olsun
        Array veya Collection var ama "index" kullanmak zorundasiniz o zaman "for-each-loop" calismaz, "for-loop" veya "while-loop" veya "do-while-loop" kullanmalisiniz
     */

    public static void main(String[] args) {

        //Bir tane multidimensional array oluşturunuz
        //Bu array'deki tüm sayıların toplamını veren kodu yazınız

        int arr[][] = {{2, 5, 1}, {32, 75}, {13, 21, 43, 56}};
        int sum = 0;

        for(int[] w : arr) {
            for (int k : w) {
                sum = sum + k;
            }
        }
        System.out.println(sum);

        //Bir multidimensional array'i normal array'e çeviren kodu yazınız
        // { {2, 5, 1}, {32, 75} } ==> { 2, 5, 1, 32, 75}

        int brr[][] = { {2, 5, 1}, {32, 75} };

        int toplam = 0;

        for(int[] w : brr){

            toplam = toplam + w.length;
        }
        System.out.println(toplam);

        int crr[] = new int[toplam];

        int idx = 0;
        for(int[] w : brr){

            for(int k : w){
                crr[idx] = k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(crr));
    }
}
