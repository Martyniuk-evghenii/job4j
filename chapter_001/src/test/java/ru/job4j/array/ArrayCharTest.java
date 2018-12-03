package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * ArrayCharTest.
 * Класс для автоматического тестирования методов класса ArrayChar.
 *
 * @author Martyniuk Evghenii
 * @version 1.1;
 * @since 3.12.2018.
 */
public class ArrayCharTest {
    /**
     * Проверяет когда слово начинается с префикса(Тестирование).
     */
    @Test
    public void whenStartWithPrefixThenTrue() {
        ArrayChar word = new ArrayChar("Hello");
        boolean result = word.startWith("He");
        assertThat(result, is(true));
    }
    /**
     * Проверяет когда слово не начинается с префикса(Тестирование).
     */
    @Test
    public void whenNotStartWithPrefixThenFalse() {
        ArrayChar word = new ArrayChar("Hello");
        boolean result = word.startWith("Hi");
        assertThat(result, is(false));
    }
}