package sorular;

import java.util.Arrays;

public class Soru23 {

    public static void main(String[] args) {

        /* TASK :
        multidimensional arrayin iç array lerindeki tüm elemanların toplamını birer birer bulan
        ve herbir sonucu yeni bir arrayin elemanı yapan ve yeni array i ekrana yazdıran programı yaziniz.
        input {{10,20,30},{4},{6,7,20}}==> output ={60,4,33}

         */
        int arr[][] = {{10,20,30},{4},{6,7,20}};
        int brr[] = new int[arr.length];

        int tpl1 = 0;
        int tpl2 = 0;
        int tpl3 = 0;

        for(int w : arr[0]){
            tpl1 = tpl1 + w;
        }
        brr[0]=tpl1;
        for(int w : arr[1]){
            tpl2 = tpl2 + w;
        }
        brr[1]=tpl2;
        for(int w : arr[2]){
            tpl3 = tpl3 + w;
        }
        brr[2]=tpl3;
        System.out.println(Arrays.toString(brr));
    }
}
