class Parent {
    String name = "parent";
    String message() {
        return "from parent";
    }
}

class Child extends Parent {
    String name = "Child";
    String message() {
        return "from child";
    }
}

public class p06 {

    public static void main(String args[]) {
        Parent p = new Child();
        System.out.println(p.name + " " + p.message());
    }
    
}
