package day10stringmanipulations;

public class StringManipulations01 {

    public static void main(String[] args) {

        String a = "Java kolaydir.";

        //startsWith("kola",5) kodu ilk 5 karakterden sonraki String'e bakar ve o String'in "kola" ile başlayıp başlamadığını kontrol eder
        //"kola" ile başlıyorsa "true" başlamıyorsa "false" return eder.
        boolean b = a.startsWith("kola",5);
        System.out.println(b);

        //replaceFirst("a","*") kod String'teki ilk "a"yı "*" e çevirir.
        //replace("a","*") kod String'teki tüm "a"ları "*" e çevirir.
        String c = a.replaceFirst("a","*");
        System.out.println(c);//J*va kolaydir.

        //concat() method'u iki tane string'i birbirine yapıştırmaya yarar
        //"Concatenation" işlemi iki türlü yapılabilir; i) +ile ii) concat() ile
        //Java bir işlem için method üretmişse o method'u kullanmak best "practice" dir
        String d = a.concat(" Anladın mı?");
        System.out.println(d);

        String e = "    Tom Hanks    ";
        System.out.println(e);//"    Tom Hanks    "

        //trim() methodu bir String'in baş ve sonundaki "space" karakterlerini siler aradaki "space" karakterlerine dokunmaz
        String f = e.trim();
        System.out.println(f);//"Tom Hanks"

        String h = "Kbva";
        String i = "Java";

        //h.compareTo(i); kod iki tane String'i alfabetik(lexicographic) olarak karşılaştırır.
        //Büyük harf küçük harfe duyarlıdır.
        //Büyük harf küçük harfe duyarlı olmasını istemezseniz compareToIgnoreCase() kullanabilirsiniz
        //h.compareTo(i); kodda "h" nin alphabetic sırasından "i" nin alfabetik sırası çıkarılır
        int k = h.compareTo(i);
        System.out.println(k);

        //a.repeat(5) kodu "a" String'ini yanyana 5 kere yapıştırır
        //repeat(0) empty String return eder
        String n = a.repeat(5);
        System.out.println(n);

        //substring, equals, split (ÇOK ÖNEMLİ)
    }
}
