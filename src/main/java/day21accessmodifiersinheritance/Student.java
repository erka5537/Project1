package day21accessmodifiersinheritance;

public class Student {

    /*
        Access Modifier
        1)public    2)protected    3)default(Access Modifier'ı default yapmak için access modifier yazmayız)   4)private

        Note: Access Modifier'ları genişten dara doğru sayınız
              public > protected > default > private
        Note: Access Modifier'ları birer birer açıklayınız
              public olanlar her Class'tan kullanılabilir
              protected olanlar başka package'lerden kullanılamaz ancak başka package'de child class içinden kullanılabilir
              default olanlar başka package'den kullanılamazlar
              private olanlar sadece oluşturuldaki Class içinde kullanılabilirler
       Note: protected ile default'un farkını söyleyiniz
             protected olanlar başka package'lerden kullanılamaz ancak başka package'de child class içinden kullanılabilir
             default olanlar başka package'den kullanılamazlar
       Note: Class'lar için hangi Access Modifier'lar kullanılabilir?
             public, default kullanılır ama protected ve private kullanılamaz

     */
    //public her Class'tan kullanılabilir
    public String stdName = "TomHanks";

    //protected olanlar başka package'lerden kullanılamaz ancak başka package'de child class içinden kullanılabilir
    protected String address = "Miami";

    //default olanlar başka package'den kullanılamazlar
    String email = "th@gmail.com";

    //private olanlar sadece oluşturuldaki Class içinde kullanılabilirler
    private String stdId = "20206517004";
}
