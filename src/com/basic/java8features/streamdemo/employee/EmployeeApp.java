package com.basic.java8features.streamdemo.employee;

public class EmployeeApp {
    private long uid;
    private String name;
    private long salary;
    private int age;
    private int yearOfBirth;

    @Override
    public String toString() {
        return "EmployeeApp{" +
                "uid=" + uid +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public EmployeeApp(long uid, String name, long salary, int age, int yearOfBirth) {
        this.uid = uid;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.yearOfBirth = yearOfBirth;
    }
}
