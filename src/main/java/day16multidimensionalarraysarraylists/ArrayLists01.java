package day16multidimensionalarraysarraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {

    /*
        ArrayList'ler aynı data tipine sahip birden fazla datayı depolamak için kullanılır.
        Array ile ArrayList'in farkı nedir?
        1)Array oluştururken Array'in içine kaç tane eleman kopymamız gerektiğini söylemeliyiz ve söylediğimiz eleman sayısından fazla eleman koyamayız.
          Array'ler eleman sayısında "fixed" dirler.
          ArrayList'leri oluştururken eleman sayısı söylemeye gerek yok çünkü ArrayList'ler eleman sayısında "flexible"(esnek) dirler.
        2)Array'lerin içine "primitive" ve "reference" lar konabilir.
          ArrayList'lerin içine ise sadece "non-primitive" ler konulur.
        3)Array'ler super fast, çok hızlıdır. Array'ler memory i çok az kullanır.
        Note: Eleman sayısı kesin belli olan çoklu dataları depolamak için Array kullanırız, ama
              Elaman sayısı değişken olan çoklu datalar için Array kullanma riskini almayın
    */

    public static void main(String[] args) {

        //ArrayList nasıl oluşturulur?
        //1.Yol:
        ArrayList<Integer> ages = new ArrayList<Integer>();
        //2.Yol:
        ArrayList<Integer> heights = new ArrayList<>();
        //3.Yol:
        List<Integer> nums = new ArrayList<>();

        //ArrayList ler nasıl yazdırılır?
        System.out.println(nums);// []

        //ArrayList lere nasıl eleman eklenir?
        //add() her zaman elemanı en sona ekler. (insertion order)
        nums.add(21);
        nums.add(18);
        nums.add(20);
        System.out.println(nums);// [21, 18, 20]

        nums.add(1,50);
        System.out.println(nums);//[21, 50, 18, 20]

        List<Integer> prices = new ArrayList<>();
        prices.add(23);
        prices.add(185);

        nums.addAll(prices);
        System.out.println(nums);//[21, 50, 18, 20, 23, 185]
        System.out.println(prices);//[23, 185]

        nums.addAll(2, prices);
        System.out.println(nums);//[21, 50, 23, 185, 18, 20, 23, 185]

        //ArrayList'lerin eleman sayısı nasıl bulunur?

        int elemanSayısı = nums.size();
        System.out.println(elemanSayısı);//8

        //ArrayList'lerde herhangi bir eleman nasıl seçilir
        //get() methodu istenen bir index'teki elemanı verir
        int el1 = nums.get(3);
        System.out.println(el1);//185

        //ArrayList'in boş olup olmadığını nasıl anlarız?
        boolean bos1 = nums.isEmpty();
        System.out.println(bos1);//false

        boolean bos2 = ages.isEmpty();
        System.out.println(bos2);//true

        //ArrayList'de bir eleman nasıl değiştirilir?
        nums.set(3, 200);
        System.out.println(nums);//[21, 50, 23, 200, 18, 20, 23, 185]

        //Example 1: nums ArrayList'indeki tüm tek sayıları 11 artırdıktan sonra ekrana yazdırınız

        for(int w : nums){

            if(w%2!=0){
                nums.set(nums.indexOf(w),w+11);
            }
        }
        System.out.println(nums);//[32, 50, 34, 200, 18, 20, 34, 196]

        //remove() method'unun içine tam sayı koyarsanı Java onu index olarak kabul eder

        //Example 2: ArrayList'den 34 elemanınının ilk görünümünü siliniz
        //Note 1: Tüm tam sayılar Java için aksi söylenmedikçe primitive'dir yani "int" dir
        //Note 2: "primitive" ler ArrayList'lerin elemanı olamazlar.
        //Note 3: "primitive" i "Wrapper Class" a çevirirseniz "non-primitive" olur ve "non-primitive" ler ArrayList lerin elemanı olur
        Integer sayı = 34;
        nums.remove(sayı);
        System.out.println(nums);//[32, 50, 200, 18, 20, 34, 196]
    }
}
