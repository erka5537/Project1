package day28abstraction;

public class Bird extends Animal{
    @Override
    public void eat() {
        System.out.println("Bird's eat");
    }

    @Override
    public void move() {
        System.out.println("Bird's move");
    }
}
