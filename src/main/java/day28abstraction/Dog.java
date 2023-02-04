package day28abstraction;

public class Dog extends Mammal{
    @Override
    public void eat() {
        System.out.println("Dog's eat");
    }

    @Override
    public void move() {
        System.out.println("Dog's move");
    }
}
