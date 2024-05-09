package Day3;

public class SecondLargestNum {
    public static void main(String[] args) {
        int[] arr={10,67,67,19,49,48,49,9,1};
        int max=0;
        for (int j = 0; j < arr.length ; j++) {
            if (max<arr[j]){
                max=arr[j];
            }
        }
        int sec_Max=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<max){
               if(sec_Max<arr[i]){
                   sec_Max=arr[i];
               }
            }
        }
        System.out.println("Second Largest Element Of Array :"+sec_Max );
    }

}