package Day4;

public class TypesOfFunction {

    public void math1(){
        System.out.println("Hello From Method 1");
    }

//    parameter passing
    public void math2(int a,int b){
        System.out.println("Sum From Method 2 ="+(a+b));
    }

//    returning value

    public int math3(int a){
        return a+2;
    }

//    Static Methods
    static void sum(int a,int b){
        int c=a+b;
        System.out.println("Sum of Two Num with Static Method "+c);
    }
    public static void main(String[] args) {
        TypesOfFunction.sum(2,9);
        TypesOfFunction fs=new TypesOfFunction();
        fs.math1();
        fs.math2(2,6);
        int rs=fs.math3(3);
        System.out.println("Method 3rd :"+rs);
    }

}
