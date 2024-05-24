package Day12.Collection;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PracArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
//        arrayList.add("Hello");
//        arrayList.add("Hii");
//        arrayList.add("Hie");
////        arrayList.add("Bye");
//        arrayList.remove(1);
//        for(String i:arrayList){
//            System.out.println(i);
//        }

        ArrayList<Employee> arrayList1=new ArrayList<>();
        //Employee employee = null;
        Employee employee1=new Employee(2,"Harsh","IT");
        Employee employee2=new Employee(1,"Raj","HR");
        arrayList1.add(employee1 );

        arrayList1.add(employee2);
       arrayList1.remove(employee1);
       System.out.println(arrayList1);
//        Collections.sort(arrayList1,new EmployeeIdComparator());
//        for(Employee employee:arrayList1){
//            System.out.println(employee);
        }

//        Set<Employee> set = new HashSet<>();
//        set.add(employee1);
//        set.add(employee2);
//        System.out.println("set "+ set);
        //Set<Integer>set1 =new HashSet<>();
//        Scanner sc=new Scanner(System.in);
//        Employee employee=new Employee(sc.nextInt(),sc.nextLine(),sc.next());
//        System.out.println(employee.toString());

    }

