package day23inheritancepolymorphism;

public class Cat extends Mammal{

    public void meow(){
        System.out.println("Cat's meow");
    }

    @Override // @Override annotation'ını kullanarak Java'nın yaptığınız Override işlemini kontrol etmesini sağlarız
    public void eat() {
        System.out.println("Cat's eat");
    }

    @Override
    public int add(int a, int b) {
        return a+b+1;
    }

    @Override
    public Integer multiply(int a, int b) {
        return a*b+1;
    }

    //Aşağıdaki method "Overriding Method"
    @Override
    public Mammal create() {
        return new Mammal();
    }

    /*
        @Override annotation'ını kullanarak Java'nın yaptığınız Override işlemini kontrol etmesini sağlarız
        1)Override yaparken "method'un body"si değiştirilir.
        2)Override yaparken ASLA method signature(isim ve parametre) değiştirilemez
        3)Override yaparken "inheritance" olmak zorundadır.
        4)Override yaparken "Access Modifier" lar belli kurallara göre farklılaştırılabilirler
            i)"private" methodlar override edilemezler
            ii)Child Class'taki "override edilen" method'un access modifier'ı Parent Class'taki
               method'un Access Modifier'ı ile aynı veya geniş olmalıdır
               Note: Child Class'taki method'un access modifier'ı daha dar olamaz.
            iii)Default method'lar aynı package içindeyse override edilebilirler
                farklı package'den override edilemezler
        5)Parent Class'taki method'un return type'ı void ise return type değiştirilemez.
        6)Parent Class'taki method'un return type'ı primitive ise return type değiştirilemez.
        7)Parent Class'taki method'un return type'ı Wrapper Class ise return type değiştirilemez.
        8)Parent Class'taki method'un return type'ı Parent Class ise return type Child'lardan biri olabilir.
          Note: Child Class'taki return type Parent Class'takinden geniş olamaz.
          Note: Aralarında "Parent-Child" ilişkisi olmayan Class'lar overriding'te Return Type değişiminde
                kullanılamazlar. Mesela "Short", "Integer"dan küçüktür, fakat aralarında "Parent-Child" ilişkisi
                olmadığından "Integer" yerine "Short" kullanamazsınız.
          Note: Child'daki method'un Return Type'ından Parent'daki method'un Return Type'ına gidişte
                "IS-A" Relationship olmalı.
          Note: Aralarında "IS-A" Relationship olan Data Type lara "Covariant" denir.
      9) Child<Parent ==>IS-A (Her kedi hayvandır ama her hayvan kedi değildir.
                        HAS-A ==> Hayvanlar kedileri içerir ama kediler tüm hayvanları içermez.
      10)"final" Methodlar Override edilemezler, çünkü "Overriding" de method body değiştirilir, fakat
         "final" method body değiştirilmesine müsaade etmez.
      11) Polymorphism  = Overloading + Overriding
          Note: Polymorphism nedir? derlerse Overloading ve Overriding'i anlatın.
      12)Overloading ile Overriding arasındaki farklar nelerdir?
            i)Overloading için inheritance gerekmez fakat Overriding için gerekir.
            ii)"private" method'lar Overload edilebilir, Override edilemezler.
            iii)"final" method'lar Overload edilebilir, Override edilemezler.
            iv)"Overloading" "static polymorphism" olarak "Overriding" "dynamic polymorphism" olarak adlandırılır.
               Çünkü static method'lar Overload edilebilir, Override edilemezler.
            v)"Overloading" de method signature değişir ama "Overriding"de method signature a dokunulmaz
     */
}
