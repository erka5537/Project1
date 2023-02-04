package day25exception;

public class E02 {

    public static void main(String[] args) {

        String arr[] = {"Ali", "Can", "Veli", "Han"};

        getElementFromArray(arr,2);//Veli
        getElementFromArray(arr,0);//Ali
        getElementFromArray(arr,4);//ArrayIndexOutOfBoundsException
    }
    //Bir String Array den index girerek eleman elde edebilmek için bir method oluşturun
    public static void getElementFromArray(String arr[], int idx){

        try{
            System.out.println(arr[idx]);
        }catch(ArrayIndexOutOfBoundsException e) {
            //Bu benim teknik olmayan açıklamam
            System.out.println("Array index te bir problem meydana geldi====>"+e.getMessage());

            //Exception ile ilgili detaylıca teknik mesaj verir
            e.printStackTrace();

            //Hata mesajını diğer mesajlardan ayırmak için kullanırız
            System.err.println("Array index te bir problem yaşandı");
        }
    }
}
