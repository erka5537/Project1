package day26exceptions;

public class Exceptions01 {

    public static void main(String[] args) {

        String str = "123";
        int result = convertStringToInteger(str);
        System.out.println(result + 5);//128

        String st = "1a2b";
        int r = convertStringToInteger(st);
        System.out.println(r + 10);//NumberFormatException: Eğer içinde rakamdan farklı character barındıran bir String'i
                                   //                       valueOf() kullanarak Integer'a çevirmek isterseniz NumberFormatException alırsınız.
    }

    public static int convertStringToInteger(String str){

        int i = 0;
        try{
            //Herhangi bir satırda "Exception" atılırsa Java direkt "catch" bölümüne geçer try içindeki sonraki kodları çalıştırmaz
            i =   Integer.valueOf(str);
            System.out.println("Burası try bölümü");

        }catch (NumberFormatException e){
            System.out.println("Rakam olmayan karakter içeren Stringler Integer'a çevrilemez");
        }
        return i;
    }
}
