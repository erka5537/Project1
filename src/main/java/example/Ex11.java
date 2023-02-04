package org.example;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Formatter;

public class Ex11 {

    public static void main(String[] args) {

        //Example 1:
        //Ali'nin kaç gün yaşadığını bulan kodu yazınız.
        //Ali'nin doğum tarihi 12 Mayıs 2002'dir
        LocalDate aliDogum = LocalDate.of(2002,5,12);
        LocalDate şuan = LocalDate.now();
        Long fark = ChronoUnit.DAYS.between(aliDogum,şuan);
        System.out.println(fark);//7469

        //Example 2:
        //Veli'nin kaç ay yaşadığını bulan kodu yazınız.
        //Veli'nin doğum tarihi 4 Haziran 1997'dir
        LocalDate veliDogum = LocalDate.of(1997,6,4);
        LocalDate şimdi = LocalDate.now();
        Long fark1 = ChronoUnit.MONTHS.between(aliDogum,şuan);
        System.out.println(fark1);//245

        //Ahmet'nin doğum tarihi 4 Haziran 1997'dir. Ahmet'nin doğum tarihinden 2 yıl, 3 ay ve 12 gün
        //sonraki tam tarihi bulmak için kodu yazınız.

        LocalDate ahmetDogum = LocalDate.of(1997,6,4);
        LocalDate geçenZaman = ahmetDogum.plusYears(2).plusMonths(3).plusDays(12);
        System.out.println(geçenZaman);

        //Japonya saat dilimi ile Almanya saat dilimi arasındaki saat farkını bulmak için kodu yazınız.

        LocalTime japan = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        LocalTime german = LocalTime.now(ZoneId.of("Europe/Berlin"));
        long fark3 = ChronoUnit.HOURS.between(japan,german);
        System.out.println(fark3);

        LocalTime german1 = LocalTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(german1);

        DateTimeFormatter yeniSistem = DateTimeFormatter.ofPattern("hh:mm a");
        String değişenGerman1 = yeniSistem.format(german1);
        System.out.println(değişenGerman1);
    }
}
