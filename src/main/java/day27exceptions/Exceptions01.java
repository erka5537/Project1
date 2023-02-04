package day27exceptions;

public class Exceptions01 {

    public static void main(String[] args) {

        double r1 = compareNumOfCharacters("Java","xy");
        System.out.println(r1);//2.0

        double r2 = compareNumOfCharacters(null,"xy");
        System.out.println(r1);

        double r3 = compareNumOfCharacters("Selenium","");
        System.out.println(r1);
    }

    //Verilen iki String'ten birinin karakter sayısının diğerinin kaç katı oluğunu veren method oluşturunuz

    public static double compareNumOfCharacters(String s, String t){

        double result = 0;

        try{
            result = s.length() / t.length();
        }catch(NullPointerException e){
            System.out.println("length() method'u null ile kullanılamaz");
        }catch(ArithmeticException e){
            System.out.println("Herhangi bir sayı sıfır ile bölünemez");
        }finally {
            System.out.println("Database ile connection kesildi");
        }
        return result;
    }

    /*
        "final", "finally", "finalize", açıklayınız.
        1)"final" bir keyword'dur. Variable, Class ve Method'lar için kullanılır. ...
        2)"finally" bir "code block"tur.
          "try-catch" veya sadece "try" ile kullanılır.
          "finally" code block içine yazılan code'lar her halükarda çalıştırılır.
          Mesela Database ile connection'ı kesmek her halükarda yapılması gereken bir fiildir. Bunu "finally" ile yapabiliriz.
        3)"finalize" bir method'dur. Bu method Java tarafından data'lar imha edilmeden önce çağırılır. Bu method data'ları
          imha edilecek hale getirir ve daha sonra "Garbage Collector" bu data'ları imha eder.

          "finalize" bir method'unu Java Developer'lar da çağırabilir ama Java kendi bildiğini yapar.
    */
}
