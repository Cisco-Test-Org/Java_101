package singleton;

public class Main {
    public static void main(String[] args) {
        ClassSingleton instance1 = ClassSingleton.getInstance();
        System.out.println(instance1.getInfo());

        ClassSingleton instance2 = ClassSingleton.getInstance();
        instance2.setInfo("New Info Class");
        System.out.println(instance2.getInfo());
        System.out.println(instance1.getInfo());

    }
}
