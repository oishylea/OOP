
import java.util.ArrayList;

public class StudentApp {
    public static void main(String[] args) {
        //Array
        ArrayList<StudentsDoc> stdList = new ArrayList<>();


        StudentsDoc std1 = new StudentsDoc("Ahmad", 3.7);
        StudentsDoc std2 = new StudentsDoc("Zulaikhaa Mwa Mwa", 4.0);


        stdList.add(std1);
        stdList.add(std2);

        System.out.print("Print List of STudents\n");
        for(int i=0; i<stdList.size();i++){
            System.out.print(stdList.get(i)+"\n");
        }
        System.out.print("\n");

        System.out.println(stdList);

    }

}
