package day20stringbuilderstringbuffer;

public class StringBuilder01 {

    /*
        1)"StringBuilder" Java'da bir Class'dır.
        2)"StringBuilder", String oluşturmaya yarar.
        3)"String" Class varken niçin "StringBuilder" a ihtiyaç duyarız?
          Çünkü "String" Class "Immutable Class" dır, ama biz bazen "Mutable" String'lere ihtiyaç duyarız
          StringBuilder bize "Mutable" String verir
        4)"Immutable Class" larda var olan değer değiştirilemez. Siz var olan bir değeri değiştirmek istediğiniz de
           i)Memory'de yeni bir variable yeni değerle oluşturulur
           ii)Eski variable'ın pointer'ı yeni variable'a döndürülür
           iii)Eğer bir variable'ı hiçbir pointer göstermiyorsa o variable "Garbage Collector" tarafından silinir.

           "Mutable Class" larda var olan değer değiştirilebilir. Orjinal değer korunmaz.

         5)"String Class" ların "inmutable" yapısı "security" için önemlidir.
           Aynı değere sahip birden fazla String olduğunda, Java bir tane container oluşturur ve aynı değere sahib String'lerin bu container'i
           kullanmasını temin eder. Bu memory'i korumak için iyidir, ancak container'daki değeri bir variable için değiştirdiğimizde tüm variable'ların
           etkilenmesi tehlikesi vardır. Bu tehlikeden kurtulmak için Java String'leri "Immutable(değişmez)" yapmıştır. Fakat herhangi bir variable'ın
           değerini değiştirmek için Java bir yol bulmuştur. Değiştirmek istediğiniz variable için yeni bir container oluşturur ve variable'ın pointer'ını bu
           yeni variable'a yönlendirir. Böylelikle hem değişim sağlanmış olur hem de diğerleri etkilenmemiş olur.
     */

    public static void main(String[] args) {

        String str = "Java";
        str = "Super Java";

        //StringBuilder nasıl oluşturulur?
        //1. Yol:
        StringBuilder strb1 = new StringBuilder("Java");
        System.out.println(strb1);//Java

        //2.Yol:
        StringBuilder strb2 = new StringBuilder();
        //Yol a:
        strb2.append("Java");
        strb2.append(" is easy");
        strb2.append("!!!");
        System.out.println(strb2);//Java is easy!!!

        //Yol b:
        strb2.append(" Learn").append(" Java earn").append(" money.");
        System.out.println(strb2);//Java is easy!!! Learn Java earn money.

        //StringBuilder'larda character sayısı nasıl bulunur? ==> lenght() method'u ile bulunur
        StringBuilder strb3 = new StringBuilder();
        strb3.append("Cat");
        strb3.append("xxxxxxxxxxxxxxx");

        int numOfChar = strb3.length();
        System.out.println(numOfChar);//3 + 15 = 18

        //Capacity aşımlarında capacity var olanın iki katının iki fazlasına çıkar
        int capacity = strb3.capacity();
        System.out.println(capacity);//34 ==> 16*2 + 2

        strb3.append("mmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
        int capacity2 = strb3.capacity();
        System.out.println(capacity2);//70 ==> 34x2 + 2

        //strb3.setCharAt(2,'r'); ==> Index 2'deki character'i "r" ye çevirir
        strb3.setCharAt(2, 'r');
        System.out.println(strb3);//Carxxxxxxxxxxxxxxxmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm

        //delete(3,18); ==> Index 3(dahil) den index 18(hariç) e kadar tüm characterleri siler
        strb3.delete(3, 18);
        System.out.println(strb3);//Carmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm

        //deleteCharAt(2); ==> Index 2 deki characteri siler
        strb3.deleteCharAt(2);
        System.out.println(strb3);//Cammmmmmmmmmmmmmmmmmmmmmmmmmmmmm

        //reverse(); method'u StringBuilder'i ters çevirir. Ali ==> ilA
        //"mutable" larda sadece method kullanmak orjinal değeri değiştirmek için yeterlidir.
        strb3.reverse();
        System.out.println(strb3);//mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmaC

        //"Immutable" larda sadece orjinal değerii değiştirmek için methodu kullanmak yeterli olmaz bir de "atama işlemi" yapmalısınız.
        String abc = "Java";
        abc = abc.replace("a", "i");
        System.out.println(abc);//Jivi

        //toString() method'u StringBuilder'ları String'e çevirir
        String Stringstrb3 = strb3.toString();
        System.out.println(Stringstrb3);//mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmaC

        //String'den de StringBuilder'a aşağıdaki gibi dönebilirsiniz
        StringBuilder strb4 = new StringBuilder(Stringstrb3);
        System.out.println(strb4);//mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmaC

        //insert(3,"xxxx"); 3. character den sonra "XXXX" leri koyar
        strb4.insert(3, "XXXX");
        System.out.println(strb4);//mmmxxxxmmmmmmmmmmmmmmmmmmmmmmmmmmmaC

        //insert(3,"KLMOPRSTU",5,8); ==> 3. character'den sonra, "KLMOPRSTU" String'inin index 5, 6, 7 deki character'lerini yerleştirir
        strb4.insert(3, "KLMOPQRSTU", 5, 8);
        System.out.println(strb4);//mmmQRSxxxxmmmmmmmmmmmmmmmmmmmmmmmmmmmaC

        StringBuilder a = new StringBuilder("Iava");
        StringBuilder b = new StringBuilder("Java");

        //compareTo(b) method'u i)StringBuilder'lar tamamıyla aynı ise 0 verir.
        //                      ii)a alfabetik sırada b'den sonra gelirse pozitif olarak aradaki alfabetik sıralama farkını gösterir
        //                      iii)a alfabetik sırada b'den önce gelirse negatif olarak aradaki alfabetik sıralama farkını gösterir
        int sonuc = a.compareTo(b);
        System.out.println(sonuc);//-1
    }
}
