import java.util.HashSet;
import java.util.Set;

public class Programme_08_HashSetIntegerObject {
    public static void main(String[] args) {

        HashSet<Integer> numberSet = new HashSet<>();
        // Add numbers to the set
        numberSet.add(4);
        numberSet.add(7);
        numberSet.add(8);
        // Determine which numbers between 1 and 10 are in the set
        findNumberInSet(numberSet);
    }

    // Method to find and print numbers in the set between 1 and 10
    public static void findNumberInSet(Set<Integer> set) {
        System.out.println("Numbers between 1 and 10 in the set: ");
        for (int i = 1; i <= 10; i++) {
            if (set.contains(i)) {
                System.out.println(i + " is in the set ");
            } else {
                System.out.println(i + " is not in the set ");
            }
        }
    }
}
