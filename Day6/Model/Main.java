package Day6.Model;

public class Main {
    public static void main(String[] args) {
        Student std=new Student();

        std.setName("Harsh");
        std.setBatch("Section A");
        std.setAdd("VN,Indore");
        std.setSid(101);
        std.setCms(new Chemistry(66));
        std.setMs(new Maths(70));
        std.setPs(new Physics(46));

        System.out.println(std.toString());
    }
}
