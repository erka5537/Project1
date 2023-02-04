package day03typecastingwrapperscanner;

import java.sql.SQLOutput;

public class WrapperClass01 {

    public static void main(String[] args) {

        /*
             Note: Java primitve lere methodlar ekleyerek yeni bir
                   yapı oluşturdu bu yapıya "Wrapper Class denir"

                   Primitive                Wrapper
                      byte        ==>        Byte
                      short       ==>        Short
                      ** int         ==>        Integer
                      long        ==>        Long
                      float       ==>        Float
                      double      ==>        Double
                      boolean     ==>        Boolean
                      ** char        ==>        Character
         */

        byte primitiveByte = 12;//primitiveByte yazıp "." koyduğunuzda hiç method göremzezsiniz çünkü primitiveler method içermez sadece değer içerir
        Byte wrapperByte = 12;//wrapperByte yazıp "." nokta koyduğunuzda birçok method görürsünüz çünkü wrapperlar mothod içerir.

        //Example 1: Byte datatype'inin en küçük ve en büyük değerlerini ekrana yazdırınız.

        System.out.println(Byte.MIN_VALUE);//-128
        System.out.println(Byte.MAX_VALUE);//127

        //Example 2: short, int long, data type'larının en büyük ve en küçük değerlerini ekrana yazdırınız.

        System.out.print(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        System.out.print(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.print(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        //"Primitiveler nasıl Wrapper lara çevrilir?(autoboxing)
        float f1 = 13.99F;
        Float wrapperF1 = f1;

        //"Wrapperler nasıl Primitevelere çevrilir(unboxing)
        Character w1 = 's';
        char primitiveW1 = w1;

        //Note: Autoboxing ve Unboxing Java tarafından otomatik olarak yapılır.

    }

}
