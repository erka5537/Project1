package day28abstraction;

public interface Engine {

    /*
        1) Atomic olsun diye “parent”i parcaladim ama bir “Child Class” in birden fazla “parent” i oldu
           bu ise Java’da mumkun degildir. Cunku Java “multiple Inheritance” i desteklemez
           “multiple inheritance” class’larda mumkun degildir fakat Java “interface” isimli yeni bir yapi olusturdu
           bu yapida “multiple inheritance” a musaade etti.

        2) Interface'lerdeki tüm method'lar "abstract" olduğu için "interface" lere "fully abstraction" denir.
           "Abstract Class" larda abstract method ve "concrete method" bir arada kullanıldığı için
           "Abstract Class" lara "fully abstraction" denmez
    */

    //interface'lerdeki tüm method'lar "abstract" olmak zorundadır

    //interface'lerde abstract method oluştururken "abstract" keywordd kullanmaya gerek yoktur.
    //Çünkü Java o method'un abstract olduğunu bilir.

    //interface'lerdeki tüm method'lar Java tarafından otomatik olarak "public" kabul edilir bu yüzden
    //o methodlar için "public" yazmaya gerek yoktur.

    //public abstract void ec(); ile void ec(); aynı anlama gelir
    void eco();

    void gas();

    void tsi();

    //default keyword kullanarak interface'lerin içinde body'si olan method'lar üretebilirsiniz.
    //Aşağıdaki method "non-static method" dur
    public default int add(int a, int b){
        return a+b;
    }
    //static keyword kullanarak interface'lerin içinde body'si olan method'lar üretebilirsiniz.
    //Aşağıdaki method "static method" dur
    public static String update(String str){
        return str + "!";
    }
}
