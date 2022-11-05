package day15arraysmultidimensionalarrays;

public class Arrays03 {

    public static void main(String[] args) {

        //Example 1: Bir Stringteki sesli harflerin sayısını bulan kodu yazınız
        //           a - e - i - o - u - A - E - I - O - U
        String str = "Java ogrenince para kazanmak kolay ogrenmeyince ne kolay ki.";

        str = str.toLowerCase();

        String harfler[] = str.split("");

        int counter = 0;

        for(String w : harfler){

            switch (w){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    counter++;
            }
        }
        System.out.println(counter);
    }
}
