import myInterface.*;

public class Demo1 implements anInterface {

    // Implementing abstract method
    public void display() {
        System.out.println("All Good.");
    }

    // main method
    public static void main(String args[]) {
        Demo1 t = new Demo1();
        t.display();
        System.out.println("The final value a in myInterface : " + a);
    }
    
}
