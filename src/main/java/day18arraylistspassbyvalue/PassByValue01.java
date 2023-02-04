package day18arraylistspassbyvalue;

public class PassByValue01 {

    public static void main(String[] args) {

        /*
            1)Java variable'ların orjinal değerlerini korumak ister.
            2)Variable method'lar içinde kullanıldığında, Java method'un
              içine orjinal değeri koymaz, o değerin kopyasını üretir
              ve method'a o kopyayı yollar. Method kopya üstünde çalışır değişiklik
              yapar dolayısıyla variable'in orjinal değeri korunmuş olur.
              Bu sisteme "Pass By Value" denir.
              Note: Java "Pass By Value" kullanır. "Pass By Reference" kullanmaz
              Note: Bazı programlama dilleri orjinal değeri koruma altına
                    almamıştır. Bu işi developer'lara bırakmıştır.
                    Bu tarz diller "Pass By Reference" kullanır.
         */

        int x = 5;//Gömlek
        System.out.println(x);//5

        //static method olan "main method" un içindeki her şey
        //static olmalıdır.

        change(x);//Öğrenci gömleği
        System.out.println(x);//Gömlek

        int ucret = 100;

        int kopya = indirim(ucret);
        System.out.println(ucret);//100
    }
    public static void change(int a){
        System.out.println(a*3);
    }
    //void dışındaki "return" type'larda method body'si içinde
    //"return" keyword kullanılmalıdır.
    public static int indirim(int gomlekUcreti){
        return gomlekUcreti -10;
    }
}
