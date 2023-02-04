package day05ifstatement;

import java.util.Scanner;

public class IfStatement02 {

    public static void main(String[] args) {

        //Example 1: Kullanıcı gün numarasını girsin kod gün ismini yazsın
        //           2==>Pazartesi    5==>Perşembe ...
        Scanner input = new Scanner(System.in);
        System.out.println("Gün numarasını girin");
        byte gunNo = input.nextByte();

        if(gunNo==1){
            System.out.println("pazar");
        }else if(gunNo==2){
            System.out.println("pazartesi");
        }else if(gunNo==3){
            System.out.println("salı");
        }else if(gunNo==4){
            System.out.println("çarşamba");
        }else if(gunNo==5){
            System.out.println("perşembe");
        }else if(gunNo==6){
            System.out.println("cuma");
        }else if(gunNo==7){
            System.out.println("cumaertesi");
        }else{
            System.out.println("Geçerli bir gün numarası giriniz. örn. 1, 2, 3, 4, 5, 6, 7, gibi");

        }


    }
}
