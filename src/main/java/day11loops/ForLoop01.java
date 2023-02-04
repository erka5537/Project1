package day11loops;

public class ForLoop01 {

    public static void main(String[] args) {

        //Example 1: 3 den 6 ya kadar tam sayıların toplamını bulan kodu yazınız

        int sum = 0;

        for(int i=3; i<7; i++){

            sum = sum + i;

        }

        //Note: Sysem.out.println(sum); loop'un dışına yazılırsa sum'ın sadece son değerini ekrana yazdırır.
        //      Sysem.out.println(sum); loop'un içine yazılırsa her bir loop için sum'ın hangi değerleri aldığını yazdırır.
        System.out.println(sum);

        //Example 1: 6 dan 3 e kadar tam sayıların çarpımını bulan kodu yazınız

        int multiply = 1;

        for(int i=6; i>2; i--){

            multiply = multiply * i ;

        }
        System.out.println(multiply);

        //Example 3: Size verilen bir tam sayının rakamları toplamını bulunuz.
        int num = 385;
        num = Math.abs(num);
        int sonuc = 0;

        for(int i=num; i>0; i=i/10){

            sonuc = sonuc + i%10;

        }
        System.out.println(sonuc);

        //Example 4: Size verilen bir String'i ters çeviren kodu yazınız.
        //           "Kaba" ==> "abaK"

        String str = "Kaba";
        //Concatenation yapacaksanız "" kullanınız
        String ters = "";

        for (int i=str.length()-1; i>=0; i-- ){

            char c = str.charAt(i);

            ters = ters + c;
        }
        System.out.println(ters);
    }
}
