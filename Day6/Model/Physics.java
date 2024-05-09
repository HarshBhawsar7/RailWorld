package Day6.Model;

public class Physics {
    private int marks;

    public Physics() {

    }

    public Physics(int marks) {
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Physics{" +
                "marks=" + marks +
                '}';
    }
}