package singleton;

public final class ClassSingleton {

    private static ClassSingleton instance;
    private String info = "Initial Info Class";

    private ClassSingleton() { }

    public static ClassSingleton getInstance() {
        if(instance == null) {
            instance = new ClassSingleton();
        }
        return  instance;
    }

    // getters and setters

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
