package sorular;

import java.util.Arrays;
import java.util.Scanner;

public class Soru15 {

    public static void main(String[] args) {

        //Example 3: Bir öğretmenin sınıfındaki öğrencilerin isimlerini application'a yüklemesini sağlayan kodu yazınız.
        //           (Kullanıcıyla beraber bir Array oluşturunuz ve içine data ekleyiniz)

        Scanner input = new Scanner(System.in);
        System.out.println("Kaç öğrenci ismi gireceksiniz");
        int ogrSay = input.nextInt();
        String arr[] = new String[ogrSay];

        //System.out.println("Öğrenci isimlerini girmeye başlayabilirsiniz");
        //System.out.println("İşlemi sonlandırmak için q harfine basın");
        for(int i=1; i<=arr.length; i++) {

            System.out.println("Lütfen " + i + ". öğrenci ismini giriniz...");
            if(i==1){
                System.out.println("İşlemi sonlandırmak için q harfine basın");
            }
            String isim = input.next();

            if(isim.equalsIgnoreCase("q")){
                System.out.println("İşlem sonlandırıldı");
                break;
            }else{
                arr[i-1] = isim;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
