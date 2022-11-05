package day13loopsarrays;

import java.util.Arrays;
import java.util.Collections;

public class Arrays01 {

    /*
        1)Aynı data tipinde, çoklu datayı depolamak için java nın oluştursuğu yapılar vardır
          Bu yapılardan birisi de "Array" lerdir
    */

    public static void main(String[] args) {

        //Array nasıl oluşturulur?
        int stdAges[] = new int[7];// [ 0, 0, 0, 0, 0, 0, 0// ]

        //Array nasıl yazdırılır?
        System.out.println(Arrays.toString(stdAges));

        //Array'lere elemanlar nasıl eklenir?
        stdAges[0] = 12;
        stdAges[1] = 11;
        stdAges[2] = 13;
        stdAges[3] = 14;
        stdAges[4] = 10;
        stdAges[5] = 12;
        stdAges[6] = 12;
        System.out.println(Arrays.toString(stdAges));//[12, 11, 13, 14, 10, 12, 12]

        //Array'deki herhangi bir elemanı nasıl yazdırabiliriz
        System.out.println(stdAges[4]);//10

        //Example 1: Array'deki en küçük ve enbüyük elemanın toplamını ekrana yazdırınız
        Arrays.sort(stdAges);
        System.out.println(Arrays.toString(stdAges));//[10, 11, 12, 12, 12, 13, 14]

        int ilk = stdAges[0];

        //Note: "lenght()" String'lerde kullanılır, "lenght" Array'lerde kullanılır.
        int son = stdAges[stdAges.length-1];

        System.out.println(ilk+son);//24

        //Example 2: stdAges Array'i içindeki tüm elemanların toplamını ekrana yazdıran kodu yazınız.

        int sum = 0;

        for(int i=0;i<stdAges.length;i++){

            sum = sum +stdAges[i];
        }
        System.out.println(sum);

        //2.Yol: while-loop
        int i=0;

        int toplam = 0;

        while(i<stdAges.length){

            toplam = toplam +stdAges[i];
            i++;
        }
        System.out.println(toplam);

        //3.Yol: do-while-loop

        int k=0;

        int s = 0;

        do{
            s = s + stdAges[k];
            k++;
        }while(k< stdAges.length);
        System.out.println(s);

        //4.Yol: for each loop Array'lerde ve Collections'larda kullanılır

        int t = 0;

        for(int w : stdAges){
            t = t +w;
        }
        System.out.println(t);

        //Example 3: String bir array oluşturunuz
        //           Bu Array'e 5 tane isim yerleştiriniz
        //           Bu isimlerdeki karakter sayılarının toplamını ekrana yazdırınız

        String stdNames[] = new String[5];
        stdNames[0] = "Ali";
        stdNames[1] = "Tom";
        stdNames[2] = "Veli";
        stdNames[3] = "Kemal";
        stdNames[4] = "Cem";

        int karakterSayilariToplami = 0;

        for(String w: stdNames){

            karakterSayilariToplami = karakterSayilariToplami + w.length();

        }
        System.out.println(karakterSayilariToplami);//18

        //Example 4: Char bir Array oluşturunuz
        //           Bu Array'e 5 eleman ekleyiniz
        //           Bu Array'deki sadece büyük harfleri ekrana yazdırınız

        char ch[] = {'A', 'c', 'D', 'k', 'M'};

        for(char w : ch){

            if(w>='A' && w<='Z'){
                System.out.println(w);
            }
        }
    }
}
