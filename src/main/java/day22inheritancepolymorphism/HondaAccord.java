package day22inheritancepolymorphism;

public class HondaAccord extends Honda{

    /*
        1)Siz Class oluşturduğunuzda Java otomatik olarak size görünmez bir constructor verir, çünkü
          Java Class'ın bir kalıp olduğunu Object oluşturmak için yaratıldığını ve Object oluşturmak için
          constructor'ın şart olduğunu bilir.
        2)Java'nın otomatik olarak oluşturduğu bu görünmez constructor'a "default constructor" denir.
        3)Siz kendiniz herhangi bir constructor oluşturduğunuzda Java default constructor'ı siler.
        4)Bir Class'ta birden falza constructor olabilir. Fakat bu constructor'ların parametreleri farklı olmalıdır.
        5)"this" keyword "Bu Class" anlamındadır. "this.price" demek bu Class'taki "price" isimli variable demektir.
          "this.price" syntax'i constructor'ların içinde kullanılır.
        6)Constructor kullanarak variable'lar üzerinde yaptığınız değişimler sadece Object üzerindeki variable'ların değerlerini değiştirir.
          Class'taki variable değerlerini değiştiremez...
     */
    public int price;
    public int year;
    public String make;
    public String model;

    public HondaAccord(){

    }

    public HondaAccord(int price){
        this.price = price;
    }

    public HondaAccord(int price, int year){
        this.price = price;
        this.year = year;
    }

    public HondaAccord(int price, int year, String make, String model){
        this.price = price;
        this.year = year;
        this.make = make;
        this.model = model;
        System.out.println("Honda Accord Constructor");
    }
}
