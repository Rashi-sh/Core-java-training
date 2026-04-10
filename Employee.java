//write a program to create a constructor of employee class to initialize employee data
public class Employee {
    // step 1 add employee attributes
    String name;
    int id;
    double salary;

    // step 2 add constructor to initialize employee data
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
//step 3 method to display employ details
    void displayDetails() {
        System.out.println("Name " + name);
        System.out.println("ID " + id);
        System.out.println("Salary " + salary);
    }
//step 4 create object and pass values directly
    public static void main(String[] args) {
        Employee emp1 = new Employee("Rashi", 24665349, 500000);
//step 5 display employ details
        emp1.displayDetails();
    }

}
