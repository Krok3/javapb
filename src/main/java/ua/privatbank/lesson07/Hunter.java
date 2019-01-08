package ua.privatbank.lesson07;

/**
 * Класс наследуется от класса Person, описывает поведение охотника.
 *
 * Created by vfrundin on 03.01.2019.
 */
public class Hunter extends Person implements ShootAble {

    public Hunter(String name, int health) {
        super(name, health);
    }

    @Override
    public void walk() {
        System.out.println("Охотник " + super.getName() + " подкрадывается к добыче.");
    }

    public void giveChase(RunAble runAble) {
        runAble.run();
    }

    public void doShoot(ShootAble shootAble) {
        shootAble.shoot(getName());
    }

    @Override
    public void shoot(String name) {
        System.out.println("Охотник " + name + " стреляет в кролика.");
    }
}

