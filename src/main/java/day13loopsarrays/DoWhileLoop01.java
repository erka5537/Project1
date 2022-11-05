package day13loopsarrays;

import java.util.Scanner;

public class DoWhileLoop01 {

    public static void main(String[] args) {

        //Example 1: Kullanıcıdan bir sayı alınız sayı 100 den küçük ise ekrana "Kazandınız!" yazdırınız
        //           Aksi halde ekrana "Kaybettiniz!" yazdırınız
        //           Kullanıcı kazandıkça oyun devam etmeli

        Scanner input = new Scanner(System.in);
//        int sayı = 0;
//        do{
//            System.out.println("Bir sayı giriniz");
//            sayı = input.nextInt();
//            if(sayı<100){
//                System.out.println("Kazandınız!");
//            }
//        }while(sayı<100);
//        System.out.println("Kaybettiniz!");

        //Example 2: Kullanıcıda ismini alınız ilk harfinin büyük harf olup olmadığını kontrol ediniz

//        do{
//            System.out.println("İsminizi giriniz");
//            char ilkHarf = input.next().charAt(0);
//
//            if(ilkHarf>='A' && ilkHarf<='Z'){
//                System.out.println("Ismi başarıyla girdiniz");
//            }else{
//                System.out.println("Ismi yanlış girdiğiniz için işleminiz iptal edilmiştir");
//                break;
//            }
//        }while(true);

        //Infinite Loop: Sonsuz döngü
        //Artırma azaltma kısmında hata yaparsanız "infinite loop sorunsalı" oluşur
//        for(int i=1; i<4; i++){
//            System.out.println("Hi");
//        }
        //Artırma azaltma kısmını yazmazsanız "infinite loop sorunsalı" oluşur
//        for(int i=1; i<4;){
//            System.out.println("Hi");
//        }

        int i = 12;

        while (i<15){
            System.out.println("Hi");
        }
    }
}
