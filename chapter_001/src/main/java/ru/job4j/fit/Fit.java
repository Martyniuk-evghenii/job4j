package ru.job4j.fit;

/**
 * Программа расчета идеального веса.
 */
public class Fit {
    public static void main(String[] args) {
        String name = "Dog";
        change(name);
        System.out.println(name);
        name = change(name);
        System.out.println(name);
    }

    public static String change(String name) {
        name = name + "Cat";
        String surname = "Kotov";
        return surname;
    }

}
