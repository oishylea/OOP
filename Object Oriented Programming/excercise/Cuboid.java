public class Cuboid extends GeometricObject{
    private double width;
    private double height;
    private double length;

    public Cuboid() {}

    public Cuboid(double w, double h, double l) {
        width=w;
        height=h;
        length=l;
    }

    public double getVolume() {
        return width*height*length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double w ){
        width=w;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double h ){
        height=h;
    }

    public double getLength(){
        return length;
    }

    public void setLength(double l ){
        length=l;
    }

    public double getArea() {
        return (2*width*height)+(2*width*length)+(2*length*height);
    }

    public double getPerimeter() {
        return 4*(width+height+length);
    }
 }
