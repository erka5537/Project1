package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.chrono.JapaneseDate;
import java.time.temporal.ChronoUnit;

public class DateTime01 {

    public static void main(String[] args) {

        //Example 1: "Anlık tarihi" ekrana yazdıran kodu yazınız
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);// 2022-10-21

        //Example 2: "Anlık zamanı" ekrana yazdıran kodu yazınız
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);// 20:41:15.962848900

        //Example 3: "Anlık tarihi(Current Date) ve "Anlık zamanı"(Current Time)" ekrana yazdıran kodu yazınız
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);//2022-10-21T20:52:10.585534100

        //Example 4: Japonya'daki "Anlık tarihi(Current Date) ve "Anlık zamanı"(Current Time)" ekrana yazdıran kodu yazınız
        LocalDateTime currentDateTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeInJapan);//2022-10-22T02:52:10.585534100

        //Example 5: İstanbul'daki "Anlık tarihi(Current Date) ve "Anlık zamanı"(Current Time)" ekrana yazdıran kodu yazınız
        LocalDateTime currentDateTimeInIstanbul = LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(currentDateTimeInIstanbul);//2022-10-21T20:52:10.586531900

        //Example 6: Bugünden 789 gün sonra emekli olacağınıza göre, emeklilik tarihini hesaplayan kodu yazınız
        LocalDate countDate = LocalDate.of(2022,10,21);
        LocalDate retireDate = countDate.plusDays(789);
        System.out.println(retireDate);

        //Example 7: Iki çocuğunuzun doğum tarihleri arasındaki farkı gün olarak hesaplayan kodu yazınız

        LocalDate dobAli = LocalDate.of(2005,5,17);
        LocalDate dobVeli = LocalDate.of(2013,2,8);

        //between(dobAli,dobVeli); method'u kullanıldığında daha eski tarih olan önce yazılmalıdır
        Long diff = ChronoUnit.DAYS.between(dobAli,dobVeli);
        System.out.println(diff);//2824

        //Example 8: Istanbulun Fethi ile, Cumhuriyetin kurulması arasında kaç ay olduğunu gösteren kodu yazınız

        LocalDate fetih = LocalDate.of(1453,5,29);
        LocalDate cumhur = LocalDate.of(1923,10,29);
        Long fark = ChronoUnit.MONTHS.between(fetih,cumhur);
        System.out.println(fark);

        //Example 9: Verilen tarih'in hangi burçta olduğunu gösteren kodu yazınız
        LocalDate myDate = LocalDate.of(1989,12,7);

        int day = myDate.getDayOfMonth();
        int month = myDate.getMonthValue();

        if ((month==1 && day<=20)||(month==12 && day>=21)) {
            System.out.println("Oğlak");
        }else if((month==1 && day>=21)||(month==2 && day<=19)) {
            System.out.println("Kova");
        }else if((month==2 && day>=20)||(month==3 && day<=20)) {
            System.out.println("Balık");
        }else if((month==3 && day>=21)||(month==4 && day<=20)) {
            System.out.println("Koç");
        }else if((month==4 && day>=21)||(month==5 && day<=20)) {
            System.out.println("Boğa");
        }else if((month==5 && day>=21)||(month==6 && day<=21)) {
            System.out.println("İkizler");
        }else if((month==6 && day>=22)||(month==7 && day<=22)) {
            System.out.println("Yengeç");
        }else if((month==7 && day>=23)||(month==8 && day<=23)) {
            System.out.println("Aslan");
        }else if((month==8 && day>=24)||(month==9 && day<=23)) {
            System.out.println("Başak");
        }else if((month==9 && day>=24)||(month==10 && day<=23)) {
            System.out.println("Terazi");
        }else if((month==10 && day>=24)||(month==11 && day<=22)) {
            System.out.println("Akrep");
        }else if((month==11 && day>=23)||(month==12 && day<=21)) {
            System.out.println("Yay");
        }
    }
}
