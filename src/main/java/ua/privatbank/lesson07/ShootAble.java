package ua.privatbank.lesson07;

/**
 * Интерфейс описывающий способность персонажа стрелять.
 *
 * Created by DN030674FVV on 13.12.2018.
 */
@FunctionalInterface
public interface ShootAble {
    void shoot(String name);
}
