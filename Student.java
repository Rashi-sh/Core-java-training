
//create a program to show 1) characrer length , 2) upper case 3) lower case of student name.
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Original name" + name);
        System.out.println(" Length" + name.length());
        System.out.println("Upper case" + name.toUpperCase());
        System.out.println(" Lower case" + name.toLowerCase());
        sc.close();

    }
}
