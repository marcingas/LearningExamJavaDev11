class ASuperClass {
    String name = "Me Super";
    static{

        System.out.println("static superclass");

    }
    {

        System.out.println("init superclass" + name);

    }


    // Constructor for Super Class
    ASuperClass() {
        System.out.println("Parent constructor executes" + name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "to string super: My name is " + this.name;
    }
}

class ASubClass extends ASuperClass {

    // Constructor for Sub Class
    ASubClass() {
        System.out.println("Child no args constructor executes" + name);
        setName(name);
    }

    // Constructor for Sub Class
    ASubClass(String name) {
        super();
        System.out.println("Child single argument constructor executes" + name);
        setName(name);
    }

    // Initializer code
    {
//        this.name = "Override";
        System.out.println("Child initializer executes"  + this.name);
        System.out.println(this);
    }
    static{

        System.out.println("static init child" );

    }

}

public class InitializerOddsAndEnds {
    public static void main(String[] args) {
        ASubClass joe = new ASubClass("Joe which was assign in child class and used to String of superclass");
        System.out.println(joe);
    }
}