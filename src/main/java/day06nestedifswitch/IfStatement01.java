package day06nestedifswitch;

import java.util.Scanner;

public class IfStatement01 {

    public static void main(String[] args) {

        //Kullanıcıdan yaş değerini alan ve yaşın hangi evrede olduğunu aşağıdaki tabloya göre ekrana yazdırınız
        //0 - 4 => bebek
        //5 - 12 => çocuk
        //13 - 20 => genç
        //21 - 30 => yetişkin
        //else (tanımlanmamış evre)

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz...");
        byte yas = input.nextByte();

        if(yas<0){
            System.out.println("Geçerli yaş giriniz");
        }else if(yas<5){
            System.out.println("Bebek");
        }else if(yas<13){
            System.out.println("Cocuk");
        }else if(yas<21){
            System.out.println("Genc");
        }else if(yas<31){
            System.out.println("Yetişkin");
        }else{
            System.out.println("Tanımlanmamış evre...");
        }
    }
}
