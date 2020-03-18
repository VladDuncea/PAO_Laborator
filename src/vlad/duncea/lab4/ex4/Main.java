package vlad.duncea.lab4.ex4;

public class Main
{
    public static void main(String[] args)
    {
        Product [] products = new Product[5];
        products[0] = new CleaningProduct(10,20,3);
        products[1] = new ClotheProduct(40,100,"XS","Red");
        products[2] = new FurnitureProduct(400,5,"Birch",2.4);
        products[3] = new FoodProduct(5,2090,20);
        products[4] = new ClotheProduct(35,50,"XL","Blue");

        for(Product p : products) {
            System.out.println(p.description());
            System.out.println(p);
        }
    }
}
