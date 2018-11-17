package ua.privatbank.lesson05;

/**
 * Класс эмулирует поведение человека.
 *
 * @author vfrundin
 * @version 1.0
 * @since 17.11.2018
 */
public class Human {
    /** @param dog - имя человека. */
    private String name;
    /** @param dog - собака. */
    private Dog dog;
    /** @param signPresenceDog - признак присутствия собаки с человеком. */
    private boolean signPresenceDog;
    /** @param enterStationNumber - номер остановки на которой человек садится на автобус. */
    private int enterStationNumber;
    /** @param exitStationNumber - номер остановки на которой человек выходит из автобуса. */
    private int exitStationNumber;

    /**
     * Конструктор класса для человека с собакой.
     *
     * @param name
     * @param dog
     * @param enterStationNumber
     * @param exitStationNumber
     */
    public Human(String name, Dog dog, int enterStationNumber, int exitStationNumber) {
        this.name = name;
        this.signPresenceDog = true;
        this.dog = dog;
        this.enterStationNumber = enterStationNumber;
        this.exitStationNumber = exitStationNumber;
    }

    /**
     * Конструктор класса для человека без собаки.
     *
     * @param name
     * @param enterStationNumber
     * @param exitStationNumber
     */
    public Human(String name, int enterStationNumber, int exitStationNumber) {
        this.name = name;
        this.signPresenceDog = false;
        this.enterStationNumber = enterStationNumber;
        this.exitStationNumber = exitStationNumber;
    }

    public boolean isSignPresenceDog() {
        return signPresenceDog;
    }

    public String getName() {
        return name;
    }

    public int getEnterStationNumber() {
        return enterStationNumber;
    }

    public int getExitStationNumber() {
        return exitStationNumber;
    }

    /**
     * Метод описывает посадку пассажира в автобус.
     */
    public void getOnTheBus() {
        System.out.println("Пассажир " + name + " зашел в автобус.");
        if (signPresenceDog) {
            dogGetOnTheBus();
        }
    }
    /**
     * Метод описывает посадку собаки в автобус.
     */
    private void dogGetOnTheBus() {
        System.out.println("Собака " + dog.getDogsName() + " зашла в автобус.");
    }
    /**
     * Метод описывает выход пассажира из автобуса.
     */
    public void getOffTheBus() {
        System.out.println("Пассажир " + name + " вышел из автобуса.");
        if (signPresenceDog) {
            dogGetOffTheBus();
        }
    }
    /**
     * Метод описывает выход собаки из автобус.
     */
    private void dogGetOffTheBus() {
        System.out.println("Собака " + dog.getDogsName() + " вышла из автобуса.");
        dog.waterTree();
    }
}
