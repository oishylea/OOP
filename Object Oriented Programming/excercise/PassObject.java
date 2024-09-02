public class PassObject {
    
    public static void main(String[ ] args) {

    Rectangle box1 = new Rectangle(5.0, 5.0);
    Rectangle box2 = new Rectangle(5.0, 5.0);

    if (box1.equals(box2))
    System.out.println ("Yes, it's equals");

    else
    System.out.println ("No, it's not equal");
    
    }
}
