//create an array to store marks of 5 student and print them using loop.
public class Array {
    public static void main(String[] args) {

        // create an array to store 5 marks of students

        int[] marks = { 40, 50, 45, 89, 67};

        // step 2; print heading
        System.out.println("Marks of 5 students");

        // step 3; use for loop to access each element of array

        for (int i = 0; i < marks.length; i++) {

            // step 4 print student number and corresponding marks

            System.out.println("Student" + (i + 1) + "Marks =" + marks[i]);
        }

    }
}
