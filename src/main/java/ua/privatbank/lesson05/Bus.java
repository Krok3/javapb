package ua.privatbank.lesson05;

/**
 * Класс описывает работу рейсового автобуса.
 *
 * @author vfrundin
 * @version 1.0
 * @since 17.11.2018
 */
public class Bus {
    /** @param busNumber - номер маршрута автобуса. */
    private int busNumber;
    /** @param stationNumber - номер остановки на которой находится автобус. */
    private int stationNumber;
    /** @param countOfPassengers - кол-во пассажиров находящихся в автобусе. */
    private int countOfPassengers;

    /**
     * Конструктор класса.
     * @param busNumber
     * @param stationNumber
     */
    public Bus(int busNumber, int stationNumber) {
        this.busNumber = busNumber;
        this.stationNumber = stationNumber;
        this.countOfPassengers = 0;
    }

    public int getBusNumber() {
        return busNumber;
    }

    public int getStationNumber() {
        return stationNumber;
    }

    public void setStationNumber(int stationNumber) {
        this.stationNumber = stationNumber;
    }

    public int getCountOfPassengers() {
        return countOfPassengers;
    }

    public void setCountOfPassengers(int countOfPassengers) {
        this.countOfPassengers = countOfPassengers;
    }
    /**
     * Метод эмулирует движение автобуса между остановками.
     */
    public void busGo() {
        System.out.println("Автобус поехал.");
    }
    /**
     * Метод эмулирует остановки автобуса на маршруте.
     */
    public void busStop() {
        System.out.println("Автобус остановился.");
    }
    /**
     * Метод эмулирует открытие дверей автобуса.
     */
    public void openDoors() {
        System.out.println("Двери открыты.");
    }
    /**
     * Метод эмулирует закрытие дверей автобуса.
     */
    public void closeDoors() {
        System.out.println("Двери закрыты.");
    }

}
