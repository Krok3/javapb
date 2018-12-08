package ua.privatbank.lesson06;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Выбрать предметную область, например: геометрические фигуры, автомобили, животные и т.д.
 * Создать иерархию классов для выбранной предметной области с использованием наследования,
 * 3 - 4 класса достаточно. Определить для каждого класса свой уникальный конструктор, методы и поля.
 * В классах переопределить методы toString, equals, hashCode.
 * Создать класс Main в котором продемонстрировать работу классов из предметной области, создать несколько объектов
 * с помощью оператора new, создать один объект с использованием механизма рефлексии.
 * Поместить созданные объекты в массив и выполнить над ними действия демонстрирующие работу полиморфизма.
 *
 * Created by vfrundin on 07.12.2018.
 */
public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException, InstantiationException {

        System.out.println("--------- Create new objects, demonstrate toString() & hashCode() methods ----------");
        // Создаем экземпляры классов потомков класса Animal.
        Cow milkCow = new Cow("Дойная корова", "сено", 1.65f, 350f, 4, false, true);
        Crocodile croc = new Crocodile("Нильский крокодил", "мясо", 8, 1200f, 4);
        Owl owl = new Owl("Полярная сова", "мясо", 0.5f, 3, 2);
        Tiger tiger = new Tiger("Бенгальский тигр", "мясо", 3, 180, 4);
        Tiger twinTiger = new Tiger("Бенгальский тигр", "мясо", 3, 180, 4);
        Tiger anotherTiger = new Tiger("Амурский тигр", "мясо", 3, 180, 4);
        Cow twinMilkCow = new Cow("Дойная корова", "сено", 1.65f, 350f, 4, false, true);
        Cow anotherMilkCow = new Cow("Дойная корова", "сено", 1.65f, 350f, 4, true, true);
        Cow bull = new Cow("Бычек", "сено", 1.85f, 500f, 4, true, false);
        // Проверяем работу переопределенных методов toString() и hashCode() на примере созданных объектов.
        System.out.println("Это корова milkCow: \r\n" + milkCow.toString());
        System.out.println("Это hash- код коровы milkCow: " + milkCow.hashCode());
        System.out.println("Это корова twinMilkCow: \r\n" + twinMilkCow.toString());
        System.out.println("Это hash- код коровы twinMilkCow: " + twinMilkCow.hashCode());
        System.out.println("Это корова anotherMilkCow: \r\n" + anotherMilkCow.toString());
        System.out.println("Это hash- код коровы anotherMilkCow: " + anotherMilkCow.hashCode());
        System.out.println("Это бык bull: \r\n" + bull.toString());
        System.out.println("Это hash- код быка bull: " + bull.hashCode());
        System.out.println("Это крокодил: \r\n" + croc.toString());
        System.out.println("Это hash- код крокодила: " + croc.hashCode());
        System.out.println("Это сова: \r\n" + owl.toString());
        System.out.println("Это hash- код совы: " + owl.hashCode());
        System.out.println("Это тигр tiger: \r\n" + tiger.toString());
        System.out.println("Это hash- код тигра tiger: " + tiger.hashCode());
        System.out.println("Это тигр twinTiger: \r\n" + twinTiger.toString());
        System.out.println("Это hash- код тигра twinTiger: " + twinTiger.hashCode());
        System.out.println("Это тигр anotherTiger: \r\n" + anotherTiger.toString());
        System.out.println("Это hash- код тигра anotherTiger: " + anotherTiger.hashCode());

        System.out.println("--------------------------- Demonstrate method equals() ----------------------------");
        // Демонстрируем работу переопределенных методов equals().
        System.out.println("twinMilkCow равна milkCow = " + twinMilkCow.equals(milkCow));
        System.out.println("bull равен milkCow = " + bull.equals(milkCow));
        System.out.println("anotherMilkCow равна milkCow = " + anotherMilkCow.equals(milkCow));
        System.out.println("twinTiger равен tiger = " + twinTiger.equals(tiger));
        System.out.println("anotherTiger равен tiger = " + anotherTiger.equals(tiger));

        System.out.println("--------------------------------- Use Reflection -----------------------------------");
        // Рефлексия
        Class tmpClass = croc.getClass();
        System.out.println("Class:");
        System.out.println(tmpClass);
        System.out.println("Class name:");
        System.out.println(tmpClass.getName());
        System.out.println("Fields:");
        System.out.println(Arrays.toString(tmpClass.getDeclaredFields()));
        System.out.println("Methods:");
        Method[] methods = tmpClass.getDeclaredMethods();
        for (Method method: methods) {
            System.out.println(method);
        }
        System.out.println("Create new object with reflection:");
        Class classCrocodile = Class.forName(tmpClass.getName());
        Constructor constructorCrocodile = classCrocodile.getDeclaredConstructor(new Class[] {String.class, String.class, float.class, float.class, int.class});
        Object allig = constructorCrocodile.newInstance(new Object[] {"Алигатор", "мясо", 4, 230f, 4});
        System.out.println(allig.toString());
        System.out.println("Invoke method hunt:");
        invokeMethodHunt(allig);

        System.out.println("------------ Create array of animals and put our objects to this array -------------");
        Crocodile anotherCrocodile = null;
        if (allig instanceof Crocodile) {
            anotherCrocodile = (Crocodile) allig;
        }
        Animal[] animals = {milkCow, twinMilkCow, anotherMilkCow, bull, croc, anotherCrocodile, owl, tiger, twinTiger, anotherTiger};
        int i = 1;

        for (Animal varAnimals: animals) {
            System.out.println("Животное №" + i++ + " класса " + ((varAnimals.getClass()).getSimpleName()) + ":");
            //System.out.println(builder.toString());
            varAnimals.eat();
            varAnimals.sleep();
            varAnimals.move();
            System.out.println("------------------------------------------------------------------------------------");
        }

    }

    /**
     * Метод позволяет вызывать метод hunt() через рефлексию.
     * @param o - экземпляр класса типа Anumal.
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    public static void invokeMethodHunt(Object o) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class tmpClass = o.getClass();
        Method methodMove = tmpClass.getDeclaredMethod("hunt", new Class[] {});
        methodMove.invoke(o, new Object[] {});
    }

}
