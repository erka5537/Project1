package sorular01;

public class ABCD {

    public static void main(String[] args) {

        /*
         TASK :
Aşağıdaki şekilde çıktı veren programı print içerisinde
sadece bir tane # kullanarak yazıdırınız

           #####
           #####
           #####
           #####
           #####


     */

        for(int i = 0; i<5; i++ ){//dış döngü sütunlar

            for(int k=0; k<5; k++)//iç döngü satırlar
                System.out.println("#");//döngünün içerisi tek satırda tamamlandığı için "{}" kullanmadık

            System.out.println();
        }
    }
}
