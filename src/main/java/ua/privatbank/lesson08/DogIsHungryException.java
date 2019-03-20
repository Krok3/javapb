package ua.privatbank.lesson08;
/**
 * Класс проверяемого исключения "Собака голодна"
 * */
public class DogIsHungryException extends Exception {
    public DogIsHungryException(String message) {
        super(message);
    }
}
