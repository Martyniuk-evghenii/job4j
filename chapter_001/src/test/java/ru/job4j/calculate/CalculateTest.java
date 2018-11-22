package ru.job4j.calculate;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculateTest {
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculate calc = new Calculate();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenSubtractOneSubtractOneThenZero() {
        Calculate calc = new Calculate();
        calc.subtract(1D, 1D);
        double result = calc.getResult();
        double expected = 0D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenDiv2On2Then4() {
        Calculate calc = new Calculate();
        calc.div(2D, 2D);
        double result = calc.getResult();
        double expected = 4D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenMultipleOneMultipleOneThenOne() {
        Calculate calc = new Calculate();
        calc.multiple(1D, 1D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }
}
