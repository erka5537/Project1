package sorular01;

public class Soru01 {

    public static void main(String[] args) {

       // Bir tamsayıdaki rakamların toplamını bulmak için kodu yazınız.

        int tamSayi = 1453;
        int toplam = 0;

        for(int i=1;i<5;i++){
            toplam = toplam + tamSayi%10;
            tamSayi = tamSayi/10;
        }System.out.println(toplam);


        int tamSayi1 = 1453;
        int toplam1 = 0;
        int k = 1;

        while (k<5){

            toplam1 = toplam1 + tamSayi1%10;
            tamSayi1 = tamSayi1 / 10;
            k++;
        }System.out.println(toplam1);

        String str = "Ahmet";

    }
}
