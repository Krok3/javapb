package ua.privatbank.lesson06;

import java.util.Objects;

/**
 * Класс эмулирует действия общие для всех животных.
 *
 * Created by vfrundin on 07.12.2018.
 */
public class Animal {

    private String name;
    private String food;
    private float height;
    private float weight;
    private int numberOfLegs = 4;

    /**
     * Конструктор класса
     */
    public Animal(String name, String food, float height, float weight, int numberOfLegs) {
        this.name = name;
        this.food = food;
        this.height = height;
        this.weight = weight;
        this.numberOfLegs = numberOfLegs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    /**
     * Метод эмулирует процесс питания животного.
     */
    public void eat() {
        System.out.println(getName() + " ест " + getFood() + ".");
    }

    /**
     * Метод эмулирует процесс передвижения животного.
     */
    public void move() {
        System.out.println(getName() + " идет.");
    }

    /**
     * Метод эмулирует процесс сна животного.
     */
    public void sleep() {
        System.out.println(getName() + " спит ночью.");
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("name='" + name + '\'' +
                ", food='" + food + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", numberOfLegs=" + numberOfLegs);
        return  builder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Float.compare(animal.height, height) == 0 &&
                Float.compare(animal.weight, weight) == 0 &&
                numberOfLegs == animal.numberOfLegs &&
                Objects.equals(name, animal.name) &&
                Objects.equals(food, animal.food);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, food, height, weight, numberOfLegs);
    }
}
