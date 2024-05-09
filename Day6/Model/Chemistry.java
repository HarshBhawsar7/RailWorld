package Day6.Model;

public class Chemistry {
    private int marks;


    public Chemistry(){

    }
    public Chemistry(int marks) {
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
        return "Chemistry{" +
                "marks=" + marks +
                '}';
    }
}
