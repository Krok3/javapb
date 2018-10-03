package ua.privatbank.lesson03.bingo;

import ua.privatbank.lesson02.calculator.EnterFromConsole;

import java.util.Random;

/**
 * Created by DN030674FVV on 20.09.2018.
 * Написать программу игру “Bingo”. Используя IntelliJ IDEA, создайте класс Bingo.
 * Программа должна загадать целое число в диапазоне от 0 до 100 и предложить пользователю его отгадать.
 * При вводе числа пользователем, программа проверяет на соответствие с загаданным число и если числа совпали вывести
 * сообщение о том что число отгадано. Если числа не совпали, тогда следует вывести надпись о том, что задуманное число
 * является больше или меньше вводимого. Также программа ведет подсчет попыток, и выводит это количество после того как
 * число угадали. Предусмотреть возможность досрочного завершения программы, в случае если пользователь не желает
 * продолжать угадывать число.
 */
public class Bingo {
    public static void main(String[] args) {
        // Создаем экземпляр класса Random.
        Random random = new Random();
        // Устанавливаем счетчик.
        int counter = 1;
        // Загадываем число.
        int unknownNumber = random.nextInt(100);
        // System.out.println("Подсказка: " + unknownNumber);
        // Формируем выходную строку.
        StringBuilder builder = new StringBuilder();
        builder.append("Guess the number in the range from 0 to 100. Attempt number ");
        int len = builder.length();
        while (true) {
            builder.append(counter);
            builder.append(": ");
            // Запрашиваем у пользователя его вариант загаданного числа.
            int usersNumber = EnterFromConsole.enterIntegerFromConsole(builder.toString());
            // Проверяем число введенное пользователем на соответствие загаданному числу.
            if (usersNumber < 0 || usersNumber > 100) {
                System.out.print("Your number is not in the range from 0 to 100. Try again, please!");
            } else if (unknownNumber > usersNumber) {
                System.out.printf("%s %d%s", "The guessed number is greater than", usersNumber, ". Try again, please!");
            } else if (unknownNumber < usersNumber) {
                System.out.printf("%s %d%s", "The guessed number is less than", usersNumber, ". Try again, please!");
            } else {
                System.out.printf("%s %d%s %d %s", "Yes, unknown number is", unknownNumber, "! You guessed from", counter, "attempt.");
                break;
            }
            System.out.println();
            builder.delete(len, builder.length());
            counter++;
        }
    }
}
