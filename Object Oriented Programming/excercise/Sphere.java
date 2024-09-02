public class Sphere extends GeometricObject{
    private double radius;

    public Sphere(){}

    public Sphere ( double r) {
        radius=r;
    }

    public double getVolume() {
        return 4/3*(Math.pow(radius,3)*Math.PI);
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double r) {
        radius=r;
    }

    public double getArea(){
        return Math.pow(radius,2)*Math.PI;
    }

    public double getPerimeter() {
        return 2*radius*Math.PI;
    }
}
