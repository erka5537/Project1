package sorular01;

import java.util.Arrays;
import java.util.Comparator;

public class Soru16 {

    public static void main(String[] args) {

        // Example 1: [0, 2, 3, 0, 12, 0] sıfırları en sona koyunuz
        //            [2, 3, 12, 0,  0,  0]

//        int arr[] = {0,2,3,0,12,0};
//        int newArr[] = new int[arr.length];
//        //Arrays.sort(arr);
//        int i = 0;
//        for(int w : arr){
//            if(w>0){
//                newArr[i] = w;
//                i++;
//            }
//        }
//        System.out.println(Arrays.toString(newArr));

/*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

        //Example 2: Bir Array'in içinde herhangi bir elemanın olup olmadığını kontrol eden ve kaç kere tekrarlandığını gösteren eden kodu yazınız
        //           [ 2, 1, 2, -3, 2] ==> Kullanıcı 2'yi sordu ==> 2 elemanı var ve 3 kere tekrarlandı
        //                             ==> Kullanıcı 6'yı sordu ==> 6 array'de yok

//        int arr[] = {2, 1, 2, -3, 2};
//        Scanner input = new Scanner(System.in);
//        System.out.println("Sorgulamak istediğiniz elemanı giriniz");
//        int varMı = input.nextInt();
//        int kacKere = 0;
//        for(int w : arr){
//            if(w==varMı){
//                kacKere++;
//            }
//        }
//        if(varMı>0){
//            if(varMı>1){
//                System.out.println(varMı + " Array'in içinde var, " + kacKere + " kere tekrarlandı");
//            } else if(varMı==1){
//                System.out.println(varMı + " Array'in içinde bir tane var");
//            }
//        }else System.out.println(varMı + " Array'in içinde yok");

/*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

        //Example  3: Size verilen bir cümledeki en uzun kelimeyi bulan kodu yazınız
        //            "Java kolaydır çalışana, ne kolay ki çalışmayana" ==> çalışmayana

        String str = "Java kolaydır çalışana, ne kolay ki çalışmayana";
        str = str.replaceAll("\\p{Punct}","");

        String arr[] = str.split(" ");

        Arrays.sort(arr,Comparator.comparingInt(String::length));
        System.out.println(arr[arr.length-1]);
    }
}
