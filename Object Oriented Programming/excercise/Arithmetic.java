import java.util.Scanner;

import javax.swing.JOptionPane;

public class Arithmetic {
    public static void main(String[] args)  {
        
        int a=10;
        int b=5;
        int c=20;
        int total;
        int result;

        //ADDITION
        Addition obj = new Addition();
        total= obj.additionNum(a, b);
        result=obj.sumNum;
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Addition of 2 numbers = "+total);
        System.out.println("Sum Num = "+result);

        total= obj.addthreenum(a, b, c);
        System.out.println("Addition of 3 numbers = "+total);



        //SUBTRACTION
        Subtraction obj1 = new Subtraction();
        total= obj1.subtractionNum(a, b);

        System.out.println("Subtraction = "+total);

        Multiplication obj2 = new Multiplication();
        total = obj2.multiplicationNum(a, b);
        System.out.println("Multiplication = "+total);

        Division obj3 = new Division();
        total = obj3.divisionNum(a, b);
        System.out.println("Division = "+total);
    }



    // public static void addition (int x, int y)
    // {
    //     int c;
    //     c=x+y;
    //     System.out.println("Addition = "+c);
    // }
}
