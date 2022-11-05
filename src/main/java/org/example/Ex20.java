package org.example;

public class Ex20 {

    public static void main(String[] args) {

        //29) Herhangi bir döngü kullanmadan 1'den 100'e kadar tam sayıları yazdıran bir program
        //yazınız.

        printNumbers(20);
    }
    static void printNumbers(int n) {
        if (n > 0) {
            printNumbers(n - 1);
            System.out.print(n + " ");
        }
    }
}
