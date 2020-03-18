package vlad.duncea.lab4.ex3;

public class Circle
{
    private double radius;
    private String colour;

    public Circle()
    {
        this(1.0,"Red");
    }

    public Circle(String colour)
    {
        this(1.0,colour);
    }

    public Circle(double radius,String colour)
    {
        this.radius = radius;
        this.colour = colour;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }
}
