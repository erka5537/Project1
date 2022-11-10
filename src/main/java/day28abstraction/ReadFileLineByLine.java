package day28abstraction;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

    /*
                            "throw" ile "throws" arasındaki farklar nelerdir?
        1)"throw" method'un body'si içinde kullanılır. "throws" ise method'un isminden sonra kullanılır.
        2)"throw" dan sonra obje oluşturulur. "throws" dan sonra ise sadece Exception Class'ın ismi yazılır.
        3)"throw" method'un içinde istediğimiz yerde Exception üretmek için kullanılır. "throws" ise var olan
          checked Exception'ı atmak için kullanılır.
        4)"throw" dan sonra sadece bir tane Exception olabilir.
          "throws" dan sonra birden fazla Exception olabilir.
    */

public class ReadFileLineByLine {

    public static void main(String[] args) {
        readFileLineByLine();
    }

    public static void readFileLineByLine(){

        try {
            BufferedReader br = new BufferedReader(new FileReader("src\\main\\java\\day27exceptions\\File1.txt"));

            String line = br.readLine();

            while(line!=null){
                System.out.println(line);
                line = br.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("Ya path yanlış ya da dosya silinmiş - "+e.getMessage());
        } catch (IOException e) {
            System.out.println("Okunamayacak character veya characterler var - "+e.getMessage());
        }
    }
}
