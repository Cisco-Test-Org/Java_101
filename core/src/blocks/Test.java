package blocks;

public class Test {

    /* instance initializer block */

    /**
     * the purpose of the instance initializer block is to initialize the instance data members.
     */
    {
        System.out.println("2. instance initializer");
    }

    /* static block */
    /**
     * Static block code executes only once during the class loading.
     * Static initializer blocks always execute before the instance initialization
     * blocks because static blocks run at the time of class loading.
     * It can only use static variables.
     */
    static {
        System.out.println("1. static initializer");
    }

    /* constructor */
    public Test() {
        System.out.println("3. constructor");
    }
}
