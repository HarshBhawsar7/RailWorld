package Day7_String;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
//        String str = "Harsh Bhawsar";
////        reversing String
//        char[] ar=str.toCharArray();
//
//        for (int i = ar.length-1; i >=0 ; i--) {
//            System.out.print(ar[i]);
//        }

        StringBuilder sb =new StringBuilder();
        Scanner sc=new Scanner(System.in);
        sb.append(sc.nextLine());
        System.out.println(sb);
        System.out.println(sb.getClass());

    }
    }

