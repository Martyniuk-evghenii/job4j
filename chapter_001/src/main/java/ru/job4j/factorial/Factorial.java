package ru.job4j.factorial;

import java.math.BigInteger;

/**
 * Class Factorial, task "4.2. Создать программу вычисляющую факториал".
     *
     * @author Martyniuk Evghenii
     * @version 1
     * @since 27.11.2018.
     */
    public class Factorial {

    /**
     * Calculating factorial of "n".
     *
     * @param number	original number
     * @return			factorial n.
     */
    public BigInteger calculateFactorial(int number) {
        BigInteger result;
        if (number < 0) {
            result = BigInteger.ZERO;
        } else {
            result = BigInteger.ONE;
            for (int i = 1; i <= number; ++i) {
                result = result.multiply(BigInteger.valueOf(i));
            }
        }
        return result;
    }
}