package day02methodcreation;

public class MethodCreation {

    //main method içinde kullanıcağınız her şey statik olmalıdır.
    public static void main(String[] args) {

        System.out.println(toplamaYap(1.2, 5));

        System.out.println(carpmaYap(2, 1.5, 6));

        System.out.println(toplaVeCarp(5, 6, 2));

        //sout yazıp entere basınız System.out.println() otomatik yazılır
        //Ekrana bir şey yazdırmak için iki tane kod var 1)System.out.println() ==> Satırvaşı yapar 2)System.out.print()
    }

    //Example 1: Toplama işlemi yapan bir method oluşturunuz.
    public static double toplamaYap(double a, double b){

       return a+b;
    }

    //Example 2: 3 sayıyı birbiriyle çarpan bir method oluşturunuz

    public static double carpmaYap(double a, double b, double c){

        return a*b*c;
    }

    //Example 3: Üç sayıdan ilk

    public static double toplaVeCarp(double a, double b, double x){

        return (a+b)*x;

    }


}
//void: Bu method yeni bir data uretmiyor demektir.
//Ornegin; ekrana bir sey yazdirma methodu, bit tusa tiklama methodu gibi…