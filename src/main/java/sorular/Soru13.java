package sorular;

public class Soru13 {

    public static void main(String[] args) {

        //@Erkam KILINC
        //8) İlk ve son karakterleri aynı olan array öğelerini bulmak için kod yazınız.

        String arr[] = new String[7];

        arr[0] = "kazak";
        arr[1] = "kalem";
        arr[2] = "mum";
        arr[3] = "masa";
        arr[4] = "sandalye";
        arr[5] = "madam";
        arr[6] = "meryem";

        String sonuc = "";

        for(String w : arr){

            if(w.charAt(0) == w.charAt(w.length()-1)){

                sonuc = sonuc + w + "\n\t\t\t";

            }
        }
        System.out.print("İlk ve son karakteri aynı olan elemanlar: \n\t\t\t" + sonuc);
    }
}
