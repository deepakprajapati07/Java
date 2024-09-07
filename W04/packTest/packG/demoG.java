class Base {
    public int x  = 10;
    private int y = 20;
    protected int z = 30;
    int a = 40; // Implicit default access modifier

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    private int getY() {
        return y;
    }

    private void setY(int y) {
        this.y = y;
    }

    protected int getZ() {
        return z;
    }

    protected void setZ(int z) {
        this.z = z;
    }

    int getA() {
        return a;
    }

    void setA(int a) {
        this.a = a;
    }
}

public class demoG extends Base {

    public static void main(String args[]) {
        Base rr = new Base();

        rr.z = 0;
        demoG subClassObj = new demoG();

        // public
        System.out.println("Value of x : " + subClassObj.x);
        subClassObj.setX(20);
        System.out.println("New value of x : " + subClassObj.x);

        // private : not accessible in inherited class
        // System.out.println("Value of y : " +  subClassObj.y);
        // subClassObj.setY(100);
        // System.out.println("New value of y : " + subClassObj.y);

        // protected
        System.out.println("Value of z : " + subClassObj.z);
        subClassObj.setZ(200);
        System.out.println("New value of z : " + subClassObj.z);

        // Default
        System.out.println("Value of a : " + subClassObj.a);
        subClassObj.setA(300);
        System.out.println("New Value of a : " + subClassObj.a);

    }
    
}
