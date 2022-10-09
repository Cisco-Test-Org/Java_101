package Liskov1;

public class B extends A {
    String nameOfB = "B";

    @Override
    public void print() {
        System.out.println("printing class B");
    }

    public void childPrint() {
        System.out.println("Hello from B");
    }
}
