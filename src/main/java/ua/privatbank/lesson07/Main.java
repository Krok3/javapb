package ua.privatbank.lesson07;

/**
 * Создать интерфейсы, описывающие возможности игровых персонажей (бег, прыжки, стрельба, плавание).
 * Создать абстрактный базовый класс персонажа для игры и два унаследованных класса персонажа,
 * которые используют интерфейсы для определения своих возможностей.
 * Продемонстрировать работу унаследованных классов.
 * По желанию: в демонстрации использовать lambda-выражения.
 *
 * Created by vfrundin on 03.01.2019.
 */
public class Main {
    public static void main(String[] args) {
        Hunter hunter = new Hunter("John", 100);
        Animal animal = new Animal("Bags Bunny", 100);

        animal.walk();
        hunter.walk();

        hunter.shoot(hunter.getName());

        animal.swimming(() -> {
            System.out.println(animal.getName() + " от неожиданности падает в воду.");
            System.out.println(animal.getName() + " быстро плывет к противоположному берегу озера.");
        });

        hunter.doShoot((shootAble) ->
                System.out.println("Охотник " + hunter.getName() + " стреляет снова.")
        );

        animal.jumping(() -> {
            System.out.println(animal.getName() + " выбирается на берег.");
            System.out.println(animal.getName() + " прыжками несется к лесу.");
        });

        hunter.giveChase(() -> {
            System.out.println("Охотник " + hunter.getName() + " гонится за " + animal.getName() + " и пытается прицелиться на бегу.");
            System.out.println("Охотник " + hunter.getName() + " спотыкается о корень дерева, падает и набивает себе на лбу огромную шишку.");
            hunter.setHealth(hunter.getHealth() / 2);
        });

        animal.jumping(() ->
                System.out.println(animal.getName() + " благополучно скрывается за деревьями.")
        );

    }
}

