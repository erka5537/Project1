package day28abstraction;

public abstract class Animal {

    //body'si olmayan method'lar "abstract method" olarak adlandırılır.
    //Bir method'u abstract yapmak için; i)Method body'i sil ii)"abstract" keyword kullan
    //"abstract" method'lar "abstract class" içinde olmalıdır
    public abstract void eat();

    //"abstract class" larda hem "abstract" hem de "concrete"(non abstract) method kullanılabilir.
    public void drink(){
        System.out.println("Animal's drink...");
    }

    //abstract "move" method oluşturunuz
    public abstract void move();
}
