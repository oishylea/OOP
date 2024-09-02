import java.util.Scanner;
public class TempConv {
    public static void main(String[] args) throws Exception {


        int f;
        int c;
        double celcius;
        double fahr;

        //Student obj =new Student();


        Scanner input = new Scanner(System.in);

        System.out.print("Enter Fahrenheit:");
        f=input.nextInt();

        System.out.print("Enter Celcius:");
        c=input.nextInt();


        //Instantiate object
        //Class      objectname     function
        Converter obj = new Converter();

        fahr=obj.convertToFahr(c);
        celcius=obj.convertToCelcius(f);

        System.out.println("\n------------------------------------\n");
        System.out.println(c+"C to Fahrenheit: " + fahr+"F");
        System.out.print("\n");
        System.out.println(f+"F to Celcius:"+ celcius+"C");
        System.out.print("\n");

    }
}
