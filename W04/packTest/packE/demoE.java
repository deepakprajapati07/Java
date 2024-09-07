class E {
    private int data = 40;
    public void msg() {
        System.out.println("Class E: Hello Java!, Data : " + data);
    }
}
public class demoE {

    public static void main(String args[]) {
        // private data2 = 100;     // Will give error
        // public data3 = 200;     // Will give error

        // data cannot be declared with any kind of access modifier in main
        // data should be declared with default access modifier in main

        int data4 = 300;

        E obj = new E();
        System.out.println("Class E : " + data4);
        obj.msg();
    }
    
}
