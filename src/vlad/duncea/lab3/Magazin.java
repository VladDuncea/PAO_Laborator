package vlad.duncea.lab3;

public class Magazin
{
    private String nume;
    private Produs p1,p2,p3;

    public Magazin(String nume,Produs p1,Produs p2,Produs p3)
    {
        this.nume = nume;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    @Override
    public String toString() {
        return "Magazin: " + nume + "\n" + p1 + "\n" + p2 + "\n" + p3;
    }

    public double getTotalMagazin()
    {
        return p1.getTotalProdus() + p2.getTotalProdus() + p3.getTotalProdus();
    }

    public static void main(String[] args) {
        Magazin magazin = new Magazin("MiniMax",new Produs("Oaie",30,10),new Produs("Magar",100,5),new Produs("Vitel",500,3));
        System.out.println(magazin);
        System.out.println(magazin.getTotalMagazin());
    }
}
