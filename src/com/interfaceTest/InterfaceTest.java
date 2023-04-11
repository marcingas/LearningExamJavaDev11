package com.interfaceTest;

interface InterfaceExample {

    // Define some variables

    // no modifiers at all
    String interfaceName = "InterfaceExample";

    // single modifer
    static String staticInterfaceName = "StaticInterfaceExample";
    public String publicInterfaceName = "PublicInterfaceName";
    final String finalInterfaceName = "FinalInterfaceName";

    // double modifiers
    public final String publicFinalInterfaceName = "PublicFinalInterfaceName";
    static final String staticFinalInterfaceName = "StaticFinalInterfaceName";

    // triple modifiers
    public static final String publicStaticFinalInterfaceName = "PublicStaticFinalInterfaceName";

}

public class InterfaceTest {
    public static void main(String[] args) {

        // Regardless of how you define it, a variable on an interface is
        // public static final
        System.out.println("All fields on an interface are" +
                " public static final:");
        System.out.println(InterfaceExample.interfaceName);
        System.out.println(InterfaceExample.staticInterfaceName);
        System.out.println(InterfaceExample.publicInterfaceName);
        System.out.println(InterfaceExample.finalInterfaceName);
        System.out.println(InterfaceExample.publicFinalInterfaceName);
        System.out.println(InterfaceExample.staticFinalInterfaceName);
        System.out.println(InterfaceExample.publicStaticFinalInterfaceName);

    }
}
