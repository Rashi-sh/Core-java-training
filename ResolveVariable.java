//write a program to show how instant variables differentiate from local variables

public class ResolveVariable {
    // step 1 instance variable
    int empid;
    String empname;

    // step 2 constructor with same variable names as instance variable
    ResolveVariable(int empid, String empname) {
        // step 3 use "this" to refer to current object variables
        this.empid = empid;
        this.empname = empname;

    }

    // step 4 display method
    void display() {
        System.out.println("Employee id : " + empid);
        System.out.println("Employee name : " + empname);

    }

    public static void main(String[] args) {
        // step 5 create object
        ResolveVariable e1 = new ResolveVariable(24665349, "Rashi");
        // step 6 display employee details
        e1.display();
    }
}
