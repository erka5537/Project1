package day10stringmanipulations;

public class ForLoop01 {

    public static void main(String[] args) {

        //Example 1: Ekrana 5 kere "Hi" yazdırınız.
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        //Tekrarlı işler için "loop" kullanırız
        //Dört çeşit "loop" vardır. i)for-loop ii)while-loop iii)do-while-loop iv)for-each-loop

        //i)for-loop
        //Example 2: Ekrana 5 kere "Hi" yazdırınız.

        //başlangıç değeri loop hangi şart altında çalışacak Increment(Artıran) veya Decrement(Azaltan)
        for(int i = 1     ;              i<6                ;                 i++){
            System.out.println("Hi");
        }

        //Example 3: 4 den 7 e kadar tüm tam sayıları ekrana yazdıran kodu yazınız

        for(int i =4; i<8; i++){
            System.out.print(i + " ");
        }

        System.out.println();

        //Example 4: 14 den 5 e kadar tüm tam sayıları ekrana yazdıran kodu yazınız

        for(int i = 14; i>4; i--){
            System.out.print(i + " ");
        }

        System.out.println();

        //Example 5: 14 den 5 e kadar tüm çift sayıları ekrana yazdırınız

        for(int i = 14; i>4; i=i-2){
            System.out.print(i + " ");
        }

        System.out.println();

        //2.Yol:
        for (int i=14; i>4; i--){
            if(i%2==0){
                System.out.println(i + " ");
            }
        }
        System.out.println();
        //Example 6: 28 den 157 e kadar tüm tek sayıları ekrana yazdırınız
        for (int i=28; i<158; i++){
            if(i%2!=0){
                System.out.print(i + " ");
            }
        }

        System.out.println();

        //Example 7: "Java" String'ini "J*a*v*a*" String'ine çeviren kodu yazınız

        String str = "Java";

        for(int i = 0; i<str.length(); i++){
            System.out.print(str.charAt(i) + "*");
        }

        System.out.println();

        //Example 8: Size verilen String'te tekrarsız karakterleri ekrana yazdırınız
        //           "Hellooo Ali" ==> HeAi

        String s = "Hellooo Ali";

        for(int i=0; i<s.length(); i++){

            char c = s.charAt(i);

            if(s.indexOf(c)==s.lastIndexOf(c)){
                System.out.print(c);
            }
        }
    }
}
