package day30collections;

import com.sun.source.doctree.SinceTree;

import java.util.LinkedList;

public class LinkedList01 {

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();
        names.add("Chris");
        names.add("Alexandre");
        names.add("Mark");
        names.add("Tom");
        names.add("Jeremy");
        names.add("Hans");
        System.out.println(names);

        /*
            Retrieves, but does not remove, first element of this list.
            Returns: the head of this list, or null if this list is empty
         */

        String firstEl = names.peek();//[Chris, Alexandre, Mark, Tom, Jeremy, Hans]
        System.out.println(firstEl);//Chris

        System.out.println(names);//[Chris, Alexandre, Mark, Tom, Jeremy, Hans]

        LinkedList<String> myList = new LinkedList<>();

        String first = myList.peek();
        System.out.println(first);//null

        /*
            Retrieves and removes the head (first element) of this list.
            Returns: the head of this list, or null if this list is empty
        */

        String firstElement = names.poll();
        System.out.println(firstElement);//Chris
        System.out.println(names);//[Alexandre, Mark, Tom, Jeremy, Hans]

        /*
            Retrieves, but does not remove, the head (first element) of this list.
            Throws: NoSuchElementException – if this list is empty
        */

        String f = names.element();
        System.out.println(f);//Alexandre
        System.out.println(names);//[Alexandre, Mark, Tom, Jeremy, Hans]

        /*
            Retrieves, but does not remove, the first element of this list, or returns null if this list is empty.
            Returns: the first element of this list, or null if this list is empty
         */
        names.peekFirst();

        //Example 1: "A" ile başlayan tüm isimleri "******" e çeviriniz

        LinkedList<String> students = new LinkedList<>();
        students.add("Chris");
        students.add("Alexandre");
        students.add("Mark");
        students.add("Tom");
        students.add("Jeremy");
        students.add("Hans");

        System.out.println(students);//[Chris, Alexandre, Mark, Tom, Jeremy, Hans]

        for(String w : students){
            if(w.startsWith("A")){
                students.set(students.indexOf(w),"*****");
            }
        }
        System.out.println(students);//[Chris, *****, Mark, Tom, Jeremy, Hans]

        //Interview Sorusu:
        //Example 2: List'deki 4 harften çok harf içeren isimleri siliniz
        //Eleman sayısını azaltacağımız için i ye ihtiyacımız var, o yüzden for-each loop değil for loop kullanıyoruz.

        for(int i=0; i<students.size(); i++){
            if(students.get(i).length()>4){
                students.remove(students.get(i));
                i--;
            }
        }
        System.out.println(students);//[Mark, Tom, Hans]
    }
}
