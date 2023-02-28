public class UnaryOperators {
    public static void main(String[] args) {
//        System.out.println("----------Test 1 ----------");
//        int a = 0;
//        // If you do no assignment and the operator is not participating
//        // in a more complex expression the following statements are the
//        // same.  the value in variable a gets incremented by 1
//        a = 1;
//        ++a;  // a = a+1
//        System.out.println("a after ++a = " + a);
//        a = 1;
//        a++;  // a = a+1
//        System.out.println("a after a++ = " + a);
//
//        // What happens if we do this?
//        System.out.println("----------Test 2 ----------");
//        a = 1;
//        System.out.println("a after ++a = " + ++a);
//        a = 1;
//        System.out.println("a after a++ = " + a++);
//
//        System.out.println("And now the value of a is: " + a);
//
//        System.out.println("----------Test 3 ----------");
//// Let's look at postfix increment in a variable declaration
//        a = 1;
//        int a2 = a++;
//        System.out.println("The value of a is " + a);
//        System.out.println("The value of a2 is " + a2);
//
//        // Let's look at postfix in an expression...
//        a = 1;
//        if (++a == 1) {
//            System.out.println("If Statement, now the value of a is " + a);
//        }
//        System.out.println("----------End 3 ----------");
//
//        System.out.println("----------Test 4 ----------");
//        int b = 5;
//        int loopiterations = 0;
//        while (--b > 0) {  // Use a prefix decrement
//            int i = loopiterations++;
//            System.out.println("b" +b);
//            System.out.println("loopI"  + i);
//        }
//        System.out.println("Prefix decrement operator used, loopiterations = " +
//                loopiterations + ", b = " + b);
//
//        // Reset values, all things equal except the type of increment operator
//        b = 5;
//        loopiterations = 0;
//        while (b-- > 0) {  // Use a postfix decrement
//            int i = loopiterations++;
//            System.out.println("b" +b);
//            System.out.println("loopI"  + i);
//        }
//        System.out.println("Postfix decrement operator used, loopiterations = " +
//                loopiterations + ", b = " + b);
        // unary Minus
        int a = 1, b = -a;

        // Note that the value of actual operand a does not change
        System.out.println("a = " + a + "; b = " + b);
        a = -1;
        b = -a;
        System.out.println("a = " + a + "; b = " + b);

        //  Unary Plus
        a = 1;
        b = +a;  // Not to mistaken for b+=a;
        System.out.println("a = " + a + "; b = " + b);
        a = -1;
        b = +a;
        System.out.println("a = " + a + "; b = " + b);


        // Bitwise Complement Operator  ~a
        // when value is x then ~x = (-x)-1;
        int bin1 = 0b00000000_00000000_00000000_00000000;
        int bin2 = ~bin1;

        System.out.println("bin1 = " + bin1 +
                " (" + Integer.toBinaryString(bin1) + "), " +
                "bin2 = " + bin2 +
                " (" + Integer.toBinaryString(bin2) + ")");


        // Logical Complement Operator  !a
        boolean myBoolean = false;
        boolean newBoolean = !myBoolean;
        System.out.println("myBoolean = " + myBoolean +
                ", the opposite is = " + newBoolean);
    }
}
