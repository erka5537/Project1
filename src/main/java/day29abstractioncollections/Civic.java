package day29abstractioncollections;

    /*
        "abstract method" lar sadece ne yapılacağını(What to do) söyler.
        "concrete method" lar ne yapılacağı ile birlikte nasıl yapılacağını(How to do) da söyler.

        "interface" ler bir yapılacak işler listesidir.(To do list)

        "multiple parent interface" kullandığınızda aynı method ismi ile birden fazla method oluşturursanız bu method'ların
        return type'ları aynı olmalıdır. Aksi takdirde hata verir.

        "interface" lerde "constructor" olmadığı için interface'lerden obje oluşturulamaz.
        "abstract class" larda class oldukları için "constructor" vardır. Ama constructor'lar abstract class'larda obje oluşturamazlar.

        Soru: "Abstract Class" ile "Interface" in farkları nelerdir?
               1)Method
                    "Abstract Class" hem abstract hem de concrete method'lar içerebilir.
                    "Interface" ler ise sadece abstract method'lar içerir.
                    Ama istersek interface'ler içindede "default" ve "static" keyword'ler kullanarak concrete method'lar oluşturabiliriz.

               2)Variable
                    "Abstract Class" larda normal Class'lardaki gibi her türlü variable oluşturulabilir.
                    "Interface" lerde ise variable'lar public static ve final olmak zorundadır.

               3)Inheritance
                         "Abstract Class" lar class oldukları için multiple inheritance'a müsaade etmezler.
                         "Interface" ler ise multiple inheritance'ı desteklerler.

               4)Object Creation
                    "Abstract Class" larda constructor vardır ama object oluşturmada kullanılmazlar
                    "Interface" lerde ise constructor olmadığından object oluşturulamaz.


    Soru: Object Oriented Programming Language prensipleri nelerdir?
            i)Inheritance   ii)Polymorphism   iii)Encapsulation    iv)Abstraction
     */

public class Civic implements Engine, Ac{


    @Override
    public void run() {
        System.out.println("Civic runs well");
    }
}
