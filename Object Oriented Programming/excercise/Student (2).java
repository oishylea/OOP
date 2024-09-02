//Vector

import java.util.Vector;

public class Student {
    private String name;
    private int age;
    private String majoring;
    private String country;

    public Student() {
        // Empty constructor
    }

    //Constructor with three arguments
    public Student(String n, int a, String m) {
        this.name = n;
        this.age = a;
        this.majoring = m;
    }

    // Mutator
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMajoring(String majoring) {
        this.majoring = majoring;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    // Accessor functions
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMajoring() {
        return majoring;
    }

    public String getCountry() {
        return country;
    }

    public static void main(String[] args) {
        Vector<Student> studentVector = new Vector<>();

        Student student1 = new Student();
        student1.setName("Aliatul Izzah");
        student1.setAge(21);
        student1.setMajoring("Computer Science");
        student1.setCountry("Malaysia");
        studentVector.add(student1);

        Student student2 = new Student("Afiah Nasuha", 21, "History");
        student2.setCountry("Singapore");
        studentVector.add(student2);

        // Access and print the values of the attributes using accessor functions
        for (Student student : studentVector) {
            System.out.println("Name : " + student.getName());
            System.out.println("Age : " + student.getAge());
            System.out.println("Majoring : " + student.getMajoring());
            System.out.println("Country : " + student.getCountry());
            System.out.println();
        }
    }
}