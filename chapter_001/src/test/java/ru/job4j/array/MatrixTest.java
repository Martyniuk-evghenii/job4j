package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * MatrixTest.
 * Класс для автоматического тестирования методов класса Matrix.
 *
 * @author Martyniuk Evghenii
 * @version 1.1;
 * @since 3.12.2018;
 */
    public class MatrixTest {
    /**
     * Проверяет матрицу таблицы умножения(Тестирование).
     */
    @Test
    public void when2on2() {
        Matrix matrix = new Matrix();
        int[][] table = matrix.multiple(2);
        int[][] expect = {
                {1, 2},
                {2, 4}
        };
        assertThat(table, is(expect));
    }
}