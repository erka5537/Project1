package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner01 {

    //Scanner Kullanıcıdan data almaya yarar. Scanner kullanıcı ile etkileşim kurmamızı sağlar.
    //Scanner bir Java Class'ıdır. Bu Class'ı kullanabilmek için import etmek gerekir.
    //Scanner Class'ı Java'nın Util Kütüphanesindedir.

    public static void main(String[] args) {

        //Kullacıcıdan data almak için yapılması gerekenler

        //1.Adım: Scanner Class'ından object oluşturun
        Scanner input = new Scanner(System.in);

        //2.Adım: Kullanıcıya ne yapıcağını söyle
        System.out.println("Hey kullanıcı yasını gir...");

        //3.Adım: Kullanıcıdan aldığınız data yı bir variable nin içine koyun
        byte age = input.nextByte();

        System.out.println("Hey kullanıcı senin yaşın " + age);

    }

}
