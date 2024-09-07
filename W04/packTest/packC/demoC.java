// demo C

class C {
    public int data = 10;
    public void msg() {
        System.out.println("Class C: Hello Java!");
    }
}

public class demoC {

    public static void main(String args[]) {
        C obj = new C();
        System.out.println(obj.data);
        obj.msg();
    }
    
}
