package day07ternarystringmanipulation;

public class Ternary01 {

    public static void main(String[] args) {

        //Example 1: Bir sayının pozitif olup olmadığını ekrana yazdıran kodu yazınız

        //1.Yol: if-else
        int a = 12;
        if(a>0){
            System.out.println("Pozitif");
        }else{
            System.out.println("Pozitif değil");
        }

        //2.Yol: ternary
        //          Condition    ?    Condition doğru ise uygulanacak kod     :     Condition yanlış ise uygulanacak kod
        String sonuc = a>0       ?               "Pozitif"                    :          "Pozitif değil";
        System.out.println(sonuc);

        //Example 2: İki sayıdan küçük olanı seçen kodu yazınız
        int b = 12;
        int c = 23;

        int min = b<c ? b : c;
        System.out.println(min);

        //Example 3: Verilen bir sayının mutlak değerini hesaplayan kodu yazınız
        //           Pozitif sayıların ve sıfırın mutlak değerleri kendileridir
        //           Negatif sayılarıb mutlak değeri -1 ile çarpılmış halleridir
        int d = -45;

        int abs = d<0 ? -1*d : d;
        System.out.println(abs);

        //Example 4: İki tane sayı aynı işaretli ise bu sayıları çarpınız. Farklı işaretli ise işlem yapamam mesajı veriniz.

        int e = 12;
        int f = 10;

        //Ternary farklı data typelerinde sonuç return ederse sonucun data typreini Object yapınız
        Object islem = (e>0 && f>0) || (e<0 && f<0) ? e*f : "İşlem yapamam";
        System.out.println(islem);

        //Note: Java da her class ın en az bir tane "parent" class ı vardır
        //      Sadece Object Class'ın "parent" classı yoktur.

    }
}
