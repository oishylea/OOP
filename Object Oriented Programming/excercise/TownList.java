import java.util.ArrayList;

public class TownList {
    public static void main(String[] args) {
        // Create an ArrayList to store town names
        ArrayList<String> students = new ArrayList<>();

        // Add some town names to the list
        students.add("Siti");
        students.add("Ahmad");
        students.add("Khairul");
        students.add("Siti");



        // Print the size of the ArrayList
        System.out.println("Size of townList: " + students.size());
        for(int i=0; i<students.size();i++){
            System.out.print(students.get(i)+"\n");
        }

        students.remove(0);
        System.out.print("Remove index 1");
        students.remove("Siti");

        System.out.println("\nwhen using System.out.print(students);\n"+students);
        System.out.println("Size of townList: " + students.size());

}
}
