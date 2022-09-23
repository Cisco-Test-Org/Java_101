package lam01;

public class Main {
    public static void main(String[] args) {
        Printable lambdaExp = (s) -> "Meaw" + s;
        printThing(lambdaExp);
        System.out.println("print");
    }


    static void printThing(Printable thing) {
        thing.print("!");
    }
}
