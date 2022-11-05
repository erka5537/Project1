package sorular;

public class Soru05 {

    public static void main(String[] args) {

        //Example 1: Kullanıcıdan bir sayı alınız sayı 100 den küçük ise ekrana "Kazandınız!" yazdırınız
        //           Aksi halde ekrana "Kaybettiniz!" yazdırınız
        //           Kullanıcı kazandıkça oyun devam etmeli

//        Scanner input = new Scanner(System.in);
//        int sayı = 0;
//        do{
//            System.out.println("Bir sayı giriniz...");
//            sayı = input.nextInt();
//            if(sayı<100){
//                System.out.println("Kazandınız!");
//            }
//        }while(sayı<100);
//        System.out.println("Kaybettiniz!");

        //Kullanıcıdan isimler alınız ilk harfinin büyük olup olmadığını kontrol ediniz
//        String isim = "0";
//        do{
//            System.out.println("İsim giriniz");
//            isim = input.next();
//            if(isim.charAt(0)>'A' && isim.charAt(0)<'Z'){
//                System.out.println("İlk harf büyük");
//            }else{
//                System.out.println("İlk harf büyük değil");
//                break;
//            }
//        }while(true);

        int stdAges[] = new int[7];

        stdAges[0] = 12;
        stdAges[1] = 11;
        stdAges[2] = 13;
        stdAges[3] = 14;
        stdAges[4] = 10;
        stdAges[5] = 12;
        stdAges[6] = 12;

        //Example 2: stdAges Array'i içindeki tüm elemanların toplamını ekrana yazdıran kodu yazınız.

//        int i = 0;
//        int toplam = 0;
//
//        do {
//            toplam = toplam + stdAges[i];
//
//            i++;
//
//        }while(i<stdAges.length);
//
//        System.out.println(toplam);


//        int t = 0;
//
//        for(int w : stdAges){
//            t = t + w;
//        }
//        System.out.println(t);

        //Example 3: String bir array oluşturunuz
        //           Bu Array'e 5 tane isim yerleştiriniz
        //           Bu isimlerdeki karakter sayılarının toplamını ekrana yazdırınız

//        String isimler[] = new String[5];
//
//        isimler[0] = "ayşe";
//        isimler[1] = "fatma";
//        isimler[2] = "can";
//        isimler[3] = "ali";
//        isimler[4] = "murat";
//
//        int toplam = 0;
//        for(String w : isimler) {
//
//            toplam = toplam + w.length();
//
//        }
//        System.out.println(toplam);

        //Example 4: Char bir Array oluşturunuz
        //           Bu Array'e 5 eleman ekleyiniz
        //           Bu Array'deki sadece büyük harfleri ekrana yazdırınız

        char harfler[] ={ 'a','F','g','E','R'};



//        for(char w : harfler){
//
//            if(w>='A' && w<='Z'){
//                System.out.println(w);
//            }
//        }

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

        int l = 120;

        while(l>11){
            if (l%4==0 && l%6==0) {
                System.out.print(l + " ");
                l--;
            }
        }
    }
}
