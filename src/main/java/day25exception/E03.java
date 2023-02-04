package day25exception;

public class E03 {

    public static void main(String[] args) {

        String str = "Ali";
        getNumOfChars(str);//3

        String s = "";
        getNumOfChars(s);//0

        String t = null;
        getNumOfChars(t);//NullPointerException
        //Eğer lenght() method'unda null kullanırsanız bu exception ı alırsınız

    }

    //Bir String te bulunan karakterlerin sayısını bulabilmek için bir method oluşturunuz

    public static void getNumOfChars(String str){

        try{
            System.out.println(str.length());
        }catch(NullPointerException e){
            System.out.println("lenght() method'unda bir problem oluştu ");

            e.printStackTrace();
            //bu methodu kullandığınız zaman System.out.println(); e gerek yok
        }
    }
}
