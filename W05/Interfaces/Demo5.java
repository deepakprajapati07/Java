// Multiple Inheritance with interfaces

class C {
    protected int i = 1000;
    public void print() {
        System.out.println("I am from class C : " + i);
    }
}

interface D {
    public static int j = 555;
    void printInterfaceD();
}

interface E {
    public static int k = 666;
    void printInterfaceE();
}

class F extends C implements D, E {
    public int fValue = 999;

    public void printInterfaceD() {
        System.out.println("I am from D : " + j);
    }

    public void printInterfaceE() {
        System.out.println("I am from E : " + k);
    }

    public void printF() {
        super.print();
        printInterfaceD();
        printInterfaceE();
    }
}

public class Demo5 {

    public static void main(String args[]) {
        F f = new F();
        f.printF();
    }
    
}
