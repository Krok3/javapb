package ua.privatbank.lesson08;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * Создать 2 собственных класса исключения.
 * Написать программу демонстрирующую обработку этих исключений (try/catch) с применением логирования
 * через java.util.logging на разных уровнях в консоль и/или файл.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        LogManager logManager = LogManager.getLogManager();
        // Считиваем конфигурацию логгера из файла.
        logManager.readConfiguration(new FileInputStream(
                Paths.get("src/main/java/ua/privatbank/lesson08/resources/logging.properties").toFile())
        );
        // Создаем экземпляр логгера.
        Logger logger = Logger.getLogger(Main.class.getName());
        // Создаем экземпляр класса Dog.
        Dog dog = new Dog("Бублик");

        try {
            dog.setFood(2, logger);
            dog.feed(logger);
            dog.setCollar(logger);
            dog.setMuzzle(logger);
            dog.walk(logger); //Unhandled exception: DogIsNotReadyException
        } catch (DogIsNotReadyException | DogIsHungryException e) {
            logger.log(Level.WARNING, "", e);
        } finally {
            try {
                dog.feed(logger);
                dog.feed(logger); //Unhandled exception: DogIsHungryException
            } catch (DogIsHungryException e) {
                //e.printStackTrace();
                logger.log(Level.WARNING, "", e);
            }
        }
    }
}
