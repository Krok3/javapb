package ua.privatbank.lesson05;

/**
 * Класс описывает автобусную остановку.
 *
 * @author vfrundin
 * @version 1.0
 * @since 17.11.2018
 */
public class BusStation {
    /** @param stationName - название остановки. */
    private String stationName;

    /**
     * Конструктор класса.
     * @param stationName
     */
    public BusStation(String stationName) {
        this.stationName = stationName;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }
}
