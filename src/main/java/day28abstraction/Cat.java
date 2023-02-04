package day28abstraction;

public class Cat extends Mammal{

    /*
        Bir method "parent class" da "abstract method" ise;
        Child Class o method'u "override" edip kullanmak zorundadır.
        Bu yüzden herhangi bir fonksiyonu "Child Class" için mecburi yapmak isterseniz o method'u "abstract" yapmalısınız.
    */

    @Override
    public void eat() {
        System.out.println("Cat's eat");
    }

    @Override
    public void move() {
        System.out.println("Cat's move");
    }
}
