package vlad.duncea.lab4.ex3;

public class TestCircle
{
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle("Blue");
        Circle c3 = new Circle(2,"Green");
        Circle c4 = new Circle(2,"Pink");

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        System.out.println(c1.getArea());
        System.out.println(c1.getRadius());
        System.out.println(c1.getColour());
        c1.setColour("Blue");
        c1.setRadius(3);
        System.out.println(c1);
        System.out.println(c1.getArea());

        System.out.println(c1.equals(c3));
        System.out.println(c3.equals(c4));
        c4.setColour("Green");
        System.out.println(c3.equals(c4));
    }
}
