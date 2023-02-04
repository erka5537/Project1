package day07ternarystringmanipulation;

public class StringManipulations01 {

    public static void main(String[] args) {

        /*
                                        String Class Methodları
                 1)equals(): i)İki tane String'in aynı olup olmadığını anlamamıza yarar
                             ii)equals() methodu "boolean" return eder

                 2)equalsIgnoreCase(): i)İki tane String'in aynı olup olmadığını büyük harf küçük harfe dikkat etmeden anlamamıza yarar
                                       ii)equalsIgnoreCase() methodu "boolean" return eder

                 3)toLowerCase(): i)Bir String'teki tüm harfleri küçük harfe çevirmek için kullanılır.
                                  ii)toLowerCase() methodu "String" return eder

                 4)toUpperCase(): i)Bir String'teki tüm harfleri büyük harfe çevirmek için kullanılır.
                                  ii)toLowerCase() methodu "String" return eder

                 5)charAt(): i)Bir stringten belli bir indexteki characteri almak için kullanılır.
                             ii)charAt() methodu "char" return eder

                 6)lenght(): i)Bir String'te kaç tane karakter kullanıldığını öğrenmek için kullanılır
                             ii)lenght() methodu "int" return eder

                 7)contains(): i)Bir stringte belli bir karakterin veya karakterlerin var olup olmadığını anlamak için kullanılır.
                               ii)contains() methodu "boolean" return eder.

                 8)split(): i)Bir String'i istediğimiz karakterden parçalamaya yarar.
                            ii)split() methodu "Array" return eder.
         */

        /*
                Bir passwordun geçerli olup olmadığını aşşağıdaki kurallara göre kontrol eden kodu yazınız
                            i)En az 8 karakter içermeli
                            ii)Space karakteri içermemeli
                            iii)İlk harfi "M" veya "m" olmalı
                            iv)Son karakteri "?" olmalı
         */

        String pwd = "manisa12?";

        //i)En az 8 karakter içermeli
        boolean first = pwd.length()>7;

        //ii)Space karakteri içermemeli
        boolean second = !pwd.contains(" ");

        //iii)İlk harfi "M" veya "m" olmalı
        boolean third = pwd.charAt(0)=='M' || pwd.charAt(0)=='m';

        //iv)Son karakteri "?" olmalı
        boolean fourth = pwd.charAt(pwd.length()-1)=='?';

        System.out.println(first && second && third && fourth);
    }
}
