package ua.privatbank.lesson08;
/**
 * Класс проверяемого исключения "Собака не готова к прогулке"
 * */
public class DogIsNotReadyException extends Exception {

    public DogIsNotReadyException(String message) {
        super(message);
    }
}