package Ant;

public class Y extends X{

    public Y(){
        super(1);
        System.out.println(2);
        }

    public static void main(String[] args) {

        StringBuilder strBld = new StringBuilder("LearnJava");
        String strbd = strBld.substring(3);
        StringBuilder strBldaaa = new StringBuilder(strbd);
        System.out.println(strBldaaa);
    }
}
