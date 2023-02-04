package day11loops;

public class ForLoop02 {

    public static void main(String[] args) {

        // Bir String'teki "m" karakteri hariç tüm karakterleri yazdırınız
        //Andromeda ==> Androeda

        String str = "madam";

        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c!='m' && c!='M'){
                System.out.print(c);
            }
        }

        //2.Yol:
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c=='m'){
                continue;//Boşveeeer ==> loop'un içinde bazı değerler için loop'un çalışmamasını isterseniz "continue" kullanınız
            }
            System.out.println(c);
        }

        //Exanmple 2: 1'den 100'e kadar 6 ile bölünenler hariç tüm tam sayıları ekrana yazdırınız
        for(int i=1; i<101; i++){

            if(i%6==0){
                continue;
            }
            System.out.print(i + " ");
        }

        System.out.println();

        //Example 3: Size verilen bir String'teki 'm' den önceki karakterleri yazdırınız
        //           Luxemburg ==> Luxe

        String s = "Luxemburg";

        for(int i = 0; i<s.length(); i++){

            char c = s.charAt(i);

            if(c=='m'){
                break;
            }
            System.out.print(c);
        }
    }
}
