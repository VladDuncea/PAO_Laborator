package vlad.duncea.lab4.ex4;

public class FoodProduct extends Product
{
    private int max_validity;
    private int remaining_validity;
    public FoodProduct(double price,int stock,int validity)
    {
        super(price,stock);
        this.max_validity = this.remaining_validity = validity;
    }

    @Override
    double getPrice() {
        return super.price * Math.min((double)remaining_validity/max_validity,0.6);
    }

    @Override
    String description() {
        return "Produs mancare cu o descriere frumoasa";
    }

    @Override
    public String toString() {
        return "FoodProduct: " + super.toString() + "expires in: " + remaining_validity;
    }

    public void updateValidity(){
        remaining_validity-=1;
        if(remaining_validity<1) {
            remaining_validity = 2;
            //Do something
        }
    }
}
