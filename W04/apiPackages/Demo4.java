
import myPackage.Balance;

public class Demo4 {

    public static void main(String args[]) {
        Balance current[] = new Balance[3];

        current[0] = new Balance("Deepak", 100.00);
        current[1] = new Balance("Kumar", -50.00);
        current[2] = new Balance("Prajapati", 200.00);

        // Displaying the balance
        for (int i=0; i<3; i++) {
            current[i].show();
        }
    }
    
}
