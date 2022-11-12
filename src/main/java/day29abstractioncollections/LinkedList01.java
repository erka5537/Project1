package day29abstractioncollections;

import java.util.LinkedList;

public class LinkedList01 {

    /*
Collection: birden fazla datanın depolanması.
Array ilkel bu yüzden collectionlara dahil değil.
List'ler collection'lara dahil.

Collection diyince bunlar aklınıza gelmeli:
1)List  i)ArrayList ii)LinkedList
2)Set
3)Queue

>List'lere çoklu ve tekrarlı data depolamak istediğimizde ihtiyaç duyarız, Ör:bir okuldaki öğrenci isimleri.
>>Set'lere çoklu ama tekrarsız data depolamak istersek ihtiyaç duyarız, Ör: bir okuldaki öğrenci ID'leri.
--Set ve List'i amacına göre kullanın.
>>>Queue'lara FIFO(first in first out) veya LIFO(last in firts out) gerektiğinde Queue kullanılır, Ör: bankadaki günlük müşteriler.

 ArrayList’ler index kullanir ama index kullanmak eleman ekleme ve eleman silme islemlerinde
 bize zaman kaybettirir.Cunku bircok elemanin re-index edilmesi gerekir.

 LinkedList eleman ekleme ve eleman silmede cok basarilidir.
 Bu yuzden eleman ekleme ve eleman silme islemlerini cokca yapacaginiz durumlarda LinkedList kullanmalisiniz.

 */


    /*
        1)LinkedList deki her eleman iki bölümden oluşur i)Data ii)Pointer
        2)LinkedList deki her bir eleman "Node" olarak adlandırılır.
        3)LinkedList ler eleman ekleme ve eleman silme işlemlerinde çok başarılıdırlar
        4)LinkedList ler eleman arama işlemlerinde başarısızdırlar
        5)3. ve 4. maddelerden dolayı eleman ekleme ve eleman silme işlemlerinin çok yapılacağı durumlarda LinkedList kullanılmalıdır.
        6)ArrayList'ler index kullnır LinkedList'ler index kullanmaz
        7)index kullanmak eleman bulma işlemlerinde çok başarılıdır. Bu yüzden eleman bulma işlemlerini çok yapacaksanız ArrayList kullanmalısınız.
     */

    public static void main(String[] args) {

        LinkedList<String> visiters = new LinkedList<>();
        visiters.add("Tom");
        visiters.add("Hanks");
        visiters.add("Tom Hanks");
        visiters.add("Brad");
        visiters.add("Pitt");
        visiters.add("Brad Pitt");
        visiters.add(2, "Angelina Jolie");
        visiters.add("Brad Pitt");
        visiters.add("Tom Hanks");

        System.out.println(visiters);//[Tom, Hanks, Angelina Jolie, Tom Hanks, Brad, Pitt, Brad Pitt]

        //LinkedList'ler ekleme ve silme işlemlerinde çok başarılı olduklarından ekleme ve silme ile alakalı çok fazla method içerir.
        visiters.addLast("Ajda Pekkan");
        visiters.addFirst("Cüneyt Arkın");
        System.out.println(visiters);//[Cüneyt Arkın, Tom, Hanks, Angelina Jolie, Tom Hanks, Brad, Pitt, Brad Pitt, Ajda Pekkan]

        visiters.removeLast();
        System.out.println(visiters);//[Cüneyt Arkın, Tom, Hanks, Angelina Jolie, Tom Hanks, Brad, Pitt, Brad Pitt]

        visiters.removeFirst();
        System.out.println(visiters);//[Tom, Hanks, Angelina Jolie, Tom Hanks, Brad, Pitt, Brad Pitt]

        visiters.removeFirstOccurrence("Tom Hanks");
        System.out.println(visiters);//[Tom, Hanks, Angelina Jolie, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]

        visiters.removeLastOccurrence("Brad Pitt");
        System.out.println(visiters);//[Tom, Hanks, Angelina Jolie, Brad, Pitt, Brad Pitt, Tom Hanks]

        /*
            Pops an element from the stack represented by this list. In other words, removes and returns the first element of this list.
            This method is equivalent to removeFirst().
            Throws:
            NoSuchElementException – if this list is empty
         */
        String firstEl = visiters.pop(); // Cut + Paste ==> Ctrl+X
        System.out.println(firstEl);//Tom
        System.out.println(visiters);//[Hanks, Angelina Jolie, Brad, Pitt, Brad Pitt, Tom Hanks]

        LinkedList<String> myList = new LinkedList<>();
        //myList.pop();// NoSuchElementException attı çünkü LinkedList boş


    }
}
