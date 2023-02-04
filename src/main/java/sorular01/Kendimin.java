package sorular01;

public class Kendimin {

    public static void main(String[] args) {

        /*
            Bir String in ortadaki herhangi bir konumda yalnızca tek bir boşluk karakteri olup
            olmadığını kontrol etmek için kod yazınız.
            Örnek:‘Ali Can’ için konsolda false yazmalıdır.
            ‘ Ali Can ’ için konsolda false yazmalıdır.
            ‘ Ali Can ’ için konsolda false yazmalıdır.
            ‘Ali Can’ için konsolda true yazmalıdır.
         */
//        String s = "Tom Hanks";
//        boolean ss = s.replaceAll("[^ ]", "").length()<2;
//        System.out.println(ss);
//        System.out.println(s.toUpperCase());

            int i = 1;
            int j = 0;
            switch (i) {
                case 2 :
                    j += 6;
                case 4 :
                    j += 1;
                case 1 :
                    j += 4;
                default :
                    j += 2;
            }
            System.out.println("j = " + j);
    }
}
