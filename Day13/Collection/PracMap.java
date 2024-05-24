package Day13.Collection;

import Day5.Employee;

import java.util.*;

public class PracMap {
    public static void main(String[] args) {
        Map<Integer,List<Employee>> m=new HashMap();
        Scanner sc=new Scanner(System.in);
        ArrayList<Employee> ar=new ArrayList<>();
        System.out.println("Enter Your Name");
        ar.add(new Employee(sc.next()));
        System.out.println("Enter Your Name");
        ar.add(new Employee(sc.next()));
        m.put(1,ar);
        System.out.println(m);

    }
}
