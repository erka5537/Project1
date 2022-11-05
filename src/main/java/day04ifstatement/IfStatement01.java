package day04ifstatement;

public class IfStatement01 {

    public static void main(String[] args) {

        //If it rains I will canel the picnic
        //if statement belli kodları belli şartlara bağlı olarak çalıştırmaya yarar

        //Example 1: sayı pozitif ise ekrana pozitif yazdırın.
        int s = 12;

        if(s>0){
            System.out.println("pozitif");
        }

        //Example 2: Verilen karakter büyük harf ise ekrana "büyük harf" yazdırın
        char ch = 'K';

        if(ch>='A' && ch<='Z'){
            System.out.println("Büyük Harf");

        }
        /*
        && işlemi sadece boolean ile kullanılır
        true && true = true
        true && false= false
        false && true= false
        false && false= false
        && işlemi mükemmeliyetçidir, true sonucunu alabilmek için herşey true olmalıdır
        Bir tane false varsa sonuc false demektir.
         */

        //Example 3: Verilen bir sayı 3 basamaklı ise ekrana 3 basamaklı yazınız

        int n = -333;
        n = Math.abs(n);
        if(n>99 && n<1000){//n>99 && n<1000 veya n>=100 && n<=999
            System.out.println("Üç basamaklı");
        }

        //Example 4: verilen bir sayı çift sayı ise ekrana çift sayı yazdırınız
        int p = 18;

        Math.abs(p);

        //"=" işareti atama operatörüdür, matematikteki eşittir anlamına gelmez
        //Matematikteki eşittir işareti Java da "==" şeklindedir.
        //2+3 == 5

        if(p%2==0){
            System.out.println("çift sayı");

        }

        //Example 5: verilen bir sayı 300 den küçük veya 1200 den büyük ise "Harika sayı" yazdırın

        int r = 250;
        if(r<300 || r>1200){
            System.out.println("Harika sayı");
        }

        /*
               || islemi sadece boolean ile kullanilir.
                  true || true = true
                  true || false= true
                  false || true= true
                  false || false= false
               Not: || isleminde false alabilmek icin herseyin false olmasi gerekir.
                    || isleminde sadece bir tane true sonucu true yapmaya yeter
         */

    }

}
