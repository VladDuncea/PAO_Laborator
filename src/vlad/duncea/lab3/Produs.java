package vlad.duncea.lab3;

public class Produs
{
    private String nume;
    private double pret;
    private int cantitate;

    public Produs()
    {
        this("Default",0,0);
    }

    public Produs(String nume,double pret,int cantitate)
    {
        this.nume = nume;
        this.pret = pret;
        this.cantitate = cantitate;
    }

    @Override
    public String toString() {
        return "Produs: " + nume + "; pret: " + pret + "; cantitate: " + cantitate;
    }

    public double getTotalProdus()
    {
        return pret*cantitate;
    }
}
