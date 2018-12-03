package ru.job4j.array;

/**
 * BubbleSort.
 * Класс для сортировки массива методом перестановки.
 *
 * @author Martyniuk Evghenii
 * @since 3.12.2018;
 */
public class BubbleSort {
    /**
     * Method sort.
     * Метод сортирует массив по возрастанию.
     *
     * @param array - массив.
     * @return отсортированный массив.
     */
    public int[] sort(int[] array) {
        for (int j = 1; j <= array.length; j++) {
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    int val = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = val;
                }
            }
        }
        return array;
    }
}