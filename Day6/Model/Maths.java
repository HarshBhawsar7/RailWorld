package Day6.Model;

public class Maths {
    private int marks;

    public Maths(){

    }
    public Maths(int marks) {
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
        return "Maths{" +
                "marks=" + marks +
                '}';
    }
}
