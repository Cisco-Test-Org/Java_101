package openColse;

public class Student extends User {
    private double marks;
    private String courseId;

    public Student(String userName, String password, double marks, String courseId) {
        super(userName, password);
        this.marks = marks;
        this.courseId = courseId;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "marks=" + marks +
                ", courseId='" + courseId + '\'' +
                '}';
    }
}
