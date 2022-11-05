package day09stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {

    public static void main(String[] args) {

        String str = "Kara kara düşünme Ankara";

        //indexOf() method'u verilen character veya characterlerin ilk görünümünün index'ini verir.
        int idxA1 = str.indexOf("kara");//ilk görünümün ilk karakterinin indexini verir
        System.out.println(idxA1);//5

        //lastIndexOf() method'u verilen character veya characterlerin son görünümünün index'ini verir.
        int idxA2 = str.lastIndexOf("kara");//son görünümünün ilk karakterinin indexini verir
        System.out.println(idxA2);//20

        String s = "Mississippi";
        int idxI = s.indexOf('i');//indexOf() hem String hem cahr ile kullanılabilir.
        System.out.println(idxI);//1

        //Example 1: Bir String'teki bir karakterin tekrarlı veya tekrarsız olup olmadığını gösterne kodu yazınız.
        //           "Helloooo" ==> H->Tekrarsız    e->Tekrarsız     l-> Tekrarlı     o->Tekrarlı

        String t = "Helloooo";

        char c = 'o';

        if(t.indexOf(c)==t.lastIndexOf(c)){
            System.out.println("Tekrarsız");
        }else{
            System.out.println("Tekrarlı");
        }

        String u = "Learn Java earn money";

        //indexOf() iki parametre ile kullanılırsa ikinci parametre de verilen sayı kadar karakteri
        //geçtikten sonra istenen karakterin ilk görünümünün indexini return eder
        int sonuc = u.indexOf("e", 4);
        System.out.println(sonuc);//11

        //lastIndexOf() iki parametre ile kullanılırsa ikinci parametrede
        // verilen sayıyı index olarak kabul edip en baştan bu indexe kadar
        // olan karakterleri bir kutu içine alınız ve lastIndexOf() method'unu sadece bu kutu içindeki String için kullanınız
        int son = u.lastIndexOf("a", 5);
        System.out.println(son);//2

        String m= "Hello everyone";
        int e = m.lastIndexOf("e",10);
        System.out.println(e);

        String v = " ";
        //isEmpty() methodu bir String'in boş olup olmadığını kontrol eder. Eğer String'te hiç karakter yoksa
        //isEmpty() methodu "true" return eder herhangi bir karakter varsa "false" return eder
        //lenght()==0 demek isEmpty() "true" verir demektir.
        //Bir String'in boş olup olmadığını anlamak için lenght()==0 kullanmayın "isEmpty()" kullanın
        boolean bosMu = v.isEmpty();
        System.out.println(bosMu);

        String x = " ";
        //isBlank() hem boş String için hem de sadece space içeren Stringler için true return eder
        boolean blankMi = x.isBlank();
        System.out.println(blankMi);

        //Example 2: Kullanıcıdan alınan isim mutlaka space'den farklı en az bir karakter içermelidir.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen ilk isminizi giriniz...");
        String ilk = input.nextLine();

        if(ilk.isBlank()){
            System.out.println("Sana ismini gir dedim...");
        }else{
            System.out.println(ilk);
        }
    }
}
