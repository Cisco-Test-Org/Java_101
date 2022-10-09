package Liskov1;

public class Main {
    public static void main(String[] args) {

        B b = new B();
        b.print();
        b.parentPrint();
        b.childPrint();
        System.out.println(b.nameOfA);
        System.out.println(b.nameOfB);


        A a1 = new A();
        a1.print();
        a1.parentPrint();
        System.out.println(a1.nameOfA);

        A a2 = new B();
        a2.print();
        a2.parentPrint();
        System.out.println(a2.nameOfA);
    }
}
