public class Lecturer {
 
        private int lectId;
        private String lectName;
    
        public Lecturer(int lid, String lname){
            lectId = lid;
            lectName = lname;
        }
    
        public void setlectId(int lid){
            lectId = lid;
        }
    
        public void setlectName(String lname){
            lectName = lname;
        }
    
        public int getlectId() {
            return lectId;
            }
    
        public String getlectName() {
            return lectName;
            }
            
    
    
}
