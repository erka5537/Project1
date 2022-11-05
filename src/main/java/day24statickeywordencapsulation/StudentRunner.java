package day24statickeywordencapsulation;

public class StudentRunner {

    public static void main(String[] args) {

        Student std1 = new Student();

        System.out.println(std1.getStdId());// TH202201
        System.out.println(std1.getGpa()); //3.8
        System.out.println(std1.isRetired()); // false

        std1.setStdId("AB");
        System.out.println(std1.getStdId());// AB

        std1.setGpa(4.0);
        System.out.println(std1.getGpa()); //4.0

        std1.setRetired(true);
        System.out.println(std1.isRetired()); // true
    }
}
