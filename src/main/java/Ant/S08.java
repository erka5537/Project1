package Ant;

public class S08 {

    public static void main(String[] args) {

        /* TASK :
        arr1 = { {1,2}, {3,4,5}, {6} }  ve  arr2 = { {7,8,9}, {10,11}, {12} }  veriliyor.
        Bu iki array'in tum elemanlarinin toplamini bulan programi yaziniz.
         */

        int arr[][] = {{1,2},{3,4,5},{6} };
        int arr2[][] = {{7,8,9},{10,11},{12}};

        int toplam = 0;
        int toplam2 = 0;

        for(int[] w : arr){
            for(int k : w){
                toplam +=k;
            }
        }
        System.out.println("1. Arrayin elemanları toplamı = "+toplam);
        for(int[] w : arr2){
            for(int k : w){
                toplam2 +=k;
            }
        }
        System.out.println("2. Arrayin elemanları toplamı = "+toplam2);
        System.out.println("2 arrayind elemanlarının toplamı = "+(toplam+toplam2));
    }
}
