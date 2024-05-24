package Day10.Comparable;



public class Main {
    public static void main(String[] args) {
        Student1 st=new Student1("Harsh",280);
        Student1 st2=new Student1("Mohit",260);

        int i=st.compareTo(st2);

        switch (i){
            case -1:
                System.out.println("St2 Has Higher Marks Than St1 ");
                break;
            case 0:
                System.out.println("St2 & St1 Both Have same Marks");
                break;
            case 1:
                System.out.println("St1 Has Higher Marks Than St2 ");
                break;
        }

    }
}
