package lesson14.excrption.dog;

public class DogIsNotReadyException extends Exception{
    public DogIsNotReadyException(String message) {
        super(message);
    }
}
