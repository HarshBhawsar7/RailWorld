package Day16.Overview;

import java.util.Scanner;

public class TestTernary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c= sc.nextInt();

        int ans= (a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println("Greatest Number ="+ans);
    }
}
