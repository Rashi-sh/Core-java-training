
//write a program to create a constructor of employee class to initialize employee data
import java.util.Scanner;

public class UserEmployee {
    // step 1 add employee attributes
    String empname;
    int empid;
    double empsalary;

    // step 2 add constructor to initialize employee data
    UserEmployee(String name, int id, double salary) {
        empname = name;
        empid = id;
        empsalary = salary;
    }

    // step 3 method to display employ details
    void displayDetails() {
        System.out.println("Name " + empname);
        System.out.println("ID " + empid);
        System.out.println("Salary " + empsalary);
    }

    // step 4 Ask user values
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee name: ");
        String name = sc.nextLine();

        System.out.println("Enter emploee id: ");
        int id = sc.nextInt();

        System.out.println("Enter employee salary: ");
        double salary = sc.nextDouble();

        // initializing
        UserEmployee e1 = new UserEmployee(name, id, salary);
        //display
        e1.displayDetails();
        sc.close();

    }

}