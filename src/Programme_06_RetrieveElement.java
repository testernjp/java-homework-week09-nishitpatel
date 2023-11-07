import java.util.ArrayList;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class Programme_06_RetrieveElement {
    public static void main(String[] args) {
        // Create an ArrayList of country names
        ArrayList<String> countries = new ArrayList<>();
        countries.add("India");
        countries.add("United Kingdom");
        countries.add("Spain");
        countries.add("Vietnam");
        countries.add("Australia");

        // Index of the country to retrieve
        int indexToRetrieve = 2;

        // Call the method to retrieve and print a country name
        retrieveAndPrintCountry(countries, indexToRetrieve);
    }

    // Method to retrieve and print a country name at a specified index
    public static void retrieveAndPrintCountry(ArrayList<String> list, int index) {
        // Check if the index is within the valid range
        if (index >= 0 && index < list.size()) {
            // Retrieve and print the country name at the specified index
            String country = list.get(index);
            System.out.println("Country at index " + index + " : " + country);
        } else {
            System.out.println("Invalid index. Index should be between 0 and " + (list.size() - 1));
        }
    }
}