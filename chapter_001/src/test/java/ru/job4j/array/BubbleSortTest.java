package ru.job4j.array;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.junit.Assert.assertThat;

/**
 * BubbleSortTest.
 * Класс для автоматического тестирования методов класса BubbleSort.
 *
 * @author Martyniuk Evghenii
 * @version 1.1;
 * @since 3.12.2018;
 */
public class BubbleSortTest {
    /**
     * Проверяет сортированный по возрастанию массив(Тестирование).
     */
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        //напишите здесь тест, проверяющий сортировку массива из 10 элементов методом пузырька, например {1, 5, 4, 2, 3, 1, 7, 8, 0, 5}.
        BubbleSort bubbleSort = new BubbleSort();
        int[] input = new int[]{1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
        int[] result = bubbleSort.sort(input);
        int[] expect = new int[]{0, 1, 1, 2, 3, 4, 5, 5, 7, 8,};
        assertThat(result, Matchers.is(expect));
    }
}