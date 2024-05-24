package Day10.RecursionTask;

public class FactorialOfNumber {
    public static int factorial(int n) {
        if (n == 0) {
            return 1; // base case
        } else {
            return n * factorial(n - 1); // recursive call
        }
    }

    public static void main(String[] args) {
        int number = 5; // Change this to the number you want to calculate the factorial for
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is " + result);
    }

}
