package day23inheritancepolymorphism;

public class Animal{

    public void eat(){
        System.out.println("Animal's eat");
    }

    public int add(int a, int b){
        return a+b;
    }

    public Integer multiply(int a, int b){
        return a*b;
    }

    //Aşağıdaki method "Overridden Method"
    public Animal create(){
        return new Animal();
    }

    //"final" Methodlar Override edilemezler
    public final double divide(int a, int b){
        return a/b;
    }
}
