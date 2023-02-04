package project_questions;

public class GetPopulation {

    public static void main(String[] args) {

        /*
    Method adı populationOfCountry
    Bu method  String array(countryNames) ,  int array (countryPopulations) ve   String (str) alacak
     countryNames : Ülke isimleri
     countryPopulations: Ülke nüfusları
      Eğer str Ülke isimleri içeriyorsa  Ülke nüfusunu return et
      Ornegin;
        countryNames = {"USA" ,"Mexico" ,"Canada"}
        countryPopulations = {100000 , 120000 , 130000}
        str = "Mexico"
        return 120000 olmali
        NOT : eger str icin verilen ulke countryNames icinde yoksa return -1 olmali
     */
        String[] ulkeIsimleri = {"USA" ,"Mexico" ,"Canada"};
        int[] ulkeNufuslari = {100000 , 120000 , 130000};
        String str = "a";

        int sonuc = populationOfCountry(ulkeIsimleri, ulkeNufuslari, str);
        System.out.println(sonuc);
    }

    public static int populationOfCountry(String[] a, int[] b, String c){
        int counter = 0;
        int result  = -1;
        for(int i=0; i<a.length; i++){
            if(a[i].equals(c)){
               result = b[i];
            }
        }
        return result;
    }
}
