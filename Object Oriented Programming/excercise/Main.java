public class Main {
    public static void main(String[] args) throws Exception {

        GeometricObject s = new Sphere(35);
        GeometricObject c = new Cuboid(2,5,10);

        System.out.println("----------Sphere----------");
        System.out.println(s.toString());
        System.out.println("Area\t\t: "+s.getArea());
        System.out.println("Perimeter\t: "+s.getPerimeter());

        System.out.println("\n----------Cuboid----------");
        System.out.println(c.toString());
        System.out.println("Area\t\t: "+c.getArea());
        System.out.println("Perimeter\t: "+c.getPerimeter());
    }
}
