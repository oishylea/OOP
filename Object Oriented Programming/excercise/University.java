public class University {
    
    private String uniName;

    public University(String uName){
        uniName = uName;
    }

    public void setuniName(String uName){
        uniName = uName;
    }

    public String getuniName() {
        return uniName;
        }

    
    public Student findStudent(int studId) {
            return new Student(studId, "Wan Haziq");
        }
    
    public Course checkCourse(String courseCode) {
        Course[] courses = {new Course("CS101", "Object Oriented Programming"),
                            new Course("CS102", "Data Structures")};

        for (Course course : courses) {
            if (course.getcourseCode().equals(courseCode)) {
            return course;
            }
        }

    return null;    
    }   

    public static void main(String[ ] args) {

        Student s1 = new Student(1, "Aufa Hanina");
        Student s2 = new Student(2, "Afiah Nasuha");
        
        s1.displayStud();
        s2.displayStud();

        System.out.println("\n--------------NEW DATA AFTER CALLING ADDITIONAL METHOD WITH NEW STUDENT--------------");
        University myUniversity = new University("My University");

        System.out.println("\nFinding student name with studId = 1....");
        Student foundStud = myUniversity.findStudent(1);
        foundStud.displayStud();


        Course foundCourse = myUniversity.checkCourse("CS102");
        System.out.println("\nFinding student name with courseCode = CS102....");

        if (foundCourse != null) {
            System.out.println("Course found: " + foundCourse.getcourseName());
        } else {
            System.out.println("No course found");
        }
            
        }
}
