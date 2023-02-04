package day26exceptions;

public class Exceptions02 {

    public static void main(String[] args) {

        char ch1 = getCharFromString("Java",2);//v
        System.out.println(ch1);

        char ch2 = getCharFromString("Selenium",8);
        System.out.println(ch2);//StringIndexOutOfBoundsException: Eğer bir String'den character/ler alırken olmayan bir index kullanılırsa
                                //                                 StringIndexOutOfBoundsException alınır.
    }

    //Bir String'in istediğimiz herhangi bir karakterini bize veren bir method oluşturun

    public static char getCharFromString(String str, int idx){
        char c = ' ';

        try{
            c = str.charAt(idx);
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("Index ile ilgili bir problem oluştu " + e.getMessage());//e.getMessage() mesajı verir

            e.printStackTrace();//Detaylı "log" için
            //Interview sorusu
            //Bir hata oluştuğunda ne yaparsınız?
            //"log"lara bakarım
        }
        return c;
    }
}
