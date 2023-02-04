package project_questions;

public class SubtractionSquare {

    public static void main(String[] args) {

        /*
   substSquare: bu method parametre olara iki int alır ve  parametreleri getSumOfSquares methodu ile
    return edilen degerlerin toplamını  return eder.
  Örnek:
    int 1 = 10;
    int 2 = 5;
    3025 + 225 = 3250
    return 3250
   getSumOfSquares methodunu kullanarak Parametre sayıya kadar sayıları toplar ve toplamın karesini return eder.
   Örnek:
      int 1 = 10;              yazacağınız method 10 u kullanarak 3025 sonucu verir
  parametreleri kullanıcıdan alınız
    */

        int sonuc = substSquare(10,5);
        System.out.println(sonuc);

    }public static int substSquare(int a, int b){
        return getSumOfSquares(a) + getSumOfSquares(b);
    }

    public static int getSumOfSquares(int a){
        int sum = 0;
        for(int i=a; i>=0; i--){
            sum += i;
        }
        return sum*sum;
    }
}
