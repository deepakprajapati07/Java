// SWING in Java

import javax.swing.*;

public class Demo1 extends JFrame {

    JFrame f;
    Demo1() {
        f = new JFrame();
        JButton b = new JButton("click");
        b.setBounds(130, 100, 100, 40);
        f.add(b);
        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String args) {
        new Demo1();
    }

}