package day02methodcreation;

public class Car {

    public String marka = "Honda";
    public int fiyat = 20000;

    /*
    Note: Class==> Variable==>Object==>Kullanacağız
                   Method
     */

    public static void main(String[] args) {

        //Object nasıl oluşturulur?
        //1)Class ismini yazınız       2)Objeye bir isim veriniz    3) =      4)new keyword'ünü kullan       5)Class ismini parantezle beraber (constructor)
                    Car                         myHonda                =                  new                              Car();
        System.out.println(myHonda.fiyat);//20000
        System.out.println(myHonda.marka);//Honda
        myHonda.hareketEt();
        myHonda.dur();

        //MethodCreation class'ından object oluşturduk.
        MethodCreation obj = new MethodCreation();
        System.out.println(obj.toplamaYap(3, 5));//8.0

    }

    public void hareketEt(){
        System.out.println("Honda guzel hareket eder...");
    }

    public void dur(){
        System.out.println("Honda guvenli bi şekilde durur...");
    }


}
