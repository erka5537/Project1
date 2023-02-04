package day31maps;

    /*
        1)Map'ler key-value structure kullanır
        2)Key'ler unique'dir
        3)Value'lar tekrarlı data içerebilir
        4)Map'lerde eleman değil EntrySet kullanırız
        5)Key'lerde null tekrarsız olarak kullanılır
        6)Value'lar null kabul eder
        7)HashMap'ler EntrySet'leri herhangi bir sıralamaya tabi tutmaz, rastgele sıralar
        8)Sıralama ile vakit kaybetmediği için HashMap'ler çok hızlı çalışırlar.
     */

import java.util.*;

public class HashMap01 {

    public static void main(String[] args) {

        HashMap<String, Integer> studentAges = new HashMap<>();

        studentAges.put("Ali", 13);
        studentAges.put("Tom", 21);
        studentAges.put("Brad", 12);
        studentAges.put("Ajda", 76);
        studentAges.put("Cuneyt", 75);
        studentAges.put("Ali", 88);//Aynı key değerini tekrar kullandığınızda hata vermez "overwrite" yapar.
        studentAges.put(null, 55);
        studentAges.put(null, 66);
        studentAges.put("Ayhan Işık", null);
        studentAges.put("Sadri Alışık", null);
        System.out.println(studentAges); // {null=66, Ayhan Işık=null, Tom=21, Ajda=76, Brad=12, Cuneyt=75, Ali=88, Sadri Alışık=null}

        //Map'den sadece key'ler nasıl alınır?
        Set<String> keys = studentAges.keySet();
        System.out.println(keys);//[null, Ayhan Işık, Tom, Ajda, Brad, Cuneyt, Ali, Sadri Alışık]

        //Map'den sadece value'lar nasıl alınır?
        Collection<Integer> values = studentAges.values();
        System.out.println(values);//[66, null, 21, 76, 12, 75, 88, null]

        //Belli bir key'e ait value nasıl alınır?
        Integer cuneytAge = studentAges.get("Cuneyt");
        System.out.println(cuneytAge);// 75

        //Example 1: Tüm integer yaşların ortalamasını hesaplayan kodu yazınız.
        Collection<Integer> ages = studentAges.values();
        Integer sum = 0;
        double counter = 0;

        for(Integer w : ages){

            if(w!=null){
                sum += w;
                counter++;
            }
        }
        System.out.println("Ortalama Yaş: " + (sum/counter));//Ortalama Yaş: 56.333333333333336

        //Example 2: A ile başlamayan isimlerin içerdiği toplam karakter sayısını bulan kodu yazınız
        Set<String> names = studentAges.keySet();
        int sum1 = 0;
        for(String w : names){
            if(w!=null && !w.startsWith("A")){
                sum1 += w.length();
            }
        }
        System.out.println(sum1);

        //remove("Ajda", 76) key'si Ajda ve value'su 76 olan EntrySet'i siler ve size boolean return eder.
        boolean result = studentAges.remove("Ajda", 76);
        System.out.println(result);

        Integer result1 = studentAges.remove(null);
        System.out.println(result1);

        //Key varsa value' ver, key yoksa sizin istediğiniz değeri verir.
        Integer result2 = studentAges.getOrDefault("Brad", 0);
        System.out.println(result2);//12

        //Value null ise ekleme yapar, value null değil ise ekleme yapmaz
        Integer result3 = studentAges.putIfAbsent("Brad", 100);
        System.out.println(result3);// 12
        System.out.println(studentAges);

        Integer result4 = studentAges.putIfAbsent("Ayhan Işık", 100);
        System.out.println(result4);// null
        System.out.println(studentAges);

        //Key yoksa ekleme yapar
        Integer result5 = studentAges.putIfAbsent("Acun Ilıcalı", 200);
        System.out.println(result5);// null
        System.out.println(studentAges);

        //replace() method'u value'ları key'e bakarak değiştirdi.
        studentAges.replace("Acun Ilıcalı", 49);
        System.out.println(studentAges);

        //replace() method'u value'ları key ve value'u kontrol ettikten sonra değiştirdi.
        studentAges.replace("Acun Ilıcalı", 49, 53);
        System.out.println(studentAges);

        //Example 3: Map'deki herbir entry'i ekrana farklı bir satırda olacak şekilde yazdırınız.

        //entrySet() method'u Map'deki elemanları bir Set'in içine koyarak size verir
        Set<Map.Entry<String,Integer>> entries = studentAges.entrySet();

        for(Map.Entry<String,Integer> w : entries){
            System.out.println(w);
        }
    }
}
