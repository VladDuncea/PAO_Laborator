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

    public double getArea()
    {
        return Math.PI * radius*radius;
    }

    @Override
    public String toString() {
        return "Circle: r= " + radius + ", colour= '" + colour + "'";
    }

    @Override
    public boolean equals(Object o) {
        if(o == null || o.getClass() != getClass())
            return false;
        Circle c = (Circle) o;

        return c.radius == radius && c.colour.equals(colour);
    }

}
