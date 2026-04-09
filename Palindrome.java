import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number or word:");
        String input = sc.nextLine();

        String reverse = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse += input.charAt(i);
        }

        System.out.println("Backward loop result: " + reverse);
        if (input.equals(reverse)) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }

        sc.close();
    }
}