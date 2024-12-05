package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        try {
            // Перше число яке вводиться
            System.out.println("Введіть перше число:");
            if (!scanner.hasNextDouble()) {
                throw new InputMismatchException("Помилка: введено нечислове значення!");
            }
            double num1 = scanner.nextDouble();


            System.out.println("Введіть друге число:");
            if (!scanner.hasNextDouble()) {



                throw new InputMismatchException("Помилка: введено нечислове значення!");
            }
            double num2 = scanner.nextDouble();

            // Вибір операції
            System.out.println("Виберіть операцію (+, -, *, /):");
            char operation = scanner.next().charAt(0);
            double result = 0;

            // Виконання операції
            switch (operation) {
                case '+':
                    result = calculator.add(num1, num2);
                    break;
                case '-':
                    result = calculator.subtract(num1, num2);
                    break;
                case '*':
                    result = calculator.multiply(num1, num2);
                    break;
                case '/':
                    result = calculator.divide(num1, num2);
                    break;
                default:
                    System.out.println("Невірна операція!");
                    return;
            }

            // Виведення результату
            System.out.println("Результат: " + result);
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());  // Виведення повідомлення про невірне введення
        } catch (ArithmeticException e) {
            System.out.println("Помилка: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Невірний вхід: " + e.getMessage());
        } finally {
            System.out.println("Обробка запиту завершена.");
            scanner.close();
        }
    }
}

