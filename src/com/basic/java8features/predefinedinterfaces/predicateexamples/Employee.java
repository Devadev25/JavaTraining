package com.basic.java8features.predefinedinterfaces.predicateexamples;

class Employee {
    private String name;
    private int yearsOfExperience;
    private double salary;

    public Employee(String name, int yearsOfExperience, double salary) {
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public double getSalary() {
        return salary;
    }
}
