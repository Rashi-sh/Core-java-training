import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    // create a variable to enter two value
    // perform UnsupportedOperationException
    // display results

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers");
    double a = sc.nextDouble();
    double b = sc.nextDouble();

    System.out.println("sum is " + (a + b));
    sc.close();
  }
}