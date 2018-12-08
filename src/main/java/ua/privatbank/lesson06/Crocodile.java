package ua.privatbank.lesson06;

import java.util.Objects;

/**
 * Класс эмулирует действия крокодила.
 *
 * Created by vfrundin on 07.12.2018.
 */
public class Crocodile extends Animal {

    private boolean scales;

    /**
     * Конструктор класса
     */
    public Crocodile(String name, String food, float height, float weight, int numberOfLegs) {
        super(name, food, height, weight, numberOfLegs);
        this.scales = true;
    }

    @Override
    public void move() {
        System.out.println(getName() + " плывет.");
    }

    /**
     * Метод эмулирует процесс охоты.
     */
    public void hunt() {
        System.out.println(getName() + " охотится.");
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Crocodile{" +
                super.toString() +
                ", " +
                "scales=" + scales +
                '}');
        return builder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Crocodile crocodile = (Crocodile) o;
        return scales == crocodile.scales;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), scales);
    }
}
