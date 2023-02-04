package day03typecastingwrapperscanner;

public class TypeCasting01 {

    //Type Casting: Bir numeric data Type'inin diğer numeric data type'ina çevirmek demektir.
    //              byte < short < int < long < float < double

    //Note: Küçük data type'ini büyük data type'ine çevirmeye "Auto Widening" denir.
    //Note: Büyük data type'ini küçük data type'ine çevirmeye "Explict Narrowing" denir.

    public static void main(String[] args) {

        byte age = 23;
        int newAge = age;

        long population = 1234;
        int newPopulation = (int)population;

        //Example 1: short'u double'a çeviren kodu yazınız
        short numOfStudent = 235;
        double newnumOfStudent = numOfStudent;

        //Example 2  float'ı byte yapan kodu yazınız.
        float price = 12.99F;
        byte newPrice = (byte)price;

        System.out.println(newPrice);//12 ==> Java ondalık sayıyı, tam sayıya cevirirken yuvarlama islemi yapmaz.
                                     //       Java ondalık sayıyı, tam sayıya cevirirken ondalık kısmını siler.

        int number = 515;
        byte newNumber = (byte)number;

        System.out.println(newNumber);//3 ==> Java 515'i 256(byte daki sayıların sayısı)'ya böldü kalanı return etti

        int num = 510;
        byte newNum = (byte)num;

        System.out.println(newNum);//-2


    }

}
