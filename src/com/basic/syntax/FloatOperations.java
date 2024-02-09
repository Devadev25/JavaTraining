package com.basic.syntax;
import java.util.Scanner;

public class FloatOperations {
    static Scanner sc=new Scanner(System.in);
    public static void main(String []args) {


        boolean flag=true;
        do {
            System.out.print("Enter the first number: ");
            float value1 = sc.nextFloat();
            System.out.print("Enter the second number: ");
            float value2 = sc.nextFloat();
            System.out.println(" ");
            System.out.println("Enter the operation");
            System.out.println("1.addition\n2.subtraction\n3.multiplication\n4.division\n5.modulus\n6.exit");
            int operator = sc.nextInt();

            switch (operator) {
                case 1: {
                    System.out.println("value of a & b :" + (value1+ value2));
                    break;
                }
                case 2: {
                    System.out.println("value of a & b :" + (value1- value2));
                    break;
                }
                case 3: {
                    System.out.println("value of a & b :" + (value1 * value2));
                    break;
                }
                case 4: {
                    System.out.println("value of a & b :" + (value1 / value2));
                    break;
                }
                case 5: {
                    System.out.println("value of a & b :" + (value1 % value2));
                    break;
                }
                case 6: {
                    System.out.println("successfully exited");
                    flag=false;
                    break;
                }
                default: System.out.println("Invalid operation . Please enter a valid operation");
            }

        }   while (flag);
    }
}
