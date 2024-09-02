public class Circle extends GeometricObject{
    
    private double radius = 3.0;
    private double diameter =4.0;

    public Circle() {};

    public Circle (double radius){};

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getArea(){
        return radius*radius+Math.PI;
    }

    public double getPerimeter (){
        return 2*radius*Math.PI;
    }
}
