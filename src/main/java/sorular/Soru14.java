package sorular;

public class Soru14 {

    public static void main(String[] args) {


        //9) Verilen bir String arraydeki belirli bir öğenin var olup olmadığını bulmak için kod yazınız.
        String ornek[] = {"Yasa", "Mustafa", "Kemal", "Pasa", "Yasa"};
        String oge = "Yasa";
        String sonuc = "";//YasaYasa

        for (String w : ornek) {
            if (w.equals(oge)) {
                sonuc = sonuc + w;

            }
        }
        if(sonuc.contains(oge)){
            System.out.println("var");
        }else System.out.println("yok");
    }
}
