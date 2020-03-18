package vlad.duncea.lab4.ex4;

public class ClotheProduct extends Product
{
    private String size;
    private String color;

    public ClotheProduct(double price,int stock,String size,String color)
    {
        super(price,stock);
        this.size = size;
        this.color = color;
    }

    @Override
    double getPrice() {
        if(color.equals("Red"))
            return super.price * 1.15;
        return super.price;
    }

    @Override
    String description() {
        return "Produs de imbracaminte de culoare " + color + "si dimensiune " + size;
    }

    @Override
    public String toString() {
        return "ClotheProduct: " + super.toString() + "color:" + color + " ,size: " + size;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }
}
