import java.util.ArrayList;

//ArrayList

public class Cuba {
    public static void main(String[] args) {
        ArrayList<String> student = new ArrayList<>();
        System.out.println("-----Original List------");

        student.add("Siti Rahimah");
        student.add("Robert Lau");

        for (String s : student) {
            System.out.println(s);
        }

        if (!student.isEmpty()) {
            student.set(0, "Muhammad");
        }

        System.out.println("\n-----Updated List------");
        for (String s : student) {
            System.out.println(s);
        }
    }
}