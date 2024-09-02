//USING STATIC VARIABLE

public class Kira {
    // Declare and initialize static variable
     static int kaunterKira = 0;
    
     public Kira() {
     kaunterKira += 1; // Modify the value in
    // the constructor
     }
     public static void main (String [] args) {
     new Kira();
     new Kira();
     new Kira();
     System.out.println ("Kiraan Kira ialah " + kaunterKira);
     }
    }

//USING UNSTANCE VARIABLE
public class Kira {
    int kaunterKira = 0; // Declare and initialize
    // instance variable
    public Kira() {
    kaunterKira += 1; // Modify the value in
    // the constructor
    }
    public static void main (String [] args) {
    new Kira();
    new Kira();
    new Kira();
    System.out.println ("Kiraan Kira ialah " +
   kaunterKira);
    }
   }