package ru.job4j.array;

/**
 * Check
 *
 * @author - Martyniuk Evghenii
 *
 */
public class Check {
    /**
     * проверка массива на одинаковость значений
     * @return boolean - true - все значения одинаковы, false - не все одинаковы
     */
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length - 1; i++) {
			if (data[i] != data[i + 1]) {
				result = false;
				break;
			}
        }
        return result;
    }
}