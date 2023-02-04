package day32maps;

public class StaticBlocks01 {

    public static double pi;

    static{
        pi = 3.14;
        System.out.println("Static block 2");
    }

    public static void main(String[] args) {
        System.out.println("Main method");

    }

    //static block'lar ihtiyacımız olan variable'ların class oluşturma safhasında elimizde olmasını sağlar.
    //static block'lar Class içindeki her şeyden önce çalıştırılır. "main method" dan ve diğer tüm method'lardan önce çalıştırılır.
    //static block'lar içinde sadece "static variable" lara değer atanabilir.
    //1'den fazla "static block" varsa üstteki önce çalıştırılır.
    static{
        pi = 3.14;
        System.out.println("Static block 1");
    }
}
