import java.util.ArrayList;


public class StudentsDoc {

    private String name;
    private double cpa;
    

    //CONSTRUCTOR
    public StudentsDoc(String n, double c){
        name=n;
        cpa=c;
        //this.name

    }

    public void setName(String n){
        name=n;
    }

    public void setCpa(double c){
        cpa=c;
    }

    public String getName(){
        return name;
    }

    public double getCpa(){
        return cpa;
    }


    public String toString(){
        return getName()+" "+getCpa();
    }
}


// public class StudentApp{

//         public static void main(String[] args){
//             ArrayList stdList= new ArrayList();
//             StudentsDoc std1= new StudentsDoc("name",3.7);
//             stdList.add(std1);
//         }
    
// }