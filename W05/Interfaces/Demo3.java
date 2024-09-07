// Multiple Inheritance

interface I3 {
    int i = 123;
    void printI3();
}

interface I4 {
    public static int j = 555;
    void printI4();
}

class B1 implements I3, I4 {
    public int bValue = 999;

    public void printI3() {
        System.out.println("I am from I3 : " + i);
    }

    public void printI4() {
        System.out.println("I am from I4 : " + j);
    }

    public void printB() {
        System.out.println("I am from B : " + (bValue = i + j));
    }
}

public class Demo3 {

    public static void main(String args[]) {
        B1 b = new B1();
        b.printB();
        b.printI3();
        b.printI4();
    }
    
}
