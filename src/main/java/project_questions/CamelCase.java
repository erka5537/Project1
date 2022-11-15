package project_questions;

public class CamelCase {

    public static void main(String[] args) {

        /*     Soru 1:
            CamelCase : camelcase adında Kendisine gönderilen bir cümledeki kelimelerin ilk karakterlerini
            büyük harfe çevirip geri döndüren metodun yazınız.
             input:
           I lIVe in uSa
      Result should be
           I Live In Usa
     */

        camelcase("daha çok çalışmalısın");//Daha Çok Çalışmalısın
    }
    public static void camelcase(String a){
        String[] arr = a.split(" ");
        for(String w : arr){
            System.out.print(w.substring(0, 1).toUpperCase());
            System.out.print(w.substring(1).toLowerCase()+" ");
        }
    }
}
