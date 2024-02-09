package com.basic.syntax;
import java.util.Scanner;

public class Operations {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        boolean flag = true;
        do {
            System.out.println(" ");
            System.out.println("Enter the data type:");
            System.out.println("1. byte\n2. short\n3. int\n4. long\n5. float\n6. double\n7. exit");
            int dataTypeChoice = sc.nextInt();

            switch (dataTypeChoice) {
                case 1:
                    performByteOperations();
                    break;
                case 2:
                    performShortOperations();
                    break;
                case 3:
                    performIntOperations();
                    break;
                case 4:
                    performLongOperations();
                    break;
                case 5:
                    performFloatOperations();
                    break;
                case 6:
                    performDoubleOperations();
                    break;
                case 7:
                    System.out.println("Successfully exited");
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (flag);
    }

    public static void performByteOperations() {
        System.out.println("Enter the first number: ");
        byte byteValue1 = sc.nextByte();
        System.out.println("Enter the second number: ");
         byte byteValue2 = sc.nextByte();
         System.out.println("Enter the operation");
        System.out.println("1. addition\n2. subtraction\n3. multiplication\n4. division\n5. modulus\n6. back");
        int operator = sc.nextInt();

        switch (operator) {
            case 1:
                System.out.println("Result: " + (byteValue1 + byteValue2));
                break;
            case 2:
                System.out.println("Result: " + (byteValue1 - byteValue2));
                break;
            case 3:
                System.out.println("Result: " + (byteValue1 * byteValue2));
                break;
            case 4:
                System.out.println("Result: " + (byteValue1 / byteValue2));
                break;
            case 5:
                System.out.println("Result: " + (byteValue1 % byteValue2));
                break;
            case 6:
                System.out.println("Successfully exited");
                break;
            default:
                System.out.println("Invalid choice. Please enter a valid option.");
        }
    }

    public static void performShortOperations() {
        System.out.println("Enter the first number: ");
         short shortValue1 = sc.nextShort();
        System.out.println("Enter the second number: ");
        short shortValue2 = sc.nextShort();
        System.out.println("Enter the operation");
        System.out.println("1. addition\n2. subtraction\n3. multiplication\n4. division\n5. modulus\n6. back");
        int operator = sc.nextInt();

        switch (operator) {
            case 1:
                System.out.println("Result: " + (shortValue1 + shortValue2));
                break;
            case 2:
                System.out.println("Result: " + (shortValue1- shortValue2));
                break;
            case 3:
                System.out.println("Result: " + (shortValue1 * shortValue2));
                break;
            case 4:
                System.out.println("Result: " + (shortValue1 / shortValue2));
                break;
            case 5:
                System.out.println("Result: " + (shortValue1 % shortValue2));
                break;
            case 6:
                System.out.println("Successfully exited");
                break;
            default:
                System.out.println("Invalid choice. Please enter a valid option.");
        }
    }

    public static void performIntOperations() {
        boolean flag=true;
        do {
            System.out.print("Enter the first number: ");
            int value1 = sc.nextInt();
            System.out.print("Enter the second number: ");
            int value2 = sc.nextInt();
            System.out.println(" ");
            System.out.println("Enter the operation");
            System.out.println("1.addition\n2.subtraction\n3.multiplication\n4.division\n5.modulus\n6.exit");
            int operator = sc.nextInt();

            switch (operator) {
                case 1: {
                    System.out.println("value of a & b:" + (value1+ value2));

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

    public static void performLongOperations() {
        boolean flag=true;
        do {
            System.out.print("Enter the first number: ");
            long value1 = sc.nextLong();
            System.out.print("Enter the second number: ");
            long value2 = sc.nextLong();
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



    public static void performDoubleOperations() {
        boolean flag=true;
        do {
            System.out.print("Enter the first number: ");
            double value1 = sc.nextDouble();
            System.out.print("Enter the second number: ");
            double value2 = sc.nextDouble();
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

    public static void performFloatOperations() {
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

