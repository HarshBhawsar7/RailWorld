package Day16.Overview;

import java.util.Arrays;

public class ArrayUnionIntersection {
    public static void main(String[] args) {
        int arr[]={1,3,4,5,9};
        int arr2[]={2,3,5,7,8};
        int union[]=new int[arr.length+arr2.length];
    int index=0;
        for (int i = 0; i <arr.length ; i++) {
            union[i] = arr[i];
            index=i;
        }

            for (int j = 0; j < arr2.length; j++) {
                for (int k =j+1; k < union.length ; k++) {
                    if (union[j] != arr2[j]) {
                        union[index]=arr2[j];
                    }
                }
            }

        System.out.println(Arrays.toString(union));

    }
}
