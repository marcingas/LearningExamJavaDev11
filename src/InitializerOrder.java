class OrderedClass {
    static int statementOrder;

    int a = print("assigning a " + statementOrder);

    // initializer 1
    {
        print("initializer 1 " + statementOrder);
    }

    int b = print("assigning b");

    // initializer 2
    {
        print("initializer 2");
    }

    // Constructor
    OrderedClass() {
        print("constructor");
    }

    int c = print("assigning c");

    //  initializer 3
    {
        print("initializer 3");
    }
    static{
        System.out.println("static init");
    }

    // method called from initializers which should help us understand
    // the order of execution
    int print(String message) {
        statementOrder++;
        System.out.println(statementOrder + " " + message);
        return statementOrder;
    }
}

public class InitializerOrder {
    public static void main(String[] args) {
        // Instantiating the object should set off initialization code.
        OrderedClass o = new OrderedClass();
    }
}