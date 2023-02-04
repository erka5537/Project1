package project_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FilmTahmin {

    public static void main(String[] args) {

        /*
     TASK :
      yukarıdaki film listinde bulunan filmlerden herhangi birisini kullanıcının film ismini  görmeden
      filmin index nosuna göre sectiriniz
      seçilen filmin  ismini filmin harf saysının 2 katı kadar hak tanıyarak tahmin etmesini
      sağlayan method create ediniz...
      Ahanda TRICK...
      kullanıcının sectiği filmin harf sayısını  console yazdırınız.
      kullanıcının sectiği film için tahmin hakkını  console yazdırınız.
      kullanıcının her tahmininde kalan hak sayısını console yazdırınız.
      kullanıcının her tahmininde doğru ve yanlış tahmin  sayısını console yazdırınız.
      kullanıcının kaybedip veya kazandığını ve tahmin etmesi gereken filmin ismini  console yazdırınız
      */


        List<String> film = new ArrayList<>(Arrays.asList("KELEBEK", "MUCIZE", "AYLA", "DUNKIRK",
                "MEMENTO", "GORA", "ESKIYA", "FIGHTCLUB", "KARAKOMIK", "KILLBILL", "AMELIE", "XMEN", "OLDBOY",
                "BATMAN", "KELOGLAN", "TOYSTORY", "MUTLULUK", "SEVEN"));

        Scanner input = new Scanner(System.in);
        System.out.println("1'den 18'e kadar rastgele bir film numarası seçiniz...");
        int filmNo = input.nextInt()-1;
        String secilenFilm = film.get(filmNo);
        int tH = tahminHakki(secilenFilm);

        System.out.println("Seçtiğiniz filmin harf sayısı: "+secilenFilm.length());
        System.out.println("Filmi tahmin etmek için "+tH+" hakkınız var.");
        String sonuc[] = secilenFilm.replaceAll("[A-Z]","_").split("");

        while(true){
            if(tH==0){
                System.out.println("Tahmin hakkın kalmadı. Kaybettin");
                break;
            }
            System.out.println("Filmi tahmin edebilir ya da bir harf deneyebilirsiniz\n");
            String tahmin = input.next().toUpperCase();
            if(tahmin.equals(secilenFilm)){
                System.out.println("Tebrikler, doğru bildiniz...");
                break;
            }else if(secilenFilm.contains(tahmin)){
                tH--;
                System.out.println("Harfi buldun...");

                for(int i=0; i<secilenFilm.length(); i++){

                    if(secilenFilm.charAt(i) == tahmin.charAt(0)){
                        sonuc[i] = tahmin;
                    }
                }
                System.out.println(Arrays.toString(sonuc));
                System.out.println();
                System.out.println("Kalan tahmin hakkın: "+tH);
            }else if(!secilenFilm.contains(tahmin)){
                tH--;
                System.out.println("\nHarfi bulamadın...");
                System.out.println(Arrays.toString(sonuc));
                System.out.println("\nKalan tahmin hakkın: "+tH);
            }
        }

    }
    public static int tahminHakki(String a){
        return a.length()*2;
    }
}
