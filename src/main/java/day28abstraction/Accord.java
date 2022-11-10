package day28abstraction;

public class Accord implements Engine, Ac, Hood{
    @Override
    public void eco() {
        System.out.println("Uses eco engine");
    }

    @Override
    public void gas() {
        System.out.println("Uses gas");
    }

    @Override
    public void tsi() {
        System.out.println("Uses tsi technology");
    }

    @Override
    public void digital() {
        System.out.println("Uses digital AC");
    }

    @Override
    public void climate() {
        System.out.println("Uses climate technology");
    }

    @Override
    public void steel() {
        System.out.println("Hood is made by steel");
    }
}
