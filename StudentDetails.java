//write a program to create a class with student details and display them using object
public class StudentDetails {

    // step 1: declare student attributes
    String name;
    int rollno;
    double marks;

    // step 2: method to display fields
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Rollno: " + rollno);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        // step 3: create an object of StudentDetails
        StudentDetails s1 = new StudentDetails();

        // step 4: assign values to object properties
        s1.rollno = 24665349;
        s1.name = "Rashi";
        s1.marks = 85.5;

        // step 5: call method to display details
        s1.displayDetails();
    }
}
