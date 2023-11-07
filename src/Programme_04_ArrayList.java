import java.util.ArrayList;

/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop
 */
public class Programme_04_ArrayList {
    public static void main(String[] args) {
        // Create a new ArrayList to store colours
        ArrayList<String> colourList = new ArrayList<>();
        // Add sine colours to the list
        addColours(colourList);
        // Print out the collection using a for-each loop
        printColours(colourList);
    }

    // Method to add colours to the ArrayList
    public static void addColours(ArrayList<String> list) {
        list.add("Black");
        list.add("Blue");
        list.add("Red");
        list.add("Yellow");
        list.add("Green");
    }

    // Method to print the collection using a for-each loop
    public static void printColours(ArrayList<String> list) {
        System.out.println("Colours in the collection: ");
        for (String colour : list) {
            System.out.println(colour);
        }
    }
}
