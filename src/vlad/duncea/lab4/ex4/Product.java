package vlad.duncea.lab4.ex4;

public abstract class Product
{
    protected double price;
    protected int stock;

    public Product(double price,int stock)
    {
        this.price = price;
        this.stock = stock;
    }

    abstract double getPrice();
    abstract String description();

    @Override
    public String toString() {
        return "price= " + getPrice() + ", stock= " + stock;
    }
}
