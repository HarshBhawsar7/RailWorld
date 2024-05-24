package Day10;

public class Fibonacci {

    static int fib(int num)
    {
        if (num == 0 || num == 1)
            return num;

        return fib(num - 1) + fib(num - 2);
    }
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.print(fib(i)+" ");
        }

//        Scanner sc=new Scanner(System.in);
//
//        int num1=0,num2=1,num3,count;
//        count=sc.nextInt();
//        System.out.print(num1+" "+num2);//printing 0 and 1
//
//        for(int i=2;i<count;++i)
//        {
//            num3=num1+num2;
//            System.out.print(" "+num3);
//            num1=num2;
//            num2=num3;
//        }

//        With Recursion



    }
}
