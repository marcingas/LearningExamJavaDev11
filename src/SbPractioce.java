public class SbPractioce {
    public static void main(String[] args) {
        // Create and Initialize a StringBuilder Object
        StringBuilder sb = new StringBuilder("World Hello, How are you?");
        System.out.println("Original Value in sb = " + sb);

        // Delete the comma from the string,
        // Use indexOf to retrieve the index of the comma
        System.out.println("sb.deleteCharAt(sb.indexOf(\",\") = " +
                sb.deleteCharAt(sb.indexOf(",")));

        // Delete everything after where the comma used to be..
        System.out.println("sb.delete(11,sb.length()) = " +
                sb.delete(11, sb.length()));

        // Now reverse the entire string
        sb.reverse();
        System.out.println("sb after reverse() method called = " + sb);

        // You can assign the reverse method's result to a
        // different StringBuilder variable...
        System.out.println(sb);
        StringBuilder rb = sb.reverse();
        System.out.println("(rb == sb) = " + (rb == sb));

        // Now you have two StringBuilder references pointing to the
        // same mutable text
        System.out.println(rb);
        sb.append(" How are you?");
        System.out.println("sb = " + sb);
        System.out.println("rb = " + rb);

        String subString = sb.substring(0, 5);
        System.out.println("subString = " + subString);
        System.out.println(sb);
    }
}
