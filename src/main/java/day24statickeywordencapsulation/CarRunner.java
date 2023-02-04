package day24statickeywordencapsulation;

public class CarRunner {

    /*
        1) Static keyword, class'a bağlanmış class elemanlarıdır.
            static variable/method class'a bağlıdır.
        2) Static class elemanları, tüm objelerin ortak elemanıdır.(Gökteki ay gibi)
        3) Static'ler üzerinde yapılan her değişiklik, tüm objeleri etkiler ve tüm objeler tarafından görülür.
        4) Static class elemanlarına, class üzerinden ulaşılır. Objeler, static'lere ulaşmak için kullanılmaz.
           Kullanılırsa hata vermez, fakat tavsiye edilmez.
     */

    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();

        //static variable'lara objeleri kullanarak ulaşmak mümkün ama tavsiye edilmez
        System.out.println(car1.counter);
        //static variable'lara Class ismi kullanarak ulaşılmalıdır

        System.out.println(Car.counter);
        System.out.println(car1.price);

        System.out.println(Car.counter);
        System.out.println(car2.price);

        System.out.println(Car.counter);
        System.out.println(car3.price);

        System.out.println(Car.counter);
        System.out.println(car2.price);

    }
}
