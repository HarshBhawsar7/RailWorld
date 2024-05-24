package Day14.LemdaFunction;

import java.util.ArrayList;

public class PracLemda {
    public static void main(String[] args) {

        ArrayList<Integer> arrL = new ArrayList<Integer>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);

        // Using lambda expression to print all elements
        arrL.forEach(n -> System.out.print(n+" "));
        System.out.println();

//         print even elements

        arrL.forEach(n -> {
            if (n % 2 == 0)
                System.out.print("Even Num :"+n+" ");
        });
    }
}
