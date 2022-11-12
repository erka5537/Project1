package day30collections;

import java.util.HashSet;

public class HashSet01 {

    /*
          Hash bir tekniktir, birbirine benzemeyen code'lar üretir bu kodlar data'yı unique yapar.
          Set'lere, çoklu ama tekrarsız data depolamak istediğimizde ihtiyaç duyarız.(öğrenci numaraları gibi)

        * Set --> HashSet :
        * 1) HashSet, duplicationa(tekrarli eleman) izin vermez.
        * Eger bir elemani tekrar HashSet e eklemek isterseniz eski olan silinip, yeni olan uzerine yazilir.
        * 2) HashSet'ler Set'ler arasinda en hizli olanidir. Bir algoritmaya gore kayit eder.
        * Degerlerin giris sirasina dikkat edilmez.(LinkedHashSet haric)
        * 3) HashSet "null" object'ini eleman olarak kullanabilir.
        * Ancak birden fazla null degerini bir HashSet e eklemek isterseniz sadece bir tane null degeri olur.

        HashSet'ler eklenen elemanların sıralaması ile uğraşmaz. Sıralama ile alakalı zaman harcamaz bu yüzden çok hızlı çalışır.

        HashSet'ler index kullanmazlar. Çünkü sıralama rastgele yapıldığı için index mânâlı olmaz.

        HashSetler:
            1)tekrarsiz elemanlarda
            2)sırlama onemli degilse
            3)hız cok önemliyse
            4)İndeks kullanmazlar
     */

    public static void main(String[] args) {

        HashSet<String> emails = new HashSet<>();
        emails.add("Apple");
        emails.add("Mango");
        emails.add("Orange");
        emails.add("Apricot");
        emails.add("Fig");
        System.out.println(emails);//[Apple, Fig, Mango, Apricot, Orange]

        //Var olan elemanı eklerseniz hata vermez, son ekleneni var olan data nın üstüne yazar.(Overwrite)
        emails.add("Mango");
        System.out.println(emails);//[Apple, Fig, Mango, Apricot, Orange]

        emails.add(null);
        emails.add(null);
        emails.add(null);
        System.out.println(emails);//[null, Apple, Fig, Mango, Apricot, Orange]
        /*
            HashSet arayüzü verileri düzensiz sıralar, performans olarak tasarruf etmenizi sağlar.
            HashLinkedSet ise verileri eklenen sıraya göre düzenli tutar
            Eğer verilerin sırası önemli değilse HashLinkedSet size ekstra maaliyet oluşturacaktır.
        */

    }
}
