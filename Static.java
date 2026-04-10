//write a program in which we create we create employee objects with shared company name using static v

public class Static {
    //step 1 instance variable (different for each employee)
    int empId;
    String empname;
    //step 2 static variable (same for all employee)
    static String companyName = "Tech Solutions Pvt Ltd";

    //step 3 constructor
    Static(int empId, String empname) {
        this.empId = empId;
        this.empname = empname;
    }
    //step 4 display method
    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empname);
        System.out.println("Company Name: " + companyName);
        System.out.println("-----------------------------");

    }
    public static void main(String[] args) {
        //step 5 create employee objects
        Static e1 = new Static(101, "raj");
        Static e2 = new Static(102, "Bob");
        Static e3 = new Static(103, "manav");

        //step 6 call display method for each employee
        e1.display();
        e2.display();
        e3.display();

    }

}
