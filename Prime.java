//Prime number check
//break statement, nested logic
//Teaches efficiency and optimizing lopp exits.
//step 1: Check is a number is prime.
//step 2: optimise the prime check by breaking out od the lopp early when a divisor is found.
//step 3: Handle edge cases (numbers less than 2, 2 itself, etc.) to ensure accurate results.
//step 4: Test the implementation with various inputs to ensure correctness.

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;

        // for (int i = 2; i <= num / 2; i++) {
        // if (num % i == 0) {
        // isPrime = false;
        // break;
        // }
        // }

        if (isPrime)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");

        sc.close();
    }

    // creating my own method to find prime number
    public static boolean isprime(int num) {
        if (num <= 1) {
            return false;

        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;

    }
}
