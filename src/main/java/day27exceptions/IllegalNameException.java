package day27exceptions;

public class IllegalNameException extends RuntimeException{

    public IllegalNameException(String message){
        super(message);
    }
}
