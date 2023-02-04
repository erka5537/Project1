package day17arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayLists03 {

    public static void main(String[] args) {

        //Example 1: Bir List'deki elemanlardan birbirine en yakın olan ikisini bulunuz
        //          [12, 19, 15, 30, 21]

        List<Integer> a = new ArrayList<>();
        a.add(12);
        a.add(19);
        a.add(15);
        a.add(30);
        a.add(21);

        Collections.sort(a);//List'teki elemanları küçükten büyüğe dizebilmek için kullanılır
        //[12, 15, 19, 21, 30]

        int minFark = Integer.MAX_VALUE;
        for(int i=1; i<a.size(); i++){
            minFark = Math.min(minFark, a.get(i) - a.get(i-1));
        }
        for(Integer w : a){
            if(a.contains(minFark+w)){
                System.out.println("Birbirne en yakın olan iki sayı = " + (minFark+w) + " - " + w);
            }
        }
        System.out.println("Birbirne en yakın olan iki sayının farkı = " + minFark);
    }
}
