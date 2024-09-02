public class Student {
    
    private int studId;
    private String studName;

    public Student(int sid, String sname){
        studId = sid;
        studName = sname;
    }

    public void setstudId(int sid){
        studId = sid;
    }

    public void setstudName(String sname){
        studName = sname;
    }

    public int getstudId() {
        return studId;
        }

    public String getstudName() {
        return studName;
        }

    public void displayStud() {
        System.out.println("Student ID: " + studId);
        System.out.println("Student Name: " + studName);
    }
        

}
