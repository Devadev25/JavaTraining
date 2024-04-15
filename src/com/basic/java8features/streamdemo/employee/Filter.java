package com.basic.java8features.streamdemo.employee;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    List<EmployeeApp> details = Arrays.asList(
            new EmployeeApp(78965413L, "Arun", 50000L, 23, 2001),
            new EmployeeApp(9521358L, "Kishore", 60000L, 30, 1993),
            new EmployeeApp(45213987L, "Harshini", 40000L, 35, 1988),
            new EmployeeApp(2589631L, "Vivek", 5000000L, 28, 1997),
            new EmployeeApp(78965413L, "Harsha", 359600L, 24, 2000),
            new EmployeeApp(78965413L, "deva", 20000L, 27, 1998)
    );




        public void allDetails () {
        System.out.println("****************************************");
        System.out.println("All Details");
        details.forEach(System.out::println);
        System.out.println("****************************************");

    }

        public void count () {
        System.out.println("****************************************");
        long count = details.stream().count();
        System.out.println("Count of employees : " + count);
        System.out.println("****************************************");
    }

        public void oldest () {
        System.out.println("****************************************");
        EmployeeApp oldest = details.stream().max((age1, age2) -> Integer.compare(age1.getAge(), age2.getAge())).orElse(null);
        System.out.println("Oldest employee : " + oldest);
        System.out.println("****************************************");


    }

        public void youngest () {
        System.out.println("****************************************");
        EmployeeApp youngest = details.stream().min((age1, age2) -> Integer.compare(age1.getAge(), age2.getAge())).orElse(null);
        System.out.println("Youngest employee : " + youngest);
        System.out.println("****************************************");

    }

        public void highEarner () {
        System.out.println("****************************************");
        List<EmployeeApp> highEarners = details.stream().filter(employee -> employee.getSalary() > 50000L).collect(Collectors.toList());
        highEarners.forEach(System.out::println);
        System.out.println("****************************************");
    }

        public void average () {
        System.out.println("****************************************");
        double averageAge = details.stream().mapToLong(EmployeeApp::getAge).average().orElse(0);
        System.out.println("Average age : " + averageAge);
        System.out.println("****************************************");
    }

        public void sort () {
        System.out.println("****************************************");
        List<EmployeeApp> dataId = details.stream().sorted(Comparator.comparingLong(EmployeeApp::getUid)).collect(Collectors.toList());
        System.out.println(dataId);
        System.out.println("****************************************");
    }

        public void sortAge () {
        System.out.println("****************************************");
        List<EmployeeApp> dataAge = details.stream().sorted(Comparator.comparingInt(EmployeeApp::getAge)).collect(Collectors.toList());
        System.out.println(dataAge);
        System.out.println("****************************************");
    }

        public void sortBirth () {
        System.out.println("****************************************");
        List<EmployeeApp> dataBirth = details.stream().sorted(Comparator.comparingInt(EmployeeApp::getYearOfBirth)).collect(Collectors.toList());
        System.out.println(dataBirth);
        System.out.println("****************************************");
    }
    }


