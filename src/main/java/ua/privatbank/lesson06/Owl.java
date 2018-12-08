package ua.privatbank.lesson06;

import java.util.Objects;

/**
 * Класс эмулирует действия совы.
 *
 * Created by vfrundin on 07.12.2018.
 */
public class Owl extends Animal {

    private boolean wings;

    /**
     * Конструктор класса
     */
    public Owl(String name, String food, float height, float weight, int numberOfLegs) {
        super(name, food, height, weight, numberOfLegs);
        wings = true;
    }

    @Override
    public void move() {
        System.out.println(getName() + " летает.");
    }

    /**
     * Метод эмулирует процесс охоты.
     */
    public void hunt() {
        System.out.println(getName() + " охотится.");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " спит днём.");
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Owl{" +
                super.toString() +
                ", " +
                "wings=" + wings +
                '}') ;
        return builder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Owl owl = (Owl) o;
        return wings == owl.wings;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), wings);
    }
}
