package ru.mentee.power.datatypes;

public class DataTypeBoundaries {
    public static void main(String[] args) {

        System.out.println("Границы типов данных в Java:\n");

        System.out.println("byte: от " + Byte.MIN_VALUE + " до " + Byte.MAX_VALUE);
        System.out.println("short: от " + Short.MIN_VALUE + " до " + Short.MAX_VALUE);
        System.out.println("integer: от " + Integer.MIN_VALUE + " до " + Integer.MAX_VALUE);
        System.out.println("long: от " + Long.MIN_VALUE + " до " + Long.MAX_VALUE);
        System.out.println("float: от " + Float.MIN_VALUE + " до " + Float.MAX_VALUE);
        System.out.println("double: от " + Double.MIN_VALUE + " до " + Double.MAX_VALUE);

        System.out.println("\nДемонстрация переполнения:\n");

        byte byteMyMax = (byte) (Byte.MAX_VALUE + 1);
        short shortMyMax = (short) (Short.MAX_VALUE + 1);
        int intMyMax = Integer.MAX_VALUE + 1;
        long longMyMax = Long.MAX_VALUE + 1;
        float floatMyMax = (Float.MAX_VALUE + 1.0f)*2;
        double doubleMyMax = (Double.MAX_VALUE + 1.0)*2;

        System.out.println("Переполнение byte: " + byteMyMax);// с byte по long будет просто начало с самого маленького числа соответствующего типа
        System.out.println("Переполнение short: " + shortMyMax);
        System.out.println("Переполнение integer: " + intMyMax);
        System.out.println("Переполнение long: " + longMyMax);
        System.out.println("Переполнение float: " + floatMyMax);//выводит "Infinity"
        System.out.println("Переполнение double: " + doubleMyMax);//выводит "Infinity"

    }
}