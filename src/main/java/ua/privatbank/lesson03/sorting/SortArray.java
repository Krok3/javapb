package ua.privatbank.lesson03.sorting;

import ua.privatbank.lesson02.calculator.*;

/**
 * Написать программу сортировку массива методом пузырька. Используя IntelliJ IDEA, создайте класс BubbleSort.
 * Программа должна позволить пользователю ввести массив целых чисел размерностью 10 элементов. Далее произвести
 * сортировку этого массива от меньшего к большему по алгоритму сортировки пузырьком и вывести на экран отсортированный массив.
 * Описание алгоритма:
 * https://en.wikipedia.org/wiki/Bubble_sort
 *
 * @author vfrundin
 * @version 1.0
 * @since 21.09.2018
 */
public class SortArray {
    public static void main(String[] args) {

        // Создаем экземпляр класса BubbleSort.
        BubbleSort bubble = new BubbleSort();
        int[] array = new int[10];

        // Инициализируем массив.
        for (int i = 0; i < array.length; i++) {
            array[i] = EnterFromConsole.enterIntegerFromConsole("Enter " + (i + 1) + " element of the array: ");
        }

        // Выполняем сортировку массива.
        array = bubble.sort(array);

        // Формируем выходную строку.
        StringBuilder builder = new StringBuilder();
        builder.append("Result of sorting is:");
        builder.append(System.lineSeparator());
        for (int arr: array) {
            builder.append(arr);
            builder.append(" ");
        }

        // Выводим на экран отсортированный массив.
        System.out.println(builder.toString());
    }
}
