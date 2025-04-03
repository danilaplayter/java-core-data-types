package ru.mentee.power.datatypes;

public class Mentee {
    // Поля
    private String firstName;
    private String lastName;
    private int age;
    private double averageGrade;
    private int level;

    // Конструктор
    public Mentee(String firstName, String lastName, int age, double averageGrade, int level) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.averageGrade = averageGrade;
        this.level = (level >= 1 && level <= 5) ? level : 1;
    }

    //добавил пустой конструктор, чтобы более удобно создавать в тестах, для лучшей модульности тестов
    public Mentee(){

    }

    // Методы
    public void displayInfo() {
        System.out.println("Менти: " + firstName + " " + lastName);
        System.out.println("Возраст: " + age);
        System.out.println("Средний балл: " + averageGrade);
        System.out.println("Уровень: " + level);
        if(isExcellent()){
            System.out.println("Отличник: Да.");
        }
        else{
            System.out.println("Отличник: Нет.");
        }
        System.out.println("Стипендия:  " + calculateScholarship() + "\n");
    }

    public boolean isExcellent() {
        return averageGrade >= 4.5;
    }

    public boolean advanceToNextLevel() {
        if (level < 5) {
            level++;
            return true;
        }
        return false;
    }

    public int calculateScholarship() {
       if(averageGrade >= 4.5){
           return 2000;
       }
       if(averageGrade >= 4.0){
           return 1500;
       }
       if(averageGrade < 4.0){
           return 1000;
       }
       return -1;
    }

    // Геттеры и сеттеры для доступа к приватным полям
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level){
        this.level = level;
    }
}