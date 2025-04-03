package ru.mentee.power.datatypes;

public class SmartCalculator {
    public static void main(String[] args) {
        System.out.println(" Умный калькулятор:\n");

        int num1 = 5, num2 = 3;
        System.out.println("Сложение: " + num1 + " + " + num2 + " = " + (num1 + num2) + " (тип: int)");

        double d1 = 5.5, d2 = 2.2;
        System.out.println("Вычитание: " + d1 + " - " + d2 + " = " + (d1 - d2) + " (тип: double)");

        System.out.println("Умножение: " + num1 + " * " + d2 + " = " + (num1 * d2) + " (тип: double)");

        System.out.println("Деление: 10 / 3 = " + (10 / 3.0) + " (тип: double)");
        System.out.println("Целочисленное деление: 10 / 3 = " + (10 / 3) + " (тип: int)");

        System.out.println("Остаток от деления: 10 % 3 = " + (10 % 3) + " (тип: int)");

        System.out.println("Возведение в степень: 2^10 = " + Math.pow(2, 10) + " (тип: double)\n");

        System.out.println("Обработка особых случаев:");
        try {
            System.out.println("Деление на ноль (double): " + (1.0 / 0));
            System.out.println("Деление на ноль (int): " + (1 / 0));
        } catch (ArithmeticException e) {
            System.out.println("Попытка деления на ноль (int): " + e);

        }
    }
}
