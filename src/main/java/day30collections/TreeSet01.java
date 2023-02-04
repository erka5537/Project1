package day30collections;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Locale;
import java.util.TreeSet;

public class TreeSet01 {

    /*
        TreeSet tekrarsız elemanları "alfabetik" sıra veya "küçükten büyüğe"(Natural Order) dizer.
        TreeSet çooook yavaş çalışır.

        Note: Tekrarsız elemanları naturel order da depolamak için TreeSet kullanmak mantıklıdır ama TreeSet'ler çoook yavaş çalıştığı için biz,
              elemanları önce HashSet'e depolarız sonra HashSet'i TreeSet'e çevirerek TreeSet'in yavaş olma problemini aşmış oluruz.
    */

    public static void main(String[] args) {

        //Example 1: Sekiz tane unique String elemanı alfabetik sırada depolayınız.
        //1.Way: Slow
        Long start1 = LocalTime.now().toNanoOfDay();
        TreeSet<String> emails = new TreeSet<>();
        emails.add("a@gmail.com");
        emails.add("y@gmail.com");
        emails.add("c@gmail.com");
        emails.add("m@gmail.com");
        emails.add("b@gmail.com");
        emails.add("z@gmail.com");
        emails.add("k@gmail.com");
        emails.add("d@gmail.com");
        System.out.println(emails);//[a@gmail.com, b@gmail.com, c@gmail.com, d@gmail.com, k@gmail.com, m@gmail.com, y@gmail.com, z@gmail.com]
        Long end1 = LocalTime.now().toNanoOfDay();
        System.out.println(end1 - start1);//1995000

        //2.Way: Fast
        HashSet<String> myEmails = new HashSet<>();
        myEmails.add("a@gmail.com");
        myEmails.add("y@gmail.com");
        myEmails.add("c@gmail.com");
        myEmails.add("m@gmail.com");
        myEmails.add("b@gmail.com");
        myEmails.add("z@gmail.com");
        myEmails.add("k@gmail.com");
        myEmails.add("d@gmail.com");

        TreeSet myEmailsSorted = new TreeSet(myEmails);// HashSet'i TreeSet'e çevirmek için bu kodu yazdık
        System.out.println(myEmailsSorted);//[a@gmail.com, b@gmail.com, c@gmail.com, d@gmail.com, k@gmail.com, m@gmail.com, y@gmail.com, z@gmail.com]
        Long end2 = LocalTime.now().toNanoOfDay();
        System.out.println(end2 - end1);//997300
    }
}
