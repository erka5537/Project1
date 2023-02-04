package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Taceddin");
        System.out.println(names);//[Tom, Thomas, Tahsin, Trump, Taceddin]

        List<String> cities = new ArrayList<>();
        cities.add("Trump");
        cities.add("Tom");
        cities.add("Taceddin");

        names.removeAll(cities);//removeAll() kullandığınızda sadece ilk list değişir, parantezin içindeki list değişmez
        System.out.println(names);//[Thomas, Tahsin]
        System.out.println(cities);//[Trump, Tom, Taceddin]

        List<String> myNames = new ArrayList<>();
        myNames.add("Thomas");
        myNames.add("Tahsin");

        boolean sonuc1 = names.containsAll(myNames);//Bir List'in içinde çoklu elemanların var olup olmadığını kontrol eder
                                                    //Hepsi varsa true, en az biri yoksa false verir
        System.out.println(sonuc1);

        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");

        //Example 1: "a" listinde "Shoes" elemanının ilk görünümünü siliniz
        a.remove("Shoes");
        System.out.println(a);//[TV, Radio, Laptop, Shoes, Book, Shoes]

        //Example 2: "a" listinde "Shoes" elemanının tüm görünümünü siliniz
        List<String> silinecekler = new ArrayList<>();
        silinecekler.add("Shoes");

        a.removeAll(silinecekler);
        System.out.println(a);//[TV, Radio, Laptop, Book]

        //Example 3: Bir tane salary list'i oluşturun, eğer salary 10000 den az ise %20 10000 ve 10000'den çok ise %10 zam yapınız

        List<Double> salary = new ArrayList<>();
        salary.add(12345.00);
        salary.add(8674.50);
        salary.add(15000.75);
        salary.add(9500.00);
        salary.add(20500.00);
        System.out.println("Zamdan önce\n" + salary);
        for(Double w : salary){
            if(w<10000){
                salary.set(salary.indexOf(w),w*1.2);
            }else{
                salary.set(salary.indexOf(w),w*1.1);
            }
        }
        System.out.println("Zamdan sonra\n" + salary);

        //Example 4: İki Array'in eşit olup olmadığını kontrol eden kodu yazınız

        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('y');
        m.add('z');

        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('a');
        n.add('z');
        n.add('t');

        //1. Yol:
        int counter = 0;
        for(int i=0; i<m.size(); i++){
            if(m.size() != n.size()){
                counter++;
                System.out.println("Listler eşit değildir");
                break;
            }else if(m.get(i) != n.get(i)){
                counter++;
                System.out.println("Listler eşit değildir");
                break;
            }
        }
        if(counter==0){
            System.out.println("Listler eşittir");
        }

        //2. Yol:
        boolean esitmi = m.equals(n);
        if(esitmi){
            System.out.println("Listler eşit");
        }else System.out.println("Listler eşit değil");
    }
}
