package Day10.Comparable;

public class Student1 implements Comparable<Student1> {
    private String name;
    private int marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public Student1(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student1 st) {
        if (marks<st.getMarks())
            return -1;
        if (marks> st.getMarks())
            return 1;
        return 0;
    }
}
