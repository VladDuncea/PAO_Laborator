package vlad.duncea.lab4.ex4;

public class FurnitureProduct extends Product
{
    private String wood_type;
    private double complexity;
    public FurnitureProduct(double price,int stock,String wood_type,double complexity)
    {
        super(price,stock);
        this.wood_type = wood_type;
        this.complexity = complexity;
    }

    @Override
    double getPrice() {
        return super.price * (1 +Math.min(complexity/10,0.3));
    }

    @Override
    String description() {
        return "Produs de mobilier din lemn de" + wood_type;
    }

    @Override
    public String toString() {
        return "FurnitureProduct: " + super.toString() + "wood: " + wood_type + "complexity: " + complexity;
    }

    public String getWood_type() {
        return wood_type;
    }

    public double getComplexity() {
        return complexity;
    }
}
