package ua.privatbank.lesson06;

import java.util.Objects;

/**
 * Класс эмулирует действия коровы.
 *
 * Created by vfrundin on 07.12.2018.
 */
public class Cow extends Animal {

    private boolean horns;
    private boolean milk;

    public boolean isMilk() {
        return milk;
    }
    public boolean isHorns() {
        return horns;
    }

    /**
     * Конструктор класса
     */
    public Cow(String name, String food, float height, float weight, int numberOfLegs, boolean horns, boolean milk) {
        super(name, food, height, weight, numberOfLegs);
        this.horns = horns;
        this.milk = milk;
    }

    /**
     * Метод эмулирует доения коровы.
     */
    public void giveMilk() {
        System.out.println(getName() + " дает молоко.");
    }

    /**
     * Метод показывает как корова бодается.
     */
    public void beatHorns() {
        System.out.println(getName() + " бодается.");
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Cow{" +
                super.toString() +
                ", " +
                "horns=" + horns +
                ", milk=" + milk +
                '}') ;
        return builder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cow cow = (Cow) o;
        return horns == cow.horns &&
                milk == cow.milk;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), horns, milk);
    }
}
