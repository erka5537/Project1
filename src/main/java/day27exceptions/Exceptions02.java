package day27exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {

    /*
        1) FileInputStream fis = new FileInputStream("src\\main\\java\\day27exceptions\\File1.txt");
           "new" den sonraki "FileInputStream" hata verir. Çünkü; biz Java'ya verilen adresteki dosya'ya git dedik, Java
           iki endişeye kapıldı i)Ya adres yanlışsa   ii)Ya verilen adreste dosya yoksa.
           Biz "method isminden" sonra, "throws FileNotFoundException" yazarak, Java'ya bu iki endişe duyduğun durum
           oluşursa "Exception At" dedik.

         2)while((k = fis.read()) != -1){} yazdığımızda "read()" method'u hata verir. Çünkü biz Java'ya dosya'daki
           karakterleri oku dedik. Java bir endişeye kapıldı i)Ya okuması gereken karakterler Java'nın bilmediği karakterlerse
           Biz method isminden sonra "throws IOException" yazarak, Java'ya bu durumla karşılaştığında "Exception At" dedik.

         3) Method isminden sonra "throws IOException" yazarsanız Java "throws FileNotFoundException"ı siler. Çünkü;
            "IOException", "FileNotFoundException"ı kapsar. "IOException", "FileNotFoundException"ın parent'idir, onun yaptığı
            her şeyi yapabilir o yüzden "IOException" varken "FileNotFoundException"a gerek yoktur.

            "IOException", "Input Output Exception" demektir.

          4) Gördüğünüz gibi "IOException", "Input Output Exception" biz kod yazarken, daha "Run" butonuna basmadan ortaya çıktı.
             Bu tarz Exception'lara "Compile Time Exception" denir, diğer adları "Checked Exception" dır.

             "Compile Time Exception" lar kesinlikle halledilmelidir(Exception Handling), halletmeden kod yazmaya devam etmeyiniz.
     */

    public static void main(String[] args) throws IOException {

        readTheTextFromTheFile();

        readTheText();
    }

    //Bir text file'daki text'i okuyan kodu yazınız.
    public static void readTheTextFromTheFile() throws IOException {

        FileInputStream fis = new FileInputStream("src\\main\\java\\day27exceptions\\File1.txt");

        int k = 0;
        while((k = fis.read()) != -1){
            System.out.print((char)k);
        }
    }

    //2.Way:
    public static void readTheText(){

        try {
            FileInputStream fis = new FileInputStream("src\\main\\java\\day27exceptions\\File1.txt");

            int k = 0;
            while((k = fis.read()) != -1){
                System.out.print((char)k);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Dosya'nın adresi veya varlığı ile ilgili bir problem var.");
        } catch (IOException e) {
            System.out.println("Dosya'da okunamayan bir karakter var");
        }
    }
}
