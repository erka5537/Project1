package Ant;

public class MyClass {
    String isim;
    int yas = 33;
    int kilo = 85;

    MyClass(String isim, int yas){
        this.isim = isim;
        this.yas = yas;
    }
    MyClass(){
        isim = "erkam";
    }

    public static void main(String[] args) {

        MyClass obj1 = new MyClass();
        System.out.println(obj1.isim);

    }
}

