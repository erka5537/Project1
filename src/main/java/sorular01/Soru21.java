package sorular01;

import java.util.Arrays;

public class Soru21 {

    public static void main(String[] args) {

//        11) Tamsayılardan oluşan arrayde bulunan sıfırları, array sonuna yerleştiren kod yazınız.
//        Örnek: (5, 0, 2, 0, 3) ==> (5, 2, 3, 0, 0)

        int arr[] = {5,0,2,0,-3};

        int newArr[] = new int[arr.length];
        int i = 0;
        for(int w : arr){
            if(w!=0){
                newArr[i] = w;
                i++;
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}
