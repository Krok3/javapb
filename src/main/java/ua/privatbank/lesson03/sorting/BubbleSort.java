package ua.privatbank.lesson03.sorting;

/**
 * Class Класс выполняет сортировку пузырьком одномерного массива.
 *
 * @author vfrundin
 * @version 1.0
 * @since 21.09.2018
 */
public class BubbleSort {
    /**
     * Метод сортирует полученный на вход целочисленный массив методом пузырьковой сортировки.
     *
     * @param array Исходный целочисленный массив.
     * @return array - отсортированный целочисленный массив.
     */
    public int[] sort(int[] array) {
        int arrLength = array.length;
        int cnt;
        do {
            cnt = 0;
            for (int elementNumber = 0; elementNumber < arrLength - 1; elementNumber++) {
                if (array[elementNumber] > array[elementNumber + 1]) {
                    int tmp = array[elementNumber];
                    array[elementNumber] = array[elementNumber + 1];
                    array[elementNumber + 1] = tmp;
                    cnt++;
                }
            }
        } while (cnt > 0);
        return array;
    }
}
