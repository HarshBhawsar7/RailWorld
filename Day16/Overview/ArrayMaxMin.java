package Day16.Overview;

import java.util.Arrays;

public class ArrayMaxMin {
    public static void main(String[] args) {
        int arr[]={21,1,6,4,9,8,7};
        int max_4=4;
        int min_2=2;
        Arrays.sort(arr);
            System.out.println(arr[arr.length-max_4]);
        System.out.println(arr[0+min_2]);

    }
}
