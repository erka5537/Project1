package day06nestedifswitch;

public class NestedIf01 {

    public static void main(String[] args) {

        /*
            Password'un ilk harfi büyük harf ise
                'A' olursa geçerli password aksi halde geçersiz password
            Password'un ilk harfi küçük harf ise
                'Z' olursa geçerli password aksi halde geçersiz password

           Note: Java "nested" kodları çalıştırırken çok zaman harcar, buna "Time Complexity" denir.
                 bu yüzden mümkünse nested kod yazmamaya çalışınız.
        */

        String pwd = "5xy12!";
        char ilkHarf = pwd.charAt(0);

        if(ilkHarf>='A' && ilkHarf<='Z'){

            if(ilkHarf=='A'){
                System.out.println("Geçerli Password");
            }else{
                System.out.println("Geçersiz Password");
            }
        }else if(ilkHarf>='a' && ilkHarf<='z'){

            if(pwd.charAt(0)=='z'){
                System.out.println("Geçerli password");
            }else{
                System.out.println("Geçersiz password");
            }
        }else{
            System.out.println("İlk karakter harf olmalıdır");
        }
    }
}
