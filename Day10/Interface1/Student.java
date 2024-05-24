package Day10.Interface1;

public class Student implements First{
    private String name;
    private int rollNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public void display() {
        System.out.print(name);
    }

    @Override
    public int showRollNo() {
        return rollNo;
    }
}
