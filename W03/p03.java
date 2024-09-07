class A {
    int i;
    void display() {
        System.out.println(i);
    }
}

class B extends A {
    int j;
    void display() {
        super.display();
        System.out.println(j);
    }
}

public class p03 {

    public static void main(String args[]) {
        B obj = new B();
        obj.i = 1;
        obj.j = 2;
        obj.display();
    }
    
}
