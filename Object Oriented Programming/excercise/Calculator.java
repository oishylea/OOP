import java.util.Scanner;
import javax.swing.JOptionPane;

public class Calculator {
    public static void main(String[] args) throws Exception {

        //Student obj =new Student();

        //Scanner input = new Scanner(System.in);
        JOptionPane.showMessageDialog(null,"Temperature Calculator");
        String input1 = JOptionPane.showInputDialog("Enter Fahrenheit:");
        float fahr = Float.parseFloat(input1);

        String input2 = JOptionPane.showInputDialog("Enter Celsius:");
        float celsius =Float.parseFloat(input2);


        //Instantiate object
        //Class      objectname     function
        CelsiusToFahr object1 = new CelsiusToFahr();
        float newfahr=object1.convertToFahr(celsius);

        FahrToCelsius object2 = new FahrToCelsius();
        float newcelsius=object2.convertToCelsius(fahr);

        //input1 enter the value of fahr
        //input2 enter the value of celsius
        
        JOptionPane.showMessageDialog(null, input1+" Fahrenheit = " + newcelsius+" Celsius\n"+
                                                            input2+" Celsius = " + newfahr+" Fahrenheit");
    }
}
