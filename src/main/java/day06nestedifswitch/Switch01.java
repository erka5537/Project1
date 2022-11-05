package day06nestedifswitch;

import java.util.Scanner;

public class Switch01 {

    public static void main(String[] args) {

        /*
            Kullanıcıdan gün sayısını alınız ve gün ismini ekrana yazdırınız
            1==> Pazar    2==>Pazartesi    ...
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Gün numarasını giriniz...");
        byte gunNo = input.nextByte();

        //1.Yol if ile çözünüz

        if(gunNo==1){
            System.out.println("Pazar");
        }else if(gunNo==2){
            System.out.println("Pazartesi");
        }else if(gunNo==3){
            System.out.println("Salı");
        }else if(gunNo==4){
            System.out.println("Çarşamba");
        }else if(gunNo==5){
            System.out.println("Perşembe");
        }else if(gunNo==6){
            System.out.println("Cuma");
        }else if(gunNo==7){
            System.out.println("Cumaertesi");
        }else{
            System.out.println("Geçerli gün sayısı giriniz");
        }

        //2.Yol: Switch ile çözünüz
        switch (gunNo){

            case 1:
                System.out.println("Pazar");
                break;
            case 2:
                System.out.println("Pazartesi");
                break;
            case 3:
                System.out.println("Salı");
                break;
            case 4:
                System.out.println("Çarşamba");
                break;
            case 5:
                System.out.println("Perşembe");
                break;
            case 6:
                System.out.println("Cuma");
                break;
            case 7:
                System.out.println("Cumartesi");
                break;
            default:
                System.out.println("Geçerli gün numarası giriniz");

        }
    }
}
