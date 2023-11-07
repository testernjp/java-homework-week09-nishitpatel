import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a Java program to iterate through all elements in an array list using Iterater.
 */
public class Programme_05_ArrayListIteration {
    public static void main(String[] args) {
        // Create an ArrayList and add elements
        ArrayList<String> list = new ArrayList<>();
        list.add("Alpha");
        list.add("Beta");
        list.add("Charlie");
        list.add("Delta");
// Call the method to iterate and print elements
        iterateUsingIterator(list);
    }

    // Method to iterate and print elements using Iterator
    public static void iterateUsingIterator(ArrayList<String> list) {
        // Create an Iterator for the ArrayList
        Iterator<String> it = list.iterator();
        // Use the iterator to loop through the elements
        while (it.hasNext()) {
            String element = it.next();
            System.out.println(element);
        }
    }
}
