package ua.privatbank.lesson02.calculator;

import java.util.Scanner;

/**
 * Class Класс запрашивает у пользователя ввод информации с консоли и выполняет первичную проверку нвведенной информации
 * на соответствие требуемому типу.
 *
 * @author vfrundin
 * @version 1.0
 * @since 19.09.2018
 */
public class EnterFromConsole {
    /**
     * Метод запрашивает у пользователя ввод целого числа.
     * @param question - фраза приглашающая пользователя ввести с консоли число.
     * @return operand - целое число введенное пользователем.
     */
    public static int enterIntegerFromConsole(String question) {
        int operand = 0;
        Scanner in = new Scanner(System.in);
        System.out.print(question);
        while (in.hasNext()) {
            if (in.hasNextInt()) {
                operand = in.nextInt();
                break;
            } else {
                System.out.println("You must enter a number. Please, try again!");
                in.next();
            }
        }
        return operand;
    }

    public static double enterDoubleFromConsole(String question) {
        double operand = 0;
        Scanner in = new Scanner(System.in);
        System.out.print(question);
        while (in.hasNext()) {
            if (in.hasNextDouble()) {
                operand = in.nextDouble();
                break;
            } else {
                System.out.println("You must enter a number. Please, try again!");
                in.next();
            }
        }
        return operand;
    }
}
