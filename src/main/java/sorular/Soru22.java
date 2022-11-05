package sorular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soru22 {

    public static void main(String[] args) {

        //ArrayList nasıl oluşturulur?

        List<Integer> msd = new ArrayList<>();

        msd.add(5);
        msd.add(4);
        msd.add(3);
        msd.add(2);

        System.out.println(msd.size());
        System.out.println(msd.get(2));


        //Example 1: msd ArrayList'indeki tüm tek sayıları 11 artırdıktan sonra ekrana yazdırınız

        for(Integer w : msd){

            if(w%2!=0){

                msd.set(msd.indexOf(w),w+11);
            }
        }
        System.out.println(msd);
    }
}
