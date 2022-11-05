package org.example;

import java.util.ArrayList;
import java.util.List;

public class Ex12 {

    public static void main(String[] args) {

    }
    //Ortalama kazancı bulan method
    public static double getOrtalamaKazanc(double... a) {
        double toplam = 0;
        for (Double w : a) {
            toplam = toplam + w;
        }
        double ortalama = toplam / (a.length);
        return ortalama;
    }
}
