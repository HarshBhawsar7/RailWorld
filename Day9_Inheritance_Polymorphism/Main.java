package Day9_Inheritance_Polymorphism;

public class Main extends ClassA {
    public void display(){
        System.out.println("Hello From Main");
    }
    public static void main(String[] args) {
        Main m=new Main();
        m.display();

    }
}
