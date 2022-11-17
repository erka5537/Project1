package day32maps;

public class Students {

    public String name;
    public String email;
    public int age;
    public boolean success;

    public Students(String name, String email, int age, boolean success) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.success = success;
    }

    @Override
    public String toString() {
        return "[" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", success=" + success +
                ']';
    }
}
