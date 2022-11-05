package day12loops;

public class DoWhileLoop01 {

    public static void main(String[] args) {
        //While loop bazı durumlarda hiç çalışmayabilir, yani while loop için "zero execution" mümkündür
        //Düşünür ==> Hareket eder
        int i = 1;

        while(i<1){
            System.out.println("While loop");
            i++;
        }

        //do-while loop kullandığınızda loop bodysi içindeki kod en az 1 kere çalışır
        //yani do-while loop için "zero execution" mümkün değildir
        //Hareket eder ==> Düşünür
        int k = 1;

        do{
            System.out.println("do-while loop");
            k++;
        }while(k<1);

        //Example 1: Bir ondalık sayının ondalık kısmındaki rakamlarının toplamını bulunuz.
        //           24,5673 ==> 5+6+7+3 = 23

        double num = 24.5673;
        System.out.println(num);

        //String.valueOf() methodu parantezin içine konulan datanın tipini String yapar
        String str = String.valueOf(num);
        System.out.println(str);

        //Regex için nokta kullandığınızda önüne "\\" koyunuz yani nokta "\\." şeklinde kullanılır.
        String decimalPart = str.split("\\.")[1];
        System.out.println(decimalPart);

        int decimalInt = Integer.valueOf(decimalPart);
        System.out.println(decimalInt);

        int sum = 0;//5673

        do{

            sum = sum + decimalInt%10;

            decimalInt = decimalInt/10;

        }while (decimalInt>0);

        System.out.println(sum);


    }
}
