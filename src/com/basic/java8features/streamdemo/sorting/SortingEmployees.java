package com.basic.java8features.streamdemo.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortingEmployees {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        List<Employee> details = new ArrayList<>();
        details.add(new Employee(48, "Kishore", 23, 45000));
        details.add(new Employee(12, "Harshini", 43, 5000));
        details.add(new Employee(4, "Vivek", 28, 500000));
        details.add(new Employee(3, "Harsha", 20, 50000));
        details.add(new Employee(9, "Arun", 30, 5010));
        details.add(new Employee(11, "Babu", 83, 450000));
        boolean revert=true;
        while (revert) {
            System.out.println("Enter the type of sorting \n1.Ascending \n2.descending\n3.Exit");
            int value = userInput.nextInt();
            switch (value) {
                case 1:
                    boolean revertAscending = true;
                    while (revertAscending) {
                        System.out.println(" Ascending to be performed on :\n1.Salary\n2.Id\n3.Name\n4.Age\n5.Exit");
                        {
                            int operation = userInput.nextInt();

                            switch (operation) {
                                case 1:
                                    List<Employee> dataSalary = details.stream().sorted((data1, data2) -> (int) (data1.getSalary() - data2.getSalary())).collect(Collectors.toList());
                                    System.out.println(dataSalary);
                                    break;

                                case 2:
                                    List<Employee> dataId = details.stream().sorted(Comparator.comparingInt(Employee::getId)).collect(Collectors.toList());
                                    System.out.println(dataId);
                                    break;
                                case 3:
                                    List<Employee> dataName = details.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
                                    System.out.println(dataName);
                                    break;
                                case 4:
                                    List<Employee> dataAge = details.stream().sorted(Comparator.comparingInt(Employee::getAge)).collect(Collectors.toList());
                                    System.out.println(dataAge);
                                    break;
                                case 5:
                                    System.out.println("Exited Successfully");
                                    revertAscending = false;
                                    break;
                                default:
                                    System.out.println("Invalid Choice");
                            }
                        }
                    }
                    break;
                case 2:
                    boolean revertDescending = true;
                    while (revertDescending) {
                        System.out.println(" Descending to be performed on :\n1.Salary\n2.Id\n3.Name\n4.Age\n5.Exit");
                        {
                            int operation = userInput.nextInt();

                            switch (operation) {
                                case 1:
                                    List<Employee> dataSalary = details.stream().sorted(Comparator.comparingLong(Employee::getSalary).reversed()).collect(Collectors.toList());
                                    System.out.println(dataSalary);
                                    break;
                                case 2:
                                    List<Employee> dataId = details.stream().sorted(Comparator.comparingInt(Employee::getId).reversed()).collect(Collectors.toList());
                                    System.out.println(dataId);
                                    break;
                                case 3:
                                    List<Employee> dataName = details.stream().sorted(Comparator.comparing(Employee::getName).reversed()).collect(Collectors.toList());
                                    System.out.println(dataName);
                                    break;
                                case 4:
                                    List<Employee> dataAge = details.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).collect(Collectors.toList());
                                    System.out.println(dataAge);
                                    break;
                                case 5:
                                    System.out.println("Exited Successfully");
                                    revertDescending = false;
                                    break;
                                default:
                                    System.out.println("Invalid Choice");

                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Exited Successfully");
                    revert=false;
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}


