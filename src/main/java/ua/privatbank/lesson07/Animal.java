package ua.privatbank.lesson07;

/**
 * Класс наследуется от класса Person, описывает поведение животного.
 *
 * Created by vfrundin on 03.01.2019.
 */
public class Animal extends Person {

    public Animal(String name, int health) {
        super(name, health);
    }

    @Override
    public void walk() {
        System.out.println("Кролик " + super.getName() + " мирно грызет морковку на берегу озера.");
    }

    public void jumping(JumpAble jumpAble) {
        jumpAble.jump();
    }

    public void swimming(SwimAble swimAble) {
        swimAble.swim();
    }

}

