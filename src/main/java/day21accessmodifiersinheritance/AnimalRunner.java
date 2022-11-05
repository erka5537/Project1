package day21accessmodifiersinheritance;

public class AnimalRunner{

    /*
        1)"Inheritance" sayesinde
            i)Code tekrarlarından kurtuluruz
            ii)Code tamiri(maintenance) kolay olur
            iii)Child Class'ları daha atomik yapmış oluruz

        2)Bir Class'ı başka bir Class'ın Child Class'ı yapmak için
          "extends" keyword kullanılır. İlk yazılan Class child, ikinci
          yazılan Class parent olur.

        3)Child Class objectleri Parent Class'tan method ve variable'ları
          kullanabilirler

        4)Parent Class objectleri Child Class'tan method ve variable'ları
          kullanamazlar

        5)Object Class her Class'ın parent'ıdır.
          Java da Object Class hariç her Class'ın parent'ı vardır.
          Java'da parent'ı olmayan tek Class Object Class'tır

        6)"private" method ve variable'lar Child Class'lar tarafından kullanılamaz
          "protected" method ve variable'lar Child Class'lar tarafından kullanılabilir
          "default" method ve variable'lar aynı package'deki Child Class'lar tarafından kullanılabilir
          "public" method ve variable'lar Child Class'lar tarafından kullanılabilir
          Note: "Child Class'lar tarafından kullanılabilir" olmak "inherit" edilebilir demektir

        7)4 tip Inheritance vardır
            i)Multilevel Inheritance: Java bunu kabul eder
            ii)Hierarchical Inheritance: Bir parent içint çoklu child, Java bunu kabul eder
            iii)Multiple Inheritance: Bir Child'a çoklu Parent, Java bunu desteklemez.(Java does not support Multiple Inheritance)
            iv)Single Inheritance: Bir Child Class için bir Parent Class demektir, Java bunu destekler
     */

    public static void main(String[] args) {

        Cat c1 = new Cat();
        c1.eat();
        c1.drink();
        c1.meow();

        Dog d1 = new Dog();
        d1.bark();
        d1.eat();
        d1.drink();

        Animal a1 = new Animal();
    }
}
