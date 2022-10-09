package openColse;

public class Teacher extends User {
    private int experience;
    private String stream;

    public Teacher(String userName, String password, int experience, String stream) {
        super(userName, password);
        this.experience = experience;
        this.stream = stream;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }
}
