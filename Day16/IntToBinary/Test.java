package Day16.IntToBinary;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        int num=13;
        int ar[]=new int[35];
        int r=0;
        while (num!=0){
            ar[r++]=num%2;

            num/=2;
        }
        for (int i = r - 1; i >= 0; i--)
            System.out.print(ar[i] + "");
    }

    }
