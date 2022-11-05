package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {

    //Note: Arrays'lerin içine "primitive data type" leri ve "reference" lar yerleştirilebilir.

    public static void main(String[] args) {

        String str[] = new String[3];
        str[0] = "Java";
        str[1] = "did";
        str[2] = "surprise you";
        System.out.println(Arrays.toString(str));

        //Example 1: String bir Array oluşturunuz ve "Tom" ve "Tom" dan önceki tüm elemanları ekrana yazdırınız.

        String arr[] = {"Jane", "Mark", "Christopher", "Tom", "Ali", "Rojda"};

        for(String w : arr){
            System.out.print(w + " ");
            if(w.equals("Tom")){
                break;
            }
        }
        System.out.println();
        //Example 1: String bir Array oluşturunuz ve "Tom" ve "Jane" hariç tüm elemanları ekrana yazdırınız.

        String brr[] = {"Jane", "Mark", "Christopher", "Tom", "Ali", "Rojda"};

        for(String w : brr){

            if(w.equals("Tom") || w.equals("Jane")){
                continue;
            }
            System.out.print(w + " ");
        }
        System.out.println();
        //Example 3: Bir öğretmenin sınıfındaki öğrencilerin isimlerini application'a yüklemesini sağlayan kodu yazınız.
        //           (Kullanıcıyla beraber bir Array oluşturunuz ve içine data ekleyiniz)

        Scanner input = new Scanner(System.in);

        System.out.println("Kaç öğrenci ismi gireceksiniz?");
        int numOfStudent = input.nextInt();

        String names[] = new String[numOfStudent];

        System.out.println("Girişi sonlandırmak için Q harfina basınız");

        for(int i=1; i<=numOfStudent; i++){
            System.out.println("Lütfen " + i + ". öğrencinin ilk ismini giriniz");
            String stdNames = input.next();
            if(stdNames.equalsIgnoreCase("Q")){
                break;
            }
            names[i-1] = stdNames;
        }
        System.out.println(Arrays.toString(names));
    }
}
