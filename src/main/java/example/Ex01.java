package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Ex01 {

    public static void main(String[] args) {

        //Example 3: Bir tane salary list'i oluşturun, eğer salary 10000 den az ise %20 10000 ve 10000'den çok ise %10 zam yapınız

//        List<Double> salary = new ArrayList<>();
//        salary.add(12345.00);
//        salary.add(8674.50);
//        salary.add(15000.75);
//        salary.add(9500.00);
//        salary.add(20500.00);
//
//        for(Double w : salary){
//            if(w<10000){
//                salary.set(salary.indexOf(w),w*1.2);
//            }else{
//                salary.set(salary.indexOf(w),w*1.1 );
//            }
//        }
//        System.out.println("Zamlı maaşlar : " + salary);

        //Example 4: İki Array'in eşit olup olmadığını kontrol eden kodu yazınız

        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('y');
        m.add('z');

        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');
        n.add('z');

        int counter = 0;


            for(int i=0; i<m.size(); i++){

                if(m.size() != n.size()) {
                    System.out.println("Listler eşit değildir");
                    break;

                }else if((m.get(i) != n.get(i))){
                        counter++;
                        System.out.println("Listler eşit değildir");
                        break;
                }
            }
        if(counter==0){
            System.out.println("Listler eşittir");
        }
    }
}
