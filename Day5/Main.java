package Day5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name=sc.nextLine();
        System.out.println("Enter your Street");
        String street=sc.nextLine();
        System.out.println("Enter your City");
        String city=sc.next();
        System.out.println("Enter you Pincode");
        int pin=sc.nextInt();
        System.out.println("Enter Your state");
        String state=sc.next();

        Employee emp=new Employee(name);
        Address add=new Address(street,city,pin,state);


        System.out.println("Employee Details :");
        System.out.println(emp.getName());
        System.out.println(add.getStreet());
        System.out.println(add.getCity());
        System.out.println(add.getPin());
        System.out.println(add.getState());


    }
}
