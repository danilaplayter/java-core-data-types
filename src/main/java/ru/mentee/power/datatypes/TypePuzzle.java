package ru.mentee.power.datatypes;

public class TypePuzzle {
    public static void main(String[] args) {

        System.out.println("Головоломка 1: Сравнение чисел с плавающей точкой");
        double sum = 0.1 + 0.2;
        System.out.println("0.1 + 0.2 == 0.3? " + (sum == 0.3));
        System.out.println("Потому что: 0.1 + 0.2 = " + sum);
        System.out.println("Решение: использовать epsilon для сравнения");
        System.out.println("Math.abs((0.1 + 0.2) - 0.3) < 0.0001? " + (Math.abs(sum - 0.3) < 0.0001) + "\n");

        System.out.println("Головоломка 2: Переполнение");
        System.out.println("Integer.MAX_VALUE + 1 = " + (Integer.MAX_VALUE + 1));
        System.out.println("Объяснение: происходит переполнение, счетчик \"перескакивает\" на минимальное значение");
        System.out.println("Правильный подход: проверять на переполнение или использовать Long\n");

        System.out.println("Головоломка 3: Странное поведение char");
        System.out.println("'a' + 'b' = " + ('a' + 'b'));
        System.out.println("Объяснение: символы конвертируются в их коды (97 + 98) и складываются как числа");
        System.out.println("Для конкатенации символов: \"\" + 'a' + 'b' = " + ("" + 'a' + 'b') + "\n");

        System.out.println("Головоломка 4: Автоупаковка/распаковка");
        Integer i1 = 127, i2 = 127;
        Integer i3 = 128, i4 = 128;
        System.out.println("i1 == i2 (127)? " + (i1 == i2)); // true из-за кэширования
        System.out.println("i3 == i4 (128)? " + (i3 == i4)); // false, разные объекты
        System.out.println("Правильный подход: использовать equals()");
    }
}