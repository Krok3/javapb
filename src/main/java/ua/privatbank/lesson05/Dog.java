package ua.privatbank.lesson05;

/**
 * Класс эмулирует поведение собаки.
 *
 * @author vfrundin
 * @version 1.0
 * @since 17.11.2018
 */
public class Dog {
    /** @param dogsName - кличка собаки. */
    private String dogsName;
    /** @param leash - признак наличия ошейника. */
    private boolean leash;
    /** @param muzzle - признак наличия намордника. */
    private boolean muzzle;

    /**
     * Конструктор класса.
     *
     * @param dogsName
     * @param leash
     * @param muzzle
     */
    public Dog(String dogsName, boolean leash, boolean muzzle) {
        this.dogsName = dogsName;
        this.leash = leash;
        this.muzzle = muzzle;
    }

    public String getDogsName() {
        return dogsName;
    }

    /**
     * Метод собаки описывать деревья. :)
     */
    public void waterTree() {
        System.out.println("Собака пописяла под дерево.");
    }
}
