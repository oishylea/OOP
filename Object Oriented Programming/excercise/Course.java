public class Course {


        private String courseCode;
        private String courseName;
    
        public Course(String code, String cname){
            courseCode = code;
            courseName = cname;
        }
    
        public void setcourseCode(String code){
            courseCode = code;        }
    
        public void setcourseName(String cname){
            courseName = cname;
        }
    
        public String getcourseCode() {
            return courseCode;
            }
    
        public String getcourseName() {
            return courseName;
            }
            
    

}
