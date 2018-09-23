package ua.privatbank.lesson02.calculator;

import java.util.Scanner;
import static java.lang.Double.POSITIVE_INFINITY;

/**
 * Напишите программу консольный калькулятор. Используя IntelliJ IDEA, создайте класс Calculator.
 * Создайте две переменные с именами operand1 и operand2. Задайте переменным некоторые произвольные значения или
 * предложите их ввести пользователю. Также предложите пользователю ввести знак арифметической операции и поместите
 * его в строковую переменную sign.
 * Для организации выбора алгоритма вычислительного процесса, используйте переключатель switch.
 * Выведите на экран результат выполнения арифметической операции.
 * В случае использования операции деления, организуйте проверку попытки деления на ноль. И если таковая имеется,
 * то отмените выполнение арифметической операции и уведимите об ошибка пользователя.
 *
 * @author vfrundin
 * @version 1.0
 * @since 19.09.2018
 */
public class Calculate {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner in = new Scanner(System.in);
        boolean isSign = false;

        double operand1 = EnterFromConsole.enterDoubleFromConsole("Enter 1st operand: ");
        double operand2 = EnterFromConsole.enterDoubleFromConsole("Enter 2nd operand: ");;

        String sign = null;

        while (!isSign) {
            System.out.print("Enter sign of math operation (+, -, *, /, ^): ");
            sign = in.next();

            switch (sign) {
                case "+":
                    calc.add(operand1, operand2);
                    isSign = true;
                    break;
                case "-":
                    calc.subtract(operand1, operand2);
                    isSign = true;
                    break;
                case "*":
                    calc.multiple(operand1, operand2);
                    isSign = true;
                    break;
                case "/":
                    calc.div(operand1, operand2);
                    isSign = true;
                    break;
                case "^":
                    calc.inPow(operand1, operand2);
                    isSign = true;
                    break;
                default:
                    break;
            }
        }

        if (calc.getResult() != POSITIVE_INFINITY) {
            System.out.printf("%.0f %s %.0f = %f", operand1, sign, operand2, calc.getResult());
        } else {
            System.out.println("You can not divide by zero!");
        }

    }
}
