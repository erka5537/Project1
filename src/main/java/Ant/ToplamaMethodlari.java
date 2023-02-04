package Ant;

public class ToplamaMethodlari {

    public static void main(String[] args) {

        int yeni = toplamaYap(4, 5);
        System.out.println(yeni);

        toplamıYazdir(2,3);

    }
    public int sayi = 12;

    public static int toplamaYap(int a, int b){

         int toplam = a+b;
         return toplam;
    }

    public static void toplamıYazdir(int a, int b){

        int toplam = a+b;
        System.out.println(toplam);
    }
}