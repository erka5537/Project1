package day27exceptions;

//Eğer Exception Class'a extend ederseniz sizin Class'ınız "Compile Time Exception" olur
public class IllegalGradeException extends Exception{

    public IllegalGradeException(String message){
        super(message);
    }
}
