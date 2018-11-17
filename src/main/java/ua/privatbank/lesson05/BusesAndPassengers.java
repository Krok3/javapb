package ua.privatbank.lesson05;

/**
 * Смоделировддать жизненную ситуацию (с помощью методов и свойств объектов):
 *  1) Автобус трогается с первой остановки
 *  2) Автобус останавливается на 2-й остановке в него садятся Человек и Собака
 *  3) на 4-й остановке они выходят и входят 4 Человека
 *  4) 4 человека выходят на конечной остановке
 *
 * Все остановки должны иметь названия.
 * Объекты должны иметь только свои свойства и методы (без дублирования чужих).
 * Результат работы программы - в методе main последовательный вызов нужных методов и изменение свойств объектов -
 * для достижения результата задачи, и вывод соответствующей информации в консоль.
 * Объекты должны быть связаны между собой для определенного действия - собака не может сесть в автобус без человека.
 *
 * При описании классов их следует разместить по пакетам и добавить описание методов (javadoc).
 * Чем больше деталей - тем лучше.
 *
 * @author vfrundin
 * @version 1.0
 * @since 17.11.2018
 */
public class BusesAndPassengers {

    // Заполняем массив автобубусных остановок.
    private static void initBusStations(BusStation[] busStations) {
        busStations[0] = new BusStation("ул. Глинки");
        busStations[1] = new BusStation("ТРЦ Мост-Сити");
        busStations[2] = new BusStation("магазин Правобережный");
        busStations[3] = new BusStation("Парк Шевченко");
        busStations[4] = new BusStation("Водная станция");
        busStations[5] = new BusStation("Детский туристический центр");
        busStations[6] = new BusStation("Институт физкультуры");
        busStations[7] = new BusStation("Собес");
        busStations[8] = new BusStation("Воднолыжный стадион");
        busStations[9] = new BusStation("Студенческая");
    }

    // Заполняем массив пассажиров автобуса.
    private static void initPassengers(Human[] passengers, Dog dog, int routeLength) {
        passengers[0] = new Human("Jack", dog, 1, 3);
        passengers[1] = new Human("Arnold", 3, routeLength - 1);
        passengers[2] = new Human("Silvestr", 3, routeLength - 1);
        passengers[3] = new Human("Brus", 3, routeLength - 1);
        passengers[4] = new Human("Chuck", 3, routeLength - 1);
    }

    public static void main(String[] args) {

        // Создаем массив автобусных остановок.
        BusStation[] busStations = new BusStation[10];

        // Создаем массив пассажиров.
        Human[] passengers = new Human[5];

        // Инициализируем массив остановок.
        initBusStations(busStations);

        // Создаем экземпляр класса автобус.
        Bus bus = new Bus(120, 0);

        // Определяем длину автобусного маршрута.
        int routeLength = busStations.length;

        // Создаем экземпляр класса собака.
        Dog dog = new Dog("Bublik", true, true);

        // Инициализируем массив пассажиров.
        initPassengers(passengers, dog, routeLength);

        // Определяем кол-во пассажиров автобуса за время его поездки по маршруту.
        int cntPassengers = passengers.length;

        // Цикл поездки автобуса по маршруту.
        for (int i = 0; i < routeLength; i++) {
            bus.busStop();
            bus.openDoors();
            System.out.println("Остановка \"" + busStations[i].getStationName() + "\".");
            bus.setStationNumber(i);
            for (int j = 0; j < cntPassengers; j++) {
                if (passengers[j].getEnterStationNumber() == i) {
                    passengers[j].getOnTheBus();
                    bus.setCountOfPassengers(bus.getCountOfPassengers() + 1);
                    if (passengers[j].isSignPresenceDog()) {
                        bus.setCountOfPassengers(bus.getCountOfPassengers() + 1);
                    }
                }
                if (passengers[j].getExitStationNumber() == i) {
                    passengers[j].getOffTheBus();
                    bus.setCountOfPassengers(bus.getCountOfPassengers() - 1);
                    if (passengers[j].isSignPresenceDog()) {
                        bus.setCountOfPassengers(bus.getCountOfPassengers() - 1);
                    }
                }
            }

            bus.closeDoors();
            if (bus.getStationNumber() + 1 < routeLength) {
                bus.busGo();
            }
            else {
                System.out.println("Конечная остановка маршрута. Автобус уехал в ДЕПО!");
            }
        }
    }
}
