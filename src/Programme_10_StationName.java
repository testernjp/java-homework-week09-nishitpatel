import java.util.HashMap;
import java.util.Scanner;

/**
 * Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */
public class Programme_10_StationName {
    public static void main(String[] args) {
        // Create a map to represent the station-to-line mapping
        HashMap<String, String> stationToLines = new HashMap<>();
        initialiseStationToLineMappings(stationToLines);

        // Prompt the user to enter station names separated by commas
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any one station name (e.g., Westminster, Embankment, London Bridge, Waterloo): ");
        String stationNames = scanner.nextLine();

        // Find the tube lines passing through the entered station
        String tubeLines = findTubeLinesForStations(stationToLines, stationNames);
        if (tubeLines != null) {
            System.out.println("The following tube lines pass through " + stationNames + ": " + tubeLines);
        } else {
            System.out.println(stationNames + " is not a valid station or does not belong to any tube line.");
        }
     scanner.close();
    }

    // initialise station-to-line mappings
    private static void initialiseStationToLineMappings(HashMap<String, String> stationToLines) {
        // Add station-to-line mappings for various stations here
        stationToLines.put("Westminster", "Circle, District, Jubilee");
        stationToLines.put("Embankment", "Bakerloo, Circle, District, Northern");
        stationToLines.put("London Bridge", "Jubilee, Northern");
        stationToLines.put("Waterloo", "Bakerloo, Jubilee, Northern, Waterloo % City");
    }

    // Find the tube lines that pass through the entered station
    private static String findTubeLinesForStations(HashMap<String, String> stationToLine, String stationName) {
        if (stationToLine.containsKey(stationName)) {
            return stationToLine.get(stationName);
        }
        return null; // The entered station is not found in the mappings
    }
}
