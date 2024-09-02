import javax.swing.JOptionPane;

public class MyJOptionPane {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Sum Calculator" );
        String input1 = JOptionPane.showInputDialog("Value 1:");
        String input2 = JOptionPane.showInputDialog("Value 2:");
        
        // Parse the input strings to integers
        int val1 = Integer.parseInt(input1);
        int val2 = Integer.parseInt(input2);
        
        // Perform arithmetic operation
        int total = val1 + val2;
        
        // Display the result
        JOptionPane.showMessageDialog(null, val1 + " + " + val2 + " = " + total);

        double price;
        String str;
        str =JOptionPane.showInputDialog("Enter the retail price.");
        price =Double.parseDouble(str);
        JOptionPane.showMessageDialog(null,"RM "+price);
    }
}
