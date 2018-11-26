package ru.job4j.max;

/**
 * Class Max, задача "3.1. Максимум из двух (трех) чисел".
 * @author Martyniuk Evghenii
 * @since 26.11.2018
 * @version 1
 */
public class Max {
	/**
     * Максимум из двух целых чисел.
	 * Если числа равные, возвращает первое число.
     * @param first - первое сравниваемое.
     * @param second - второе сравниваемое.
	 * @return Наибольшее из двух чисел
     */
	public int max(int first, int second) {
		return (first >= second) ? first : second;
	}

	/**
	 * Максимум из трех целых чисел.
	 * @param first - первое сравниваемое.
	 * @param second - второе сравниваемое.
	 * @param third - третье сравниваемое.
	 * @return Наибольшее из трех чисел
	 */
	public int max(int first, int second, int third) {
		return max(max(first, second), third);
	}
}