package com.basic.java8features.streamdemo.employee;

import java.util.Scanner;

public class EmployeeOperation {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            Filter filter = new Filter();
            boolean fill = true;
            while (fill) {
                System.out.println("Filter Search : \n1.All Details of employee \n2.Count of Employees \n3.Older employee age " +
                        "\n4.Younger employee age" + " \n5.Highest Salary \n6.Average age" +
                        " \n7.Sort by uid \n8.Sort by Age \n9.Sort by year of birth \n10.Exit App");
                int userInterest = userInput.nextInt();
                switch (userInterest) {
                    case 1:
                        filter.allDetails();
                        break;
                    case 2:
                        filter.count();
                        break;
                    case 3:
                        filter.oldest();
                        break;
                    case 4:
                        filter.youngest();
                        break;
                    case 5:
                        filter.highEarner();
                        break;
                    case 6:
                        filter.average();
                        break;
                    case 7:
                        filter.sort();
                        break;
                    case 8:
                        filter.sortAge();
                        break;
                    case 9:
                        filter.sortBirth();
                        break;
                    case 10:
                        System.out.println("Successfully exited");
                        fill = false;
                        break;

                    default:
                        System.out.println("Invalid choice!!");
                }
            }

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
