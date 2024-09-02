public abstract class GeometricObject implements Volume{
    private String color="white";
    private boolean filled;
    private java.util.Date dateCreated;

    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public String toString() {
        return "Geometric Object Color=" + color + ", filled=" + filled + ", Date Created=" + dateCreated + "]" + ", \nVolume\t\t: " + ((Volume)this).getVolume();
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}
