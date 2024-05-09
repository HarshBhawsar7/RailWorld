package Day3;

import java.util.Scanner;

public class Swaping {
    public static void main(String[] args) {

//        swaping
        Scanner sc= new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        System.out.println("a= "+a+" b= "+b);
//         a=a+b;
//         b=a-b;
//         a=a-b;
//        System.out.println("a= "+a+" b= "+b);
        int a = 10;
        int b = 20;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a= "+a+" b= "+b);
    }
}
