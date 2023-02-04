package day08stringmanipulations;

public class StringManipulations02 {

    public static void main(String[] args) {

        //Example 1: Bir String'teki space hariç kaç tane character kullanıldığını gösteren kodu yazınız.
        //           "Ali okula gitti" ==> 14
        String str = "Ali okula gitti.";

        //replace() method'u bir string'teki herhangi bir karakteri veya karakterleri değiştirmek için kullanılır.
        int num = str.replace(" ", "").length();
        System.out.println(num);

        //Example 2: Bir String'teki tüm 'a' harflerini 'A' 'ya çeviriniz
        String s = "Ankara'nin tasina gozlerimin yasina bak";
        String yeniS = s.replace("a", "A");
        System.out.println(yeniS);

        //Example 3: Bir String'teki tüm "kara" kelimesinin yerine "*" koyunuz
        String t = "Kara kara düşünme Ankara";
        String yeniT = t.replace("kara", "*");
        System.out.println(yeniT);

        //Example 4: Bir String'teki tüm sayıları "*"'a çeviriniz
        //           "AC202117004" ==> AC*********
        String stdId = "AC202117004";
        String yeniStdIdstdId = stdId.replaceAll("[0-9]", "*");
        System.out.println(yeniStdIdstdId);

        /*
            Bir grup data'yı ifade eden kodlara "Regex" denir.
            "Regex" Regular Expressions'in kısaltılmış halidir.

            1)Tüm rakamlar ==> [0-9]
            2)Tüm küçük harfler ==> [a-z]
            3)Tüm büyük harfler ==> [A-Z]
            4)Tüm harfler ==> [a-zA-Z]
            5)Sesli harfler ==> [aeiouAEIOU]
            6)Space ==> [ ]
            7)Tüm rakamlar ve tüm harfler ==>[0-9a-zA-Z]
            8)Tüm noktalama işaretleri ==>\\p{Punct}

            1)Rakamlar hariç tüm karakterler ==> [^0-9]
            2)Küçük harfler hariç tüm karakterler ==> [^a-z]
            3)Büyük harfler hariç tüm karakterler ==> [^A-Z]
            4)Tüm harfler hariç tüm karakterler ==> [^a-zA-Z]
            5)Space hariç ==> [^ ]
         */

        //Example 5: Verilen bir String'te kullanılan noktalama işareti ve rakamlar ve space karakteri hariç
        //           tüm karakterlerin sayısını bulan kodu yazınız
        String u = "Ali 13 yaşında, dersem inanma!...";
        int sonuc = u.
                      replaceAll("[0-9]", "").
                      replace(" ", "").
                      replaceAll("\\p{Punct}", "").
                      length();
        System.out.println(sonuc);

        //Example 6: Bir password'un geçerli olup olmadığını aşşağıdaki kurallara göre test eden kodu yazınız
        //           i)Space hariç en az sekiz karakter olmalı
        //           ii)En az bir sembol içermeli
        //           iii)En az bir rakam içermeli
        //           iv)En az bir büyük harf içermeli
        //           v)En az bir küçük harf içermeli

        String pwd = "B78c? K!m";

        //i)Space hariç en az sekiz karakter olmalı
        boolean first = pwd.replace(" ", "").length()>7;

        //ii)En az bir sembol içermeli
        boolean second = pwd.replaceAll("[0-9a-zA-Z ]", "").length()>0;

        //iii)En az bir rakam içermeli
        boolean third = pwd.replaceAll("[^0-9]", "").length()>0;

        //iv)En az bir büyük harf içermeli
        boolean fourth = pwd.replaceAll("[^A-Z]", "").length()>0;

        //v)En az bir küçük harf içermeli
        boolean fifth = pwd.replaceAll("[^a-z]", "").length()>0;

        boolean pwdGecerli = first && second && third && fourth && fifth;

        if(pwdGecerli){
            System.out.println("Password'ünüz geçerlidir...");
        }else{
            System.out.println("Password'ünüz geçerli değildir...");
        }

        //Example 7: Bir String'teki noktalama işaretlerinin sayısını gösteren kodu yazınız
        String cumle = "Sen yapmazsen, ben yapmazsam, o yapmazsa kim yapacak?...";

        int number = cumle.replaceAll("[^\\p{Punct}]", "").length();
        System.out.println(number);

        //Example 8: Verilen bir string "Al" ile başlıyor ve "x" ile bitiyorsa ekrana "Harika" yazdırın
        //           aksi halde "Normal" yazdırın.

        String v = "Alex";
        boolean başlangıç = v.startsWith("Al");

        boolean bitiş = v.endsWith("x");

        String result = başlangıç && bitiş ? "Harika" : "Normal";
        System.out.println(result);
    }
}
