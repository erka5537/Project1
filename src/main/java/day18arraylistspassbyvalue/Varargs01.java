package day18arraylistspassbyvalue;

public class Varargs01 {

    /*
        1)Farklı sayılardaki parametrelerle çalışabilen bir method
          oluşturmak isterseniz "varargs" kullanmalısınız.

        2)"varargs" arka tarafta "Array" kullanır, bu yüzden
          "varargs" larla çalışırken "Array" lerle çalışıyormuş gibi
          davranabilirsiniz.

        3)"varargs" oluşturmak için "<data type>... <varargs ismi>"
                               veya "<data type> ...<varargs ismi>"

        4)Bir method'da "varargs" ın yanında başka bir parametre
          kullanılabilir mi?
          "varargs" en sonda olmak şartı ile kullanılır.

        5)Bir method'da birden fazla "varargs" kullanılabilir mi?
          "varargs" en sonda olmak zorunda olduğundan birden fazla
          kullanırsanız en az biri en sonda olmayacaktır. Bu da
          4. kural ile çelişir
     */

    public static void main(String[] args) {

        int r1 = add(2,3);
        System.out.println(r1);

        int r2 = add(2,3,4,5,6,7,8,9);
        System.out.println(r2);//44

    }
    //İki sayının toplamını return eden bir method oluşturunuz
//    public static int ikiTopla(int a, int b){
//        return a+b;
//    }
    //Üç sayının toplamını return eden bir method oluşturunuz
//    public static int üçTopla(int a, int b, int c){
//        return a+b+c;
//    }
    //Dört sayının toplamını return eden bir method oluşturunuz
//    public static int topla(int a, int b, int c, int d){
//        return a+b+c+d;
//    }

    //İstediğimiz kadar sayıyı toplayabileceğimiz bir method oluşturalım
    public static int add(int... a){

        int sum = 0;
        for(int w : a){
            sum = sum + w;
        }
        return sum;
    }
}
