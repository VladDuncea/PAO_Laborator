package vlad.duncea.lab3;

public class Complex
{
    private double im,re;

    public Complex()
    {
        this(0,0);
    }

    public Complex(double re,double im)
    {
        this.re = re;
        this.im = im;
    }

    public Complex sum(Complex c)
    {
        Complex rez = new Complex();
        rez.im = im + c.im;
        rez.re = re + c.re;
        return rez;
    }

    @Override
    public String toString() {
        String print = ""+re;
        if(im!=0)
            print+=" "+im+"i";
        return print;
    }

    //Parametru de tip object ??
    public boolean equals(Complex c)
    {
        return (re == c.re && im == c.im);
    }

    public static void main(String[] args)
    {
        Complex c1 = new Complex(3,5);
        Complex c3 = new Complex(3,5);
        Complex c2 = new Complex();
        System.out.println(c1.toString()+" "+ c2);
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
        System.out.println(c1.sum(c2));
    }

}
