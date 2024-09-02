import java.util.Scanner;
//import java util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SIZE=3;
        Students[] stud = new Students[SIZE];
        
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Enter matric number for student ");
            int matricNumber = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            System.out.print("Enter name for student ");
            String name = scanner.nextLine();
            System.out.print("Enter course code for student " );
            String course = scanner.nextLine();
            System.out.print("\n");
            stud[i] = new Students(matricNumber, name, course);
        }
        scanner.close();

        System.out.println("\n\nLIST OF STUDENTS");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(stud[i].getMatric()+" "+ stud[i].getName()+" "+stud[i].getCourse()+"\n");

            System.out.println();
        }
        //System.out.println("Total number of students :"+stud.size());
    }

}

//Dalam main,bagi value to constructor