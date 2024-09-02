import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        
        //File file = new File("filename.txt");

        String filePath = "C:\\Users\\Izzah Alia\\Downloads\\exercise5\\exercise5\\src\\Sales.txt";
        int[] salesData = readSalesData(filePath);
    
        displaySalesData(salesData);
    
        int total = calculateTotal(salesData);
        System.out.println("Total sales: RM" + total);
    
        int highest = highest(salesData);
        System.out.println("Highest sale: RM" + highest);
    }
    

    public static int[] readSalesData(String filename) {
        int[] sales = new int[7]; // Assuming 7 days of the week
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            int index = 0;
            while (scanner.hasNextInt()) {
                sales[index] = scanner.nextInt();
                index++;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }
        return sales;
    }

    public static void displaySalesData(int[] salesData) {
        System.out.println("Sales data:");
        for (int i = 0; i < salesData.length; i++) {
            System.out.println("Day " + (i + 1) + ": " + salesData[i]);
        }
    }

    public static int calculateTotal(int[] salesData) {
        int total = 0;
        for (int sales : salesData) {
            total += sales;
        }
        return total;
    }

    public static int highest(int[] salesData) {
        int maxSale = Integer.MIN_VALUE;
        for (int sales : salesData) {
            if (sales > maxSale) {
                maxSale = sales;
            }
        }
        return maxSale;
    }
}