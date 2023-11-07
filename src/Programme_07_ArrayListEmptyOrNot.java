import java.util.ArrayList;

/**
 * Write a Java program to test if an array list is empty or not.
 *
 */
public class Programme_07_ArrayListEmptyOrNot {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);

        System.out.println("Is list1 empty? " + isEmpty(list1));
        System.out.println("Is list2 empty? " + isEmpty(list2));
    }

    public static boolean isEmpty(ArrayList<Integer> list) {
        // Check if Arraylist is empty
        if (list.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
