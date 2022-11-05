package day07ternarystringmanipulation;

public class NestedTernary01 {

    public static void main(String[] args) {

        /*
            Verilen yılın "leap year"(Artık Yıl) olup olmadığını kontrol eden kodu yazınız
            i)Yıl 100 e bölünürse 400 e de bölünmelidir ==> 1600+    1800-
            ii)Yıl 100 e bölünmezse 4 e bölünmelidir ==> 1996+    2001-
        */
        int year = 2022;

        String leap = year%100==0 ? (year%400==0 ? "Leap year" : "Leap year değil") : (year%4==0 ? "Leap year" : "Leap year değil");
        System.out.println(leap);

        /*
            aşşağıdaki kurallara göre password ün geçerli olup olmadığını kontrol eden kodu yazınız
            i)Sekiz karakterden fazla veya sekiz karakter varsa ilk harfi  i olmalıdır
            ii)Sekiz karakterden az karakter varsa ilk harfi k olmalıdır
        */
        String pwd = "i2a3ed54";

        String gecerli = pwd.length()<8 ? (pwd.charAt(0)=='K' ? "Geçerli" : "Geçersiz") : (pwd.charAt(0)=='i' ? "Geçerli" : "Geçersiz");
        System.out.println(gecerli);
    }
}