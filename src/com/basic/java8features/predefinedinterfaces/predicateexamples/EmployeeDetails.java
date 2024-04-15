package com.basic.java8features.predefinedinterfaces.predicateexamples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

public class EmployeeDetails {
    public static void main(String[] args) {
        try {
            List<Employee> employees = new ArrayList<>();
            employees.add(new Employee("Arun", 5, 60000));
            employees.add(new Employee("Bobby", 10, 800));
            employees.add(new Employee("William", 2, 4000));
            employees.add(new Employee("Deva", 1, 3000));
            employees.add(new Employee("Harshini", 3, 65000));
            employees.add(new Employee("Kishore", 1, 55000));
            employees.add(new Employee("Vivek", 0, 99000));

            BiPredicate<Employee, Double> hasExperienceAboveThreshold = (employee, threshold) -> employee.getYearsOfExperience() > threshold;
            BiPredicate<Employee, Double> hasSalaryAboveThreshold = (employee, threshold) -> employee.getSalary() > threshold;

            System.out.println("Employees with more than 5 years of experience and salary above 50000:");
            for (Employee employee : employees) {
                if (hasExperienceAboveThreshold.and((employeeObj, threshold) -> employeeObj.getSalary() > threshold).test(employee, 5d)) {
                    System.out.println(employee.getName());
                }
            }

            System.out.println("\nEmployees with more than 8 years of experience or salary above 70000:");
            for (Employee employee : employees) {
                if (hasExperienceAboveThreshold.or((employeeObj, threshold) -> employeeObj.getSalary() > threshold).test(employee, 8d)) {
                    System.out.println(employee.getName());
                }
            }

            System.out.println("\nEmployees with less than 3 years of experience:");
            for (Employee employee : employees) {
                if (hasExperienceAboveThreshold.negate().test(employee, 3d)) {
                    System.out.println(employee.getName());
                }
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
