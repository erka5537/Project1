package day32maps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators02 {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("M");

        //Example 1:Iterators kullanarak list elemanlarını tersten ekrana yazdırınız

        ListIterator<String> itr = myList.listIterator();

        //hasNext() method'u pointer dan sonra eleman varsa "true", yoksa "false" return eder.
        //next() method'u pointer'ı bir sonraki elemanın önüne koyar ve üstünden atladığı elemanı return eder.
        while(itr.hasNext()){
            String el = itr.next();
        }

        //hasPrevious() method'u pointer'dan önce eleman varsa "true", yoksa "false" return eder.
        //previous()method'u pointer'ı bir önceki elemanın sonuna koyar ve üstünden atladığı elemanı return eder.
        while(itr.hasPrevious()){
            String el = itr.previous();
            System.out.print(el + " ");
        }

        //Example 2: List'deki tüm elemanları siliniz

        while(itr.hasNext()){
            itr.next();
            itr.remove();
        }
        System.out.println(myList);

        /*
            1) ListIterator'da i)hasNext() ii)next() iii)set() iv)hasPrevious() v)previous() vi)remove()

            2) Iterator'da i)hasNext() ii)next() iii)remove() method'ları vardır
        */

        List<String> yourList = new ArrayList<>();
        yourList.add("Z");
        yourList.add("K");
        yourList.add("A");
        yourList.add("J");
        yourList.add("M");

        Iterator<String> iterator = yourList.iterator();

        while(iterator.hasNext()){
            String el = iterator.next();
            System.out.print(el);
        }
    }
}