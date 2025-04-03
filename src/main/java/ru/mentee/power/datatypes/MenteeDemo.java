package ru.mentee.power.datatypes;

public class MenteeDemo {
    public static void main(String[] args) {
        Mentee mentee_1 = new Mentee("Даниил", "Емельянов", 32, 5.0, 5);
        Mentee mentee_2 = new Mentee("Данила", "Март", 18, 2.3, 2);
        Mentee mentee_3 = new Mentee("Годжу", "Сатору", 19, 4.2, 5);

        mentee_1.displayInfo();
        mentee_2.displayInfo();
        mentee_3.displayInfo();

    }
}
