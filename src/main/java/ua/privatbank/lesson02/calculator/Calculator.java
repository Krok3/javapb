package ua.privatbank.lesson02.calculator;

import static java.lang.Double.POSITIVE_INFINITY;

/**
 * Class Класс для вычисления результата арифметических операций +, -, *, :, ^.
 * @author vfrundin
 * @since 14.09.2018
 * @version 1
 */
public class Calculator {
    private double result;

    /**
     * Method add.
     * @param operand1 1st number.
     * @param operand2 2nd number.
     */
    public void add(double operand1, double operand2) {
        this.result = operand1 + operand2;
    }

    /**
     * Method subtract.
     * @param operand1 1st number.
     * @param operand2 2nd number.
     */
    public void subtract(double operand1, double operand2) {
        this.result = operand1 - operand2;
    }

    /**
     * Method multiple.
     * @param operand1 1st number.
     * @param operand2 2nd number.
     */
    public void multiple(double operand1, double operand2) { this.result = operand1 * operand2; }

    /**
     * Method div.
     * @param operand1 1st number.
     * @param operand2 2nd number.
     */
    public void div(double operand1, double operand2) {
        this.result = (operand2 == 0) ? POSITIVE_INFINITY: operand1 / operand2;
    }

    /**
     * Method inPow.
     * @param operand1 base.
     * @param operand2 pow.
     */
    public void inPow(double operand1, double operand2) {
        this.result = Math.pow(operand1, operand2);
    }

    /**
     * Method that returns the result.
     * @return Result of arithmetic operation.
     */
    public double getResult() {
        return this.result;
    }
}

