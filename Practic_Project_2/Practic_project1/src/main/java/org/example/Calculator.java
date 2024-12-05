package org.example;

public class Calculator {
    // Метод для додавання
    public double add(double a, double b) {
        return a + b;
    }

    // Метод для віднімання
    public double subtract(double a, double b) {
        return a - b;
    }

    // Метод для множення
    public double multiply(double a, double b) {
        return a * b;
    }

    // Метод для ділення
    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Ділення на нуль!!");
        }
        return a / b;

    }
}
