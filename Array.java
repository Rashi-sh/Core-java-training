//array

//public class Array {
//    public static void main(String[] args) {
//        int[] numbers = {7,6,4,8,9};
//        System.out.println("Array elements:");
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        }
//    }
//}

//for sorting the array
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] numbers = { 7, 6, 4, 8, 9 };
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        Arrays.sort(numbers);
        System.out.println("\n Sorted array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}

// for searching an element in the array
// import java.util.Arrays;
// import java.util.Scanner;
// public class Array {
// public static void main(String[] args) {
// int[] numbers = { 7, 6, 4, 8, 9 };
// System.out.println("Array elements:");
// for (int i = 0; i < numbers.length; i++) {
// System.out.print(numbers[i] + " ");
// }
// int key = 4;
// int index = Arrays.binarySearch(numbers, key);
// if (index >= 0) {
// System.out.println("\nElement " + key + " found at index: " + index);
// } else {
// System.out.println("\nElement " + key + " not found in the array.");
// }
// }
// }