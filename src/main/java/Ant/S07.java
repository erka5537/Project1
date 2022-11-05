package Ant;

import java.util.Arrays;

public class S07 {

    public static void main(String[] args) {

        /*
         TASK:
         you have a string "GayetBasarılı"
         with arrays change it to "CoookBasarılı" and write changing array
         (String iniz: "GayetBasarılı"  Diziyi "Coook Basarılı" ye cevirin )

         */

        String str = "GayetBasarılı";
        String arr[] = str.replace("Gayet","Cooook ").split(" ");
        System.out.println(Arrays.toString(arr));
    }
}
