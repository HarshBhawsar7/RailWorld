package Day6.Array;

import java.util.Arrays;
import java.util.Scanner;

public class MaxInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int max=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        for (int j = 0; j < arr.length ; j++) {
            if (max<arr[j]){
                max=arr[j];
            }
        }
        System.out.println("Max Num In Array :"+max);
    }
}
