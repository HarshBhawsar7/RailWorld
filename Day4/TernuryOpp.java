package Day4;

import java.util.Scanner;

public class TernuryOpp {

    public static void main(String[] args) {
//        int a=10,b=15,c=16;
//
//       int result= (a>b)?(a>c?a:c):(b>c?b:c);
//        System.out.println(result);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Bill Amount");
        int bill = sc.nextInt();

        int Ebill = (bill < 100) ? (bill * 2) : (bill < 150) ? 100*2+(bill-100)*3
                : (bill < 200) ? 100*2+50*3+(bill-150)*4 : ( bill < 251) ? 100*2+50*3+50*4+(bill-200)*5:
                (bill<301)?100*2+50*3+50*4+50*5+(bill-250)*6:(bill<500)?100*2+50*3+50*4+50*5+50*6+(bill-300)*7:100*2+50*3+50*4+50*5+50*6+200*7+(bill-500)*8;
        System.out.println(Ebill);
    }
}
