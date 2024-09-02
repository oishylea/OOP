public class App {
    public static void main(String[] args) throws Exception {

        GeometricObject circle = new Circle(10);
        GeometricObject r = new Rectangle(3,4);

        System.out.println("Circle: ");
        System.out.println(circle.toString());
        System.out.println("Area: "+circle.getArea());
        System.out.println("Perimeter: "+circle.getPerimeter());

        System.out.println("\nRectangle: ");
        System.out.println(r.toString());
        System.out.println("Area: "+r.getArea());
        System.out.println("Perimeter: "+r.getPerimeter());
    }
}
