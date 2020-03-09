package vlad.duncea.lab3;

public class Matrice {

    private int nrl,nrc;
    public int data[][];

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
        for(int i =0;i<nrl;i++)
            for(int j =0;j<nrc;j++)
            {
                data[i][j] = m.data[i][j];
            }
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

    public static void main(String[] args)
    {


    }
}
