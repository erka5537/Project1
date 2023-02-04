package day06nestedifswitch;

import java.util.Scanner;

public class Switch03 {

    public static void main(String[] args) {

        //Note: Switch'te sadece int, byte, short, char, String data typeleri kullanılabilir
        //Note: Eğer 3 den fazla durum varsa switch() tercih ederiz

        //kullanıcıdan işlem ve iki tane sayı alarak işlemin sonucunu ekrana yazdıran basit bir hesap makinesi yazınız
        Scanner input = new Scanner(System.in);
        System.out.println("İşlemi giriniz, +, -, *, /, %");
        char islem = input.next().charAt(0);

        System.out.println("İlk sayıyı giriniz");
        double ilk = input.nextDouble();

        System.out.println("İkinci sayıyı giriniz");
        double ikinci = input.nextDouble();

        switch (islem){
            case '+':
                System.out.println(ilk + ikinci);
                break;
            case '-':
                System.out.println(ilk - ikinci);
                break;
            case '*':
                System.out.println(ilk * ikinci);
                break;
            case '/':
                System.out.println(ilk / ikinci);
                break;
            case '%':
                System.out.println((ilk * ikinci)/100);
                break;
            default:
                System.out.println("Bu işlem tanımlanmamıştır...");
        }
    }
}
