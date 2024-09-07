class F {
    protected int rollNo = 96;
    protected void msg() {
        System.out.println("Class E: Hello Java! . Roll No : " + rollNo);
    }
}
public class demoF {

    public static void main(String args[]) {
        F obj = new F();
        obj.msg();
        System.out.println("Class E Main : Roll No : " + obj.rollNo);
    }
    
}
