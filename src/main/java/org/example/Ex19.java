package org.example;

import java.util.Arrays;

public class Ex19 {

    public static void main(String[] args) {

        //30) Her girdi satırı, tek boşluklarla ayrılmış bir veya birkaç sözcük içerir. Sözcükler değişmeden,
        //her giriş satırındaki sözcüklerin sırasını tersine çevirmek için kod yazınız.
        //Çıktınızın satırlarında sonunda veya başında boşluk olmamalıdır.
        //Örnek; Kemal Can Kuzu, Kuzu Can Kemal'e dönüşecektir.


        String input = "Ali\n " +
                "Veli Han\n " +
                "Kemal Can Kuzu";
        String rev = "";
        String[] lines = input.split(System.getProperty("line.separator"));
        for(String w : lines) {
            String[] words = w.split(" ");
            for (int i = words.length - 1; i >= 0; i--) {
                if (i != 0) {
                    rev = rev + words[i] + " ";
                } else {
                    rev = rev + words[i];
                }
            }
        }
            System.out.println(rev);
            rev="";

        System.out.println("*************");

//        String input2 = "Ali\n" +
//                    "Veli Han\n" +
//                    "Kemal Can Kuzu";
//            String rev2 = "";
//            String[] words2 = input.split(" ");
//        //System.out.println(Arrays.toString(words));
//
//                for (int i = words2.length - 1; i >= 0; i--) {
//
//                        rev2 = rev2 + words2[i] + " ";
//
//                }
//        System.out.println(rev2);

//            String str = "Kemal Can Kuzu";
//            str = str.trim();
//            int spaceIlkIdx = str.indexOf(" ");
//            int spaceSonIndex = str.lastIndexOf(" ");
//
//            String ilkKelmime = str.substring(0,spaceIlkIdx);
//            String sonKelime = str.substring(spaceSonIndex+1);
//            String ortaKisim= str.substring(spaceIlkIdx+1,spaceSonIndex);
//
//            String yeniHali = sonKelime.concat(" "+ortaKisim).concat(" "+ilkKelmime);
//            System.out.println(yeniHali);
    }
}
