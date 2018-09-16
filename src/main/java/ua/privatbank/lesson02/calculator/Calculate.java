package ua.privatbank.lesson02.calculator;

import java.util.Scanner;
import static java.lang.Double.POSITIVE_INFINITY;

/**
 * Created by DN030674FVV on 14.09.2018.
 */
public class Calculate {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        boolean isSign = false;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter 1st operand: ");
        double operand1 = in.nextDouble();

        System.out.print("Enter 2nd operand: ");
        double operand2 = in.nextDouble();
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
