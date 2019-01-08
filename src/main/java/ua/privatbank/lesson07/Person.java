package ua.privatbank.lesson07;

/**
 * Абстрактный класс описывающий персонажи.
 *
 * Created by vfrundin on 03.01.2019.
 */
public abstract class Person {
    private String name;
    private int health;


    public Person(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

        public void setHealth(int health) {
        this.health = health;
    }

    public abstract void walk();
}
