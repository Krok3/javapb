package ua.privatbank.lesson08;

import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * Класс имитирует поведение домашнего любимца :).
*/
public class Dog {

    String name;
    private boolean isCollarPutOn;
    private boolean isLeashPutOn;
    private boolean isMuzzlePutOn;
    private int food;

    public Dog(String name) {
        this.name = name;
    }

    public void setCollar(Logger logger) {
        logger.log(Level.FINE, "Ошейник надет!");
        this.isCollarPutOn = true;
    }

    public boolean getCollar() {
        return isCollarPutOn;
    }

    public void setLeash(Logger logger) {
        logger.log(Level.FINE, "Поводок надет!");
        this.isLeashPutOn = true;
    }

    public boolean getLeash() {
        return isLeashPutOn;
    }

    public void setMuzzle(Logger logger) {
        logger.log(Level.FINE, "Намордник надет!");
        this.isMuzzlePutOn = true;
    }

    public boolean getMuzzle() {
        return isMuzzlePutOn;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food, Logger logger) {
        logger.log(Level.FINE, "Куплено " + food + " пакетов корма.");
        this.food = food;
    }

    /**
     * Метод эмулирует прогулку собаки.
     * @param logger - экземпяр логгера.
     * @throws DogIsNotReadyException - пробрасываем исключение вверх.
     */
    public void walk(Logger logger) throws DogIsNotReadyException {

        logger.log(Level.FINE, "Собираемся на прогулку!");
        if (isCollarPutOn && isLeashPutOn && isMuzzlePutOn) {
            logger.log(Level.FINE, "Ура, идем гулять! " + name + " очень рад!");
        } else {
            throw new DogIsNotReadyException("\r\nСобака " + name + " не готова к прогулке! " +
                    "\r\nПроверьте снаряжение: " +
                    "\r\n Ошейник надет? " + isCollarPutOn +
                    "\r\n Поводок надет? " + isLeashPutOn  +
                    "\r\n Намордник надет? " + isMuzzlePutOn);
        }
    }

    /**
     * Метод эмулирует трапезу собачки.
     * @param logger - экземпяр логгера.
     * @throws DogIsHungryException - пробрасываем исключение вверх.
     */
    public void feed(Logger logger) throws DogIsHungryException {
        logger.log(Level.FINE, name + " хочет есть!");
        if (food > 0) {
            logger.log(Level.FINE,name + " усердно тарахтит миской!");
            logger.log(Level.FINE,name + " сыт и доволен жизнью! :)");
            food--;
        } else {
            throw new DogIsHungryException("\r\nУ Вас осталось " + food + " пакетов корма.\r\n " + name + " все так же голоден. " +
                    "\r\n Нужно сходить в магазин!");
        }
    }




}