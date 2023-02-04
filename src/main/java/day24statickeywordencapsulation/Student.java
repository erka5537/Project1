package day24statickeywordencapsulation;

//Encapsulation: "Data Hiding(Gizlemek)" demektir.
//Data'yı niçin gizlersiniz? Data'yı dış etkenlerden korumak için.
//Data'yı nasıl gizlersin? Access Modifier'ını "private" yaparak gizlerim

//Data'yı gizledikten sonra başka Class'lardan okumak istersen ne yaparsın?
//"get" method'lar(getter) oluşturarak gizlediğimiz data'ları okunur hale getirebiliriz.

//Data'yı gizledikten sonra başka Class'lardan değiştirmek istersen ne yaparsın?
//"set method"lar(setter) oluşturarak gizlediğimiz data'ları değiştirebiliriz.

//Variable'ın "data type" ı ile get method'un return type'ı aynı olmalıdır.
//get method'ları isimlendirirken "get + <variable name>" ancak variable'ın data type'i "boolean ise" "is + <variable name>"

public class Student {

    public String stdName = "Tom Hanks";
    private String stdId = "TH202201";
    private double gpa = 3.8;
    private boolean retired = false;

    public String getStdId() {
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isRetired() {
        return retired;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }
}
