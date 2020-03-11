package vlad.duncea.lab3;

public class Matrice {

    private int nrl,nrc;
    public int[][] data;

    Matrice(int nrl, int nrc)
    {
        this.nrl = nrl;
        this.nrc = nrc;
        data = new int[nrl][nrc];
    }

    Matrice(Matrice m)
    {
        this.nrc = m.nrc;
        this.nrl = m.nrl;

        data = new int[nrl][nrc];
        data = m.data;
    }

    public Matrice add(Matrice m)
    {
        if(m.nrl != nrl || m.nrc != nrc)
            return null;

        Matrice sum = new Matrice(nrl,nrc);
        for(int i =0;i<nrl;i++)
            for(int j =0;j<nrc;j++)
                sum.data[i][j] = data[i][j] + m.data[i][j];

        return sum;
    }

    public Matrice multiply(Matrice m)
    {
        if(m.nrc != nrl)
            return null;

        Matrice product = new Matrice(m.nrl,nrc);
        for(int i =0;i<m.nrl;i++)
            for(int j =0;j<nrc;j++)
                for(int k=0;k<m.nrc;k++)
                product.data[i][j] = m.data[i][k] + data[k][j];

        return product;
    }

    public Matrice pow(int power)
    {
        Matrice result = new Matrice(this);
        for(int i=1;i<power;i++)
            result = multiply(result);
        return result;
    }

    public String toString()
    {
        String print = "NRL: "+nrl +"\nNRC: "+nrc+"\n";
        for(int i =0;i<nrl;i++)
        {
            for(int j =0;j<nrc;j++)
            {
                print += data[i][j] + " ";
            }
            print+="\n";
        }

        return print;
    }

    public static void main(String[] args)
    {
        Matrice m1,m2;
        m1= new Matrice(3,3);

        m1.data[0][0]=1;
        m1.data[0][1]=2;
        m1.data[0][2]=3;
        m1.data[1][0]=4;
        m1.data[1][1]=5;
        m1.data[1][2]=6;
        m1.data[2][0]=7;
        m1.data[2][1]=8;
        m1.data[2][2]=9;
        m2= new Matrice(m1);
        System.out.println("m2:(identic cu m1)");
        System.out.println(m2.toString());
        System.out.println("m1+m2");
        System.out.println(m1.add(m2));
        System.out.println("m1*m2");
        System.out.println(m1.multiply(m2));
        System.out.println("m1^3");
        System.out.println(m1.pow(3));

    }
}
