package ru.job4j.array;

/**
 * ArrayChar.
 * Класс для заполнения двухмерного массива произведениями индексов массива.
 *
 * @author Martyniuk Evghenii
 * @since 3.12.2018.
 */
public class ArrayChar {
    /**
     * Поле класса - массив символов проверяемого слова.
     */
    private char[] data;

    /**
     * Конструктор класса ArrayChar.
     */
    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }

    /**
     * Method startWith.
     * Проверяет, начинается ли слово с префикса(сравнивает массивы символов).
     *
     * @param prefix префикс.
     * @return true, если слово начинаеться с префикса и false, если нет.
     */
    public boolean startWith(String prefix) {
        boolean result = true;
        char[] value = prefix.toCharArray();
        for (int i = 0; i < value.length; i++) {
            if (data[i] != value[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}