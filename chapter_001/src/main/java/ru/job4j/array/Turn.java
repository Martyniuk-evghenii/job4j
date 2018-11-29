package ru.job4j.array;

/**
* Класс переворачивает массив.
* @since 29.11.2018.
* @version 1
*/
public class Turn {

	/**
	* Метод переворачивает массив.
	* @param array исходный массив
	* @return возврашает перевернутый массив
	**/
	public int[] back(int[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			int k = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = k;
		}
		return array;
	}
}