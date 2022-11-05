package sorular;

public class Soru06 {

    public static void main(String[] args) {
        //120'den 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen tüm tam sayıları aynı satırda iki
        //ardışık tam sayı arasında boşluk bırakarak yazınız.

        //1. Yol:
        int i = 120;
        do{
            if(i%4==0 && i%6==0){
                System.out.print(i + " ");
            }
            i--;
        }while(i>11);

        System.out.println();

        //2. Yol:
        for(int k=120; k>11; k--){
            if(k%4==0 && k%6==0){
                System.out.print(k + " ");
            }
        }

        System.out.println();

        //3. Yol:

        int m = 120;

        while(m>11){
            if (m%4==0 && m%6==0){
                System.out.print(m + " ");
            }
            m--;
        }
    }
}
