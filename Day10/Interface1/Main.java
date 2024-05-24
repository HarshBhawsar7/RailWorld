package Day10.Interface1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student st=new Student(sc.nextInt(),sc.next());
         st.display();
        System.out.print(" "+st.showRollNo());
    }
}
