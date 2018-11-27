package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**.
* Тест класса Counter
* Класс считает числа в заданном диапазоне
* @version 1.0
* @since 27.11.2018.
* @author Martyniuk Evghenii
*/
	public class CounterTest {
	/**.
	* Тест метода add
	* Метод считает сумму четных чисел в заданном диапазоне
	*/
	@Test
	public void whenAddEvenFromOneToTenThenThirty() {
		Counter cnt = new Counter();
		int result = cnt.add(1, 10);
		int expected = 30;
		assertThat(result, is(expected));
	}
}