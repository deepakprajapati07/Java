package myPackage;

public class Balance {
    String name;
    double bal;

    public Balance(String n, double b) {
        name = n;
        bal = b;
    }

    public void show() {
        if (bal < 0) {
            System.out.println(name + " : Sorry! Negative balance");
        } else {
            System.out.println(name + " : Rs." + bal);
        }
    }
    
}
