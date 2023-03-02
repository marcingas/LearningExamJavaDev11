public class SwithcQuest {
    public static void main(String[] args) {
        String[] strs = {"A", "B", "C", "D"};
        // This example of the switch statement demonstrates fall through
        // and the default label in a spot other than the last spot
        int iteration = 0;
        for (String s : strs) {
            System.out.println("-----------iteration " +
                    (++iteration) + ", s=" + s + " -------------------");
            switch (s) {
                case "A":
                    System.out.println("DO A");
                default:
                    System.out.println("DOING THIS");
                case "B":
                    System.out.println("DO B");
                case "C":
                    System.out.println("DO C");
            }

        }
        // Example of a switch statement with expression based on
        // compile time constants in the case label
        String str = "";

        String test = "12";
        switch (test) {
            case ("1"):
                System.out.println("Output is 1");
                break;
            case ("1" + "2"):  // concatenation operator in expression.
                System.out.println("Output is 12");
                break;
            case ("2"):
                System.out.println("Output is 2");
                break;
            default:
                System.out.println("Output is default");
        }
        // Example of a Switch statement with an expression in
        // the switch evaluation
        for (int i = 0; i < 4; i++) {
            System.out.println("-----------iteration " +
                    ((i + 1)) + " -------------------");

            switch (i * 10) {  // expression allowed here
                case 10:
                    System.out.println("result is 10");
                    break;
                case 20:
                    System.out.println("result is 20");
                    break;
                case (30):
                    System.out.println("result is 30");
                    break;
                default:
                    System.out.println("result for default, i =" + i);
            }

        }
    }
}
