import java.util.Arrays;

public class CastExtras {
    // Just want a few classes to play with

    static class BaseClass {
        String name = "Base Case";

        public String toString() {
            return getClass().getName();
        }
    }

    static class NextClass extends BaseClass {
        String name = "Next Best Case";
    }

    // main method, we'll test out some more casting examples
    public static void main(String[] args) {

        // Let's create the most generic of arrays
        Object[] myObjectArray = new Object[10];

        // This fills an Object array with Objects that are NextClass
        // It does not change the type of array to NextClass[]
        Arrays.fill(myObjectArray, new NextClass());

        // You can put any type of Object in there
        myObjectArray[5] = new StringBuilder("test");

        System.out.println(myObjectArray.getClass().getTypeName());
        System.out.println(Arrays.toString(myObjectArray));

    }
}