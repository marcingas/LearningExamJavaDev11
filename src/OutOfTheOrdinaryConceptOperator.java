public class OutOfTheOrdinaryConceptOperator {
    public static void main(String[] args) {
//        byte byte1 = 1;
//        var byte2 = +byte1;  // What is byte2?
//        System.out.println(byte2);
//        System.out.println("byte2" + TestVar(byte2));
//
//        var negativeByte = -byte1;
//        System.out.println("negativeByte" + TestVar(negativeByte));
//
//        short short1 = 2;
//        var result = byte1 + short1;
//        System.out.println(result);
//        System.out.println("result" + TestVar(result));
//
//        long long1 = 10L;
//        var result2 = long1 + (1.0);
//        System.out.println(result2);
//        System.out.println("result2" + TestVar(result2));
//    }
//
//    // This method works because of the way Java
//    // autoboxes and evaluates method parameters...
//    public static String TestVar(Object var) {
//        String returnValue = " is unknown";
//        if (var instanceof Byte) {
//            returnValue = " is a byte";
//        } else if (var instanceof Character) {
//            returnValue = " is a char";
//        } else if (var instanceof Short) {
//            returnValue = " is a short";
//        } else if (var instanceof Integer) {
//            returnValue = " is an int";
//        } else if (var instanceof Long) {
//            returnValue = " is a long";
//        } else if (var instanceof Double) {
//            returnValue = " is a double";
//        } else if (var instanceof Float) {
//            returnValue = " is a float";
//        }
//        return returnValue;
        int number = 10;
        int result = 0;
        number -=1;
        System.out.println(number);
        System.out.println("----------  First Test --------------");
        // result = --number - number--
        // result always resolves to zero
        // Test a couple of instances with a for loop
        for (int i = 10; i <= 50; i += 10) {
            number = i;
            result = --number - number--;

            System.out.println("i = " + i + ", number = " + number +
                    ", result = " + result);
        }

        System.out.println("----------  Second Test --------------");
        // int result = number-- - --number;
        // result is always the number 2
        // Test with a few examples in a for loop
        for (int i = 10; i <= 50; i += 10) {
            number = i;
            result = number-- - --number;
            System.out.println("i = " + i + ", number = " + number +
                    ", result = " + result);
        }

        System.out.println("----------  Third Test --------------");
        // Just complicating matters a bit more.
        for (int i = 10; i <= 20; i += 10) {
            number = i;
            result = number-- - number++ * --number;
            System.out.println("i = " + i + ", number = " +
                    number + ", result = " + result);
        }

        System.out.println("----------  Fourth Test --------------");
        // (number--) == (number += 1)
        // evaluates to true!
        number = 10;
        boolean isEqual = (number--) == (number += 1);
        System.out.println("isEqual = " + isEqual +
                ", and number = " + number);
        short a = 10;
        short b = 5;
        char c = 3;
        a *= b -= c--;

        System.out.println("----------  Final Test --------------");
        // number = number--;
        // value in number stays unchanged
        number = 10;
        number = number--;
        System.out.println("number = " + number);
    }
}
