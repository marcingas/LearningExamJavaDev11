import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayTransformation {
    public static void main(String[] args) {
        System.out.println("-----------Using Arrays.copyOf ----------");

        // Create an array of Integer
        Integer[] originalArray = new Integer[10];

        // Initialize values to 1 - 10
        Arrays.setAll(originalArray, (index) -> index + 1);
        System.out.println("integerArray values = "
                + Arrays.toString(originalArray));

        // Create Copy of array, same size
        Integer[] copiedArray =
                Arrays.copyOf(originalArray, originalArray.length);

        System.out.println("copiedArray values = "
                + Arrays.toString(copiedArray));

        // Create Copy of of an array, trimmed to specified size
        Integer[] trimmedArray = Arrays.copyOf(originalArray, 7);

        // Copy array to larger array, extra elements get default values
        Integer[] widenedArray = Arrays.copyOf(originalArray, 15);

        System.out.println("trimmedArray values = "
                + Arrays.toString(trimmedArray));

        System.out.println("widenedArray values = "
                + Arrays.toString(widenedArray));

        // Create Copy of defined portion of Array
        Integer[] croppedArray = Arrays.copyOfRange(originalArray, 2, 6);
        System.out.println("croppedArray values = "
                + Arrays.toString(croppedArray));

        croppedArray[0] = 5;
        System.out.println("croppedArray values after a change = "
                + Arrays.toString(croppedArray));

        // Create a new Integer array
        Integer[] integerArray = new Integer[10];

        // Set values to 1 - 10
        Arrays.setAll(integerArray, (index) -> index + 1);

        System.out.println("integerArray values = " +
                Arrays.toString(integerArray));

        List anotherList = List.of(integerArray);

        // Create a subList of a list
        List shortList = anotherList.subList(3, 7);
        System.out.println("shortList values : " + shortList.toString());

        // And now go from list to array...
        Integer[] repeatedArray = new Integer[10];
        anotherList.toArray(repeatedArray);
        System.out.println("array created from toArray method : " +
                Arrays.toString(repeatedArray));

        System.out.println("------  iterator tests --------");
        // Iterator allows forward processing of list elements
        System.out.println("loop through anotherList.iterator() values...");
        for (Iterator it = anotherList.iterator(); it.hasNext(); ) {
            System.out.print(it.next());
        }

        // ListIterator allows backwards and forwards processing
        // of list elements
        System.out.println("\nloop through anotherList.listIterator() values...");
        ListIterator lit = anotherList.listIterator();

        for (int i = 0; lit.hasNext(); i++) {
            System.out.print(lit.next());
            if (i == 4) {
                System.out.println("\nreverse direction");
                for (; lit.hasPrevious(); ) {
                    System.out.print(lit.previous());
                }
                break;
            }
        }
    }
}
