package vlad.duncea.lab4.ex4;

public class CleaningProduct extends Product
{
    private double ph;
    public CleaningProduct(double price,int stock,double ph)
    {
        super(price,stock);
        this.ph = ph;
    }

    @Override
    double getPrice() {
        return super.price;
    }

    @Override
    String description() {
        return "Produs de curatati cu ph " + ph;
    }

    @Override
    public String toString() {
        return "CleaningProduct: " + super.toString() + "ph: " + ph;
    }

    public double getPh(){
        return ph;
    }
}
