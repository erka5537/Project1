package day32maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Maps01 {

    public static void main(String[] args) {

        //Size verilen bir cümledeki her kelimenin kaç kere kullanılıdğını gösteren kodu yazınız
        // "I like to move it move it" ==> I=1, like=1, to=1, move=2, it=2

        String str = "I like to move it, move it.";

        //Noktalama işaretlerini sil
        str = str.replaceAll("\\p{Punct}","");
        System.out.println(str);//I like to move it move it

        //Kelimeleri almak için split() kullanalım
        String[] kelimeler = str.split(" ");
        System.out.println(Arrays.toString(kelimeler));//[I, like, to, move, it, move, it]

        HashMap<String, Integer> gorunum = new HashMap<>();// {            }

        for(String w : kelimeler){
            Integer gorunumSayisi = gorunum.get(w);
            if(gorunumSayisi==null){
                gorunum.put(w, 1);
            }else{
                gorunum.put(w, gorunumSayisi+1);
            }
        }
        System.out.println(gorunum);//{move=2, like=1, I=1, to=1, it=2}
    }
}
