package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex03 {

    public static void main(String[] args) {

        //Example 1: Bir List'deki elemanlardan birbirine en yakın olan ikisini bulunuz
        //          [12, 19, 16, 30, 21]

        List<Integer> sayılar = new ArrayList<>();
        sayılar.add(12);
        sayılar.add(19);
        sayılar.add(15);
        sayılar.add(30);
        sayılar.add(21);

        Collections.sort(sayılar);

        int minfark = Integer.MAX_VALUE;

        for(int i=1; i<sayılar.size(); i++){
            minfark = Math.min(minfark, sayılar.get(i) - sayılar.get(i-1));
        }

        for(Integer w : sayılar){
            if(sayılar.contains(minfark+w)){
                System.out.println( minfark+w + " " + w);
            }
        }
    }
}
