package Day10.RecursionTask;

public class ArmstrongNumber {
    public static boolean ArmstrongNumber(int num) {
        int numDigits = (int) Math.log10(num) + 1;
        int sum = ArmstrongSum(num, numDigits);
        return sum == num;
    }


    public static int ArmstrongSum(int num, int Digits) {
        if (num == 0) {
            return 0;
        }
        int digit = num % 10;
        return (int) Math.pow(digit, Digits) + ArmstrongSum(num / 10, Digits);
    }

    public static void main(String[] args) {
        int no = 111;

        if (ArmstrongNumber(no)) {
            System.out.println(no + " is an Armstrong number.");
        } else {
            System.out.println(no + " is not an Armstrong number.");
        }
    }





}


