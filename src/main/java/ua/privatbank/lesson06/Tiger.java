package ua.privatbank.lesson06;

import java.util.Objects;

/**
 * Класс эмулирует действия тигра.
 *
 * Created by vfrundin on 07.12.2018.
 */
public class Tiger extends Animal {

    private boolean mustache;

    /**
     * Конструктор класса
     */
    public Tiger(String name, String food, int height, int weight, int numberOfLegs) {
        super(name, food, height, weight, numberOfLegs);
        this.mustache = true;
    }

    @Override
    public void move() {
        System.out.println(getName() + " бежит.");
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
        builder.append("Tiger{" +
                super.toString() +
                ", " +
                "mustache=" + mustache +
                '}');
        return builder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Tiger tiger = (Tiger) o;
        return mustache == tiger.mustache;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mustache);
    }
}
