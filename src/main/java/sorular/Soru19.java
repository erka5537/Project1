package sorular;

public class Soru19 {

    public static void main(String[] args) {

        //Bir String MultiDimensionalArray'de içinde "a" olanları console'a yazdırınız

        String brr[][] = {{"learn", "java", "it"}, {"is", "easy"}};

        for(String[] w : brr){

            for(String k : w){

                if(k.contains("a")){
                    System.out.print(k + " ");
                }

            }

        }
    }
}
