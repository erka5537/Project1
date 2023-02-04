package sorular01;

import java.util.Arrays;
import java.util.Scanner;

public class Soru20 {

    public static void main(String[] args) {

//        12) Kullanıcıdan aldığınız tamsayılar ile bir array oluşturunuz ve bu arraydeki en küçük ve en
//            büyük öğeler arasındaki farkı konsolda yazdırınız.

        Scanner input = new Scanner(System.in);
        System.out.println("Array eleman sayısını giriniz...");
        int elemanSayısı = input.nextInt();

        int newArr[] = new int[elemanSayısı];

        for(int i=1; i<=elemanSayısı; i++){
            System.out.println(i + ". elemanı giriniz...");
            newArr[i-1] = input.nextInt();
        }
        Arrays.sort(newArr);
        System.out.println(newArr[newArr.length-1]-newArr[0]);
    }
}
