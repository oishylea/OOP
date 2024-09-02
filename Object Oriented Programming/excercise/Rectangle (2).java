public class Rectangle extends GeometricObject{
    
    private double width = 4.5;
    private double height =5.0;

    public Rectangle (){};

    public Rectangle (double width, double height){

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return width*height;
    }

    public double getPerimeter(){
        return 2*(width + height);
    }
}
