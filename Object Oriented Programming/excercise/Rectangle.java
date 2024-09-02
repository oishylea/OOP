public class Rectangle {

    private double width;
    private double length;

    public Rectangle (double w,double l)
    {
    width = w;
    length = l;
    }

    public void setWidth(double w)
    {
    width = w;
    }

    public void setLength(double l)
    {
    length = l;
    }

    public double getWidth()
    {
    return width;
    }

    public double getLength()
    {
    return length;
    }

    public double calcArea()
    {
    return width * length;
    }

    public boolean equals(Rectangle r)
    {
    return (this.calcArea() == r.calcArea());
    }
}