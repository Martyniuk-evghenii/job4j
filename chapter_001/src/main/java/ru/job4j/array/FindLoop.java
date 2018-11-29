package ru.job4j.array;

	/**
     * @author Martyniuk Evghenii
     * @version $Id$
     * @since 29.11.2018.
     */
public class FindLoop {
	/**
	  * Ищет индекс элемента, удовлетворяющий условию.
	  * @param el, условие посика.
	  * @return Индекс необходимого элемента.
	  */
	public int indexOf(int[] data, int el) {
		int result = -1;
		for (int index : data) {
			if (data[index] == el) {
				result = index;
				break;
			}
		}
		return result;
	}
}