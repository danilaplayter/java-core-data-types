package ru.mentee.power.datatypes;

public class DataTypesInAction {
    public static void main(String[] args) {

        int a = 7, b = 2;
        System.out.println("1. Целочисленное деление:");
        System.out.println(a + " / " + b + " = " + (a / b) + " (дробная часть отбрасывается)\n");

        System.out.println("2. Деление с плавающей точкой:");
        System.out.println(a + " / " + b + ".0 = " + (a / (double)b) + " (результат с плавающей точкой)\n");

        System.out.println("3. Явное приведение типов:");
        double d = 3.75;
        System.out.println("(int)" + d + " = " + (int)d + " (дробная часть отбрасывается)");
        System.out.println("(char)65 = '" + (char)65 + "' (символ с кодом 65)");
        long bigNum = 1_000_000_000_000L;
        System.out.println("(int)" + bigNum + " = " + (int)bigNum + " (переполнение)\n");

        System.out.println("4. Автоматическое повышение типа:");
        byte x = 10, y = 20;
        System.out.println(x + " + " + y + " = " + (x + y) + " (тип результата int)");
        System.out.println(a + " * " + d + " = " + (a * d) + " (тип результата double)");

        System.out.println("\n5. Операции с boolean:");
        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println("true && false = " + (bool1 && bool2));
        System.out.println("true || false = " + (bool1 || bool2));
        System.out.println("!true = " + (!bool1));

        System.out.println("\n6. Работа с символами:");
        char charA = 'A';
        char charB = 66; // Код символа 'B'

        System.out.println("Символ '" + charA + "' имеет код: " + (int)charA);
        System.out.println("Символ с кодом 66: '" + charB + "'");
        System.out.println("'A' + 1 = '" + (char)(charA + 1) + "'"); // Сдвиг на 1 в Unicode

    }
}
