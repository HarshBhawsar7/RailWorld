package Day4;

interface InterfacesPrint {

        void print();
    }
    class Print implements InterfacesPrint{
        public void print()
        {
            System.out.println("Hello From Interface Methode");
        }

        public static void main(String args[]){
            Print obj = new Print();
            obj.print();
        }
    }

