package ru.mentee.power.datatypes;

public class CurrencyConverter {
    public static void main(String[] args) {

        final double USD_RUB = 90.50;
        final double EUR_RUB = 98.20;
        final double CNY_RUB = 12.50;

        double usdAmount = 100;
        double rubAmount = 100;
        double eurAmount = 50;
        double cnyAmount = 250;

        System.out.println("Курсы валют:");
        System.out.printf("1 USD = %.2f RUB\n", USD_RUB);
        System.out.printf("1 EUR = %.2f RUB\n", EUR_RUB);
        System.out.printf("1 CNY = %.2f RUB\n\n", CNY_RUB);

        System.out.println("Конвертация:");
        System.out.printf("%.0f USD = %.2f RUB\n", usdAmount, usdAmount * USD_RUB);
        System.out.printf("%.0f RUB = %.2f USD\n", rubAmount, rubAmount / USD_RUB);
        System.out.printf("%.0f EUR = %.2f RUB\n", eurAmount, eurAmount * EUR_RUB);
        System.out.printf("%.0f RUB = %.2f EUR\n", 1000.0, 1000.0 / EUR_RUB);
        System.out.printf("%.0f CNY = %.2f RUB\n\n", cnyAmount, cnyAmount * CNY_RUB);


        System.out.println("Демонстрация проблемы точности с double:");// Демонстрация проблемы точности
        double sum = 0.1 + 0.2;
        System.out.println("0.1 + 0.2 = " + sum);
        System.out.println("(0.1 + 0.2) == 0.3? " + (sum == 0.3));
    }
}