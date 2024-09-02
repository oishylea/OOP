import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RainfallArray {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\Izzah Alia\\Downloads\\exercise5\\exercise5\\src\\Rainfall.txt";

        double[] rainfall = new double[6]; 
        
        try {
            Scanner scanner = new Scanner(new File(filePath));

            int index = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split("\\s+"); 
                rainfall[index] = Double.parseDouble(parts[1]); 
                index++;
            }
            scanner.close();
            double sum=0;
            System.out.println("Rainfall data:");
            for (int i = 0; i < rainfall.length; i++) {
                System.out.println("Month" + (i + 1) + ": " + rainfall[i]);
                sum=sum+rainfall[i];
            }
            System.out.println("\nSum of amount of rainfall: "+sum);

            double highest = rainfall[0];
            for (int i = 1; i < rainfall.length; i++) {
                if (highest < rainfall[i]) {
                    highest = rainfall[i];
                }
            }
            System.out.println("Highest amount of rainfall: " + highest+"\n");
            


        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Error parsing rainfall data.");
            e.printStackTrace();
        }


    }
}
