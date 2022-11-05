package day01variables;

public class Variables01 {

    //variable nasıl oluşturulur?

    //1)Access Modifier   2)Data Type   3)Variable ismi   4) =    5) deger
    //Javada ";" ingilizcedeki nokta gibidir (cümle bitince koyulur)
    //ingilizcede "cümle" javada "statement" deriz
    //"=" = Assignment(atama) Operator sağdaki 13 ü age nin içine koyar

    public int age = 13;
    public int height = 183;

                        //Javada Data Type'leri
    /*
                           (ilkel)Primitive Data Types
    1)int: Integer'in kısaltması. tam sayı demektir. 32 bit kullanır
           matematikte tam sayıların başı sonu yoktur. am javada vardır
           en küçük int = -2,147,483,648
           en büyük int = 2,147,483,647
    2)byte: tam sayılar için kullanılır. 8 bit kullanır
            en küçük byte = -128
            en büyük byte = 127


    3)short: tamsayılar için 16 bit kullanır
             en küçük short = -32768
             en büyük short = 32767

    4)long: tamsayılar için (int yetmezse) 64 bit kullanır
            en küçük long = -9,223,372,036,854,755,808
            en büyük long = 9,223,372,036,854,755,807

    5)float: ondalıklı sayılar içindi 32 bit kullanır
            virgülden sonra 7 basamak içerebilir
            float değerden sonra "f" veya "F" koymanız gerekir

    6)double: ondalıklı sayılar içindir 64 bit kullanır
              virgülden sonra 16 basamak içerebilir

    7)boolean: true veya false değerleri için kullanılır. 1 bit kullanır.

    8)char: tek karakterler için kullanılır 16 bit kullanır
            A, c, Z, ?, _, =
            değer verirken değeri tek tırnak içine al

            Note: Java büyük küçük harfe duyarlıdır
            Java için TRUE ile true tamamen farklıdır

   Note: Numeric Data Types: byte < short < int < long < float < double
         Numeric olmayan Data Types: boolean - char

                          Non-primitive Data Types
    String: Isım,adres, kimlik no, gibi bir veya birden fazla karakter içeren değerlerde kullanılır
            string değerler mutlaka çift tırnağa alınır
            string non-primitive dir. Yani bir string oluşturduğunuzda Java size bir sürü method verir
            primitive non-primitive farkı
            1)Non-primitive lerde değerin yanında methodlar vardır
              primitivelerde sadece değer vardır, method yoktur
            2)primitive ler java tarafından oluşturulmuştur toplam 8 tanedir. biz primtive data oluşturamayız
              non primtive ler java tarafından da oluşturulmuştur bizde oluştururuz
              non primtiv sayılamayacak kadar çoktur çünkü her developer non-primtiv data type oluşturabilir
            3)primtive ler küçük harfle başlar (örnek: int)
              non-primitive ler büyük harfle başlar (örnek:String)
            4)primitve data typle lar memory de farklı büyüklükte yerler kullanır.
              non-primitive lerin hepsi memory de aynı büyüklükte yer kullanır


     */
    public byte price = 12;

    public short populationofVillage = 23000;//populationofVillage(köyün nüfusu)

    public float priceofShirt = 13.99F;  //priceofShirt(gömleğin fiyatı)

    public double weightofCell = 0.0000120045; //weightofCell(hücre ağırlığı)

    //Siz "long" demenize rağmen java verilen sayıyı "int" kabul eder
    //bu yüzden long bir variableye int aralığının dışında bir sayı verirseniz l veya L koyarız
    public long populationOfWorld = 7000000000L;

    //int aralığındaysa "L" ye gerek yok
    public long x = 1234;

    public boolean isOld = true;
    public boolean isRich = false;

    public char initial = '8';

    public String name = "Tom Hanks";
    //main method arabanın motoru gibidir
    //main method olmadan hiçbir şey çalışmaz

    public static void main(String[] args) {



    }




 }