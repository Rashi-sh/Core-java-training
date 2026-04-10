//write a program to build methods f0r add,subtract,multiply,divide and so on....

import java.util.Scanner;

public class Calculator {

    // method 1 addition

    public static int add(int a, int b) {
        return a + b;
    }

    // method 2 subtraction
    public static int subtract(int a, int b) {
        return a - b;
    }

    // method 3 multiplication
    public static int multiply(int a, int b) {
        return a * b;
    }

    // method 4 division
    public static String divide(int a, int b) {
        if (b == 0) {
            return "Not defined";

        }
        return String.valueOf(a / b);
    }

    public static void main(String[] args) {
        // declare numbers
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter first number: ");
        int num1 = sc.nextInt();

        System.out.println(" Enter second number: ");
        int num2 = sc.nextInt();

        // call methods and print results
        System.out.println(" Addition" + add(num1, num2));
        System.out.println(" Subtraction" + subtract(num1, num2));
        System.out.println(" Multiplication" + multiply(num1, num2));
        System.out.println(" Division" + divide(num1, num2));
        sc.close();
    }
}
