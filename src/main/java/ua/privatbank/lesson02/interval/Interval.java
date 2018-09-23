package ua.privatbank.lesson02.interval;

import java.util.Scanner;
import ua.privatbank.lesson02.calculator.*;

/**
 * Использую IntelliJ IDEA, создайте класс Interval.
 * Напишите программу определения, попадает ли указанное пользователем число от 0 до 100
 * в числовой промежуток [0 -14] [15 - 35] [36 - 50] [51 - 100].
 * Если да, то укажите в какой именно промежуток.
 * Если пользователь указывает число, не входящее ни в один из имеющихся числовых промежутков,
 * то выводится соответствующее сообщение.
 *
 * @author vfrundin
 * @version 1.0
 * @since 20.09.2018
 */
public class Interval {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int operand = -1;
        String interval = null;

        operand = EnterFromConsole.enterIntegerFromConsole("Enter a number in the range from 0 to 100, please: ");

        if (operand >= 0 && operand <= 100) {
            if (operand >= 0 && operand <= 14) {
                interval = "The selected number is in the range from 0 to 14.";
            }
            if (operand >= 15 && operand <= 35) {
                interval = "The selected number is in the range from 15 to 35.";
            }
            if (operand >= 36 && operand <= 50) {
                interval = "The selected number is in the range from 36 to 50.";
            }
            if (operand >= 51 && operand <= 100) {
                interval = "The selected number is in the range from 51 to 100.";
            }
        } else {
            interval = "The selected number is not in the range from 0 to 100.";
        }

        System.out.println(interval);
    }
}
