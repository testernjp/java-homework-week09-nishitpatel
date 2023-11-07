import java.util.HashMap;
import java.util.Map;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Programme_09_HashMapIteration {
    public static void main(String[] args) {
        // Create a HashMap to store names and ages
        Map<String, Integer> people = new HashMap<>();
        // Add key-value pairs to the map
        people.put("Rajesh", 25);
        people.put("Sheldon", 30);
        people.put("Leonard", 22);
        people.put("Howard", 28);
        // Call the method to iterate and print the values
        iterateAndPrintValues(people);
    }

    // Method to iterate and print values from the map
    public static void iterateAndPrintValues(Map<String, Integer> map) {
        System.out.println("Values in the map: ");
        for (Integer age : map.values()) {
            System.out.println(age);
        }
    }
}
