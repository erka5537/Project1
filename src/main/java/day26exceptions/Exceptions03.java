package day26exceptions;

public class Exceptions03 {

    public static void main(String[] args) {

        double d = divideStringByTheNumOfTheChar("124");
        System.out.println(d);

        double d2 = divideStringByTheNumOfTheChar(null);
        System.out.println(d2);
    }

    //String'deki character sayısını bulunuz String'i integer'a çeviriniz, Integer'i character sayısına bölünüz.
    //1.Yol

    public static double divideStringByTheNumOfTheChar(String str){
        int length = 0;
        int i = 0;
        double sonuc = 0;
        try {
            length = str.length();//NullPointerException "null" String ile "lenght()" kullanıldığında alınır
            i = Integer.valueOf(str);//NumberFormatException Içinde rakamdan farklı character olan String'ler valueOf() ile kullanıldığında
            sonuc = i / length;//ArithmeticException: Bölen sayı sıfır olduğunda alınır.
        }catch(NullPointerException e){
            System.out.println("==> "+e.getMessage());
        }catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        return sonuc;
    }

    //2.Yol
    public static double divideStringByTheNumOfTheCharacter(String str){
        int length = 0;
        int i = 0;
        double sonuc = 0;
        try {
            length = str.length();//NullPointerException "null" String ile "lenght()" kullanıldığında alınır
            i = Integer.valueOf(str);//NumberFormatException Içinde rakamdan farklı character olan String'ler valueOf() ile kullanıldığında
            sonuc = i / length;//ArithmeticException: Bölen sayı sıfır olduğunda alınır.
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return sonuc;
    }

    //3.Yol
    public static double divideStringByTheNumOfTheCharacters(String str){
        int length = 0;
        int i = 0;
        double sonuc = 0;
        try {
            length = str.length();//NullPointerException "null" String ile "lenght()" kullanıldığında alınır
            i = Integer.valueOf(str);//NumberFormatException Içinde rakamdan farklı character olan String'ler valueOf() ile kullanıldığında
            sonuc = i / length;//ArithmeticException: Bölen sayı sıfır olduğunda alınır.

        }catch(NullPointerException e){
            System.out.println("NullPointer'a özel...");
        }catch(Exception e){
            System.out.println("Diğer tüm Exception'lar için...");
        }
        return sonuc;
    }
    /*
        Note: 1)Aralarında "parent-child" relationship olan Exception Class'ların multiple catch'lerde kullanmak isterseniz
                "child" olan önce kullanılmalıdır, aksi takdirde hata verir.
              2)Aralarında "parent-child" relationship olmayab Exception Class'ların multiple catch'lerde kullanmak isterseniz
                sıralamanın bir önemi yoktur.
    */
}
