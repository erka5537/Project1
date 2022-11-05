package Ant;

public class S01 {

    public static void main(String[] args) {

        /*  TASK :
        check your array's first and last elements are same
        (dizinizin ilk ve son elemanlarının ayni olup olmadığını kontrol eden kod yaziniz
        int []arr={2,6,4,8,2,6,2};
         */
        int[] arr = {2, 6, 4, 8, 2, 6, 2};

        if(arr[0] == arr[arr.length-1]){
            System.out.println("İlk ve son eleman aynı");
        }else System.out.println("İlk ve son eleman aynı değil");
    }
}
