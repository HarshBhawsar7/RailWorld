package Day6.Array;

public class SumOfElements {
    public static void main(String[] args) {
        int[] arr ={22,44,1,3,7,55};
        int sum=0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println("Sum Of All Elements :"+sum);
    }
}
