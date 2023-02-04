package sorular01;

public class Soru18 {

    public static void main(String[] args) {

        String brr[][] = new String[4][3];

        brr[0][0] = "A";
        brr[0][1] = "B";
        brr[0][2] = "C";

        brr[1][0] = "D";
        brr[1][1] = "E";
        brr[1][2] = "F";

        brr[2][0] = "G";
        brr[2][1] = "H";
        brr[2][2] = "I";

        brr[3][0] = "J";
        brr[3][1] = "K";
        brr[3][2] = "L";

        int toplam = 0;

        for(String[] w : brr){
            toplam = toplam + w.length;
        }
        System.out.println(toplam);
    }
}
