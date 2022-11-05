package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultidimensionalArrays02 {

    public static void main(String[] args) {

        //MultiDimensionalArray kısa yoldan nasıl oluşturulur?
        char arr[][] = {{'a', 'b'}, {'C', 'D', 'E'}, {'?'}};
        System.out.println(Arrays.deepToString(arr));//[[a, b], [C, D, E], [?]]

        //Example 1: Bir String MultiDimensionalArray'de içinde "a" olanları console'a yazdırınız

        String brr[][] = {{"learn", "java", "it"}, {"is", "easy"}};

        for (String[] w : brr) {

            for(String k : w){
                if(k.contains("a")){
                    System.out.print(k + " ");
                }
            }
        }
    }
}