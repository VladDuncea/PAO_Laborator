package vlad.duncea.lab3.geometry;

public class Punct
{
    private int x,y;

    public Punct()
    {
        this(0,0);
    }

    public Punct(int x,int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x +", "+ y + ")";
    }

    public double distance(int x,int y)
    {
        return Math.sqrt(Math.pow(this.x-x,2) + Math.pow(this.y-y,2) );
    }

    public double distance(Punct p)
    {
        return distance(p.x,p.y);
    }
}
