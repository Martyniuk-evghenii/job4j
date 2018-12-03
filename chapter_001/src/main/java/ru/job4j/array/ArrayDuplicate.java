package ru.job4j.array;

import java.util.Arrays;

/**
 * ArrayDuplicate.
 * Класс для удаления дубликатов значений из массива.
 *
 * @author Martyniuk Evghenii
 * @since 3.12.2018;
 */
public class ArrayDuplicate {
    /**
     * Method remove.
     * Проверяет повторения в массиве и удаляет дубликаты.
     *
     * @param array массив.
     * @return массив без дубликатов.
     */
    public String[] remove(String[] array) {
        int dup = array.length;
        for (int i = 0; i != dup; i++) {
            for (int j = i + 1; j != dup; j++) {
                if (array[i].equals(array[j])) {
                    array[j] = array[dup - 1];
                    dup--;
                    j--;
                }
            }
        }
        return Arrays.copyOf(array, dup);
    }
}