/**
 * Write a Java program to reverse an array of integer values
 */
public class Programme_03_ReverseArrays {
    public static void main(String[] args) {
        int [] originalArray = {10, 20, 30, 40, 50};
        System.out.print("Original Array: ");
        printArray(originalArray);
        int [] reversedArray = reverseArray(originalArray);
        System.out.print("\nReversed Array: ");
        printArray(reversedArray);
    }
    // Method to reverse an array of integers
    public static int[] reverseArray(int[] arr) {
        int length = arr.length;
        int [] reversed = new int[length];
        for (int i = 0; i < length; i++) {
            reversed[i] = arr[length - 1 - i];
        }
        return reversed;
    }
    // Method to print an array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
