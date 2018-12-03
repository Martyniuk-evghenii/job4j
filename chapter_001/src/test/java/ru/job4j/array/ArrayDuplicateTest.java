package ru.job4j.array;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * ArrayDuplicateTest.
 * Класс для автоматического тестирования методов класса ArrayDuplicate.
 *
 * @author Martyniuk Evghenii
 * @version 1.1;
 * @since 3.12.2018;
 */
public class ArrayDuplicateTest {
    /**
     * Сравнивает массивы без дубликатов значений массива, Вар.1(Тестирование).
     */
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        //напишите здесь тест, проверяющий удаление дубликатов строк из массива строк.
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] inputArray = new String[]{"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] resultArray = arrayDuplicate.remove(inputArray);
        String[] expectArray = new String[]{"Привет", "Мир", "Супер"};
        assertThat(resultArray, is(expectArray));
    }

    /**
     * Сравнивает массивы без дубликатов значений массива, Вар.2(Тестирование).
     */
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate2() {
        //напишите здесь тест, проверяющий удаление дубликатов строк из массива строк.
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] inputArray = new String[]{"Один", "Один", "Три", "Два", "Четыре"};
        String[] resultArray = arrayDuplicate.remove(inputArray);
        String[] expectArray = new String[]{"Один", "Четыре", "Три", "Два"};
        assertThat(resultArray, is(expectArray));
    }

    /**
     * Сравнивает массивы без дубликатов значений массива, Вар.3(Тестирование).
     */
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate3() {
        //напишите здесь тест, проверяющий удаление дубликатов строк из массива строк.
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] inputArray = new String[]{"Один", "Один", "Один", "Один", "Один"};
        String[] resultArray = arrayDuplicate.remove(inputArray);
        String[] expectArray = new String[]{"Один"};
        assertThat(resultArray, is(expectArray));
    }

    /**
     * Сравнивает массивы без дубликатов значений массива, Вар.4(Тестирование).
     */
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate4() {
        //напишите здесь тест, проверяющий удаление дубликатов строк из массива строк.
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] inputArray = new String[]{"Один", "Один", "Один", "Один", "Два"};
        String[] resultArray = arrayDuplicate.remove(inputArray);
        String[] expectArray = new String[]{"Один", "Два"};
        assertThat(resultArray, is(expectArray));
    }
}