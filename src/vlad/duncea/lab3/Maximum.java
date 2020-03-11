package vlad.duncea.lab3;

public class Maximum {

    private int nr;

    public Maximum()
    {
        this(0);
    }

    public Maximum(int nr)
    {
        this.nr = nr;
    }

    public int maxim(int a)
    {
        return a >nr ? a:nr;
    }

    //Supraincarcarea
    public int maxim(int a, int b)
    {
        int c = nr;
        int rez;
        nr = maxim(b);
        rez = maxim(a);
        nr = c;
        return rez;
    }

    public int maxim(int a,int b, int c)
    {
        return maxim(maxim(a,b),maxim(c));
    }

    public int maxim(int a,int b,int c,int d)
    {
        return maxim(maxim(a,b,c),maxim(d));
    }

    public static void main(String[] args)
    {
        Maximum m = new Maximum(5);
        System.out.println(m.maxim(10));
        System.out.println(m.maxim(3,4));
        System.out.println(m.maxim(9,2,3));
        System.out.println(m.maxim(-4,2,3,-10));
    }
}
