package vlad.duncea.lab3.geometry;

public class TestPunct
{
    public static void main(String[] args)
    {
        Punct A = new Punct(1,3);
        Punct B = new Punct(-1,2);

        System.out.println("A="+A);
        System.out.println("B="+B);

        System.out.println(A.distance(B));

        //Nu putem accesa A.x sau A.y pt ca sunt private, dar avem getX,getY/setX,setY
    }
}
