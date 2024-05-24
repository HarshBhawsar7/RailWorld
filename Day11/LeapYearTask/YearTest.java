package Day11.LeapYearTask;

import Day9_Inheritance_Polymorphism.Hierarchical.Son;

import java.util.Scanner;

public class YearTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Year");
        int year= sc.nextInt();
        if ((year % 4 == 0) && (year % 400 == 0) || (year % 100 == 0))
        {
            System.out.println(year+" is Leap Year");
        }
        else {
            System.out.println(year+" Not a Leap Year");
        }
    }
}
