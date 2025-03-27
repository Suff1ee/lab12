package org.example;
public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;
    private int totalHoursWorked = 0;

    public Tester() {
    }

    public Tester(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Tester(String name, String surname, int experienceInYears) {
        this(name, surname);
        this.experienceInYears = experienceInYears;
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this(name, surname, experienceInYears);
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public void work() {
        System.out.println(name + " тестирует ПО.");
    }

    public void work(String project) {
        System.out.println(name + " тестирует ПО проекта: " + project);
    }

    public void work(String project, int hours) {
        totalHoursWorked += hours;
        System.out.println(name + " тестирует ПО проекта: " + project + " в течение " + hours + " часов.");
        System.out.println("Всего отработано часов: " + totalHoursWorked);
    }

    public static void printCompany() {
        System.out.println("Тестировщики работают в различных ИТ-компаниях по всему миру.");
    }
}
