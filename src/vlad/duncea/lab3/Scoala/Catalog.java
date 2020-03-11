package vlad.duncea.lab3.Scoala;

public class Catalog
{
    private String grupa;
    private Student s1,s2,s3,s4,s5;

    public Catalog(String grupa, Student s1,Student s2, Student s3, Student s4, Student s5)
    {
        this.grupa = grupa;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
        this.s5 = s5;
    }

    public double getMedieClasa()
    {
        return (s1.getMedieAn1() +s2.getMedieAn1() +s3.getMedieAn1() +s4.getMedieAn1() +s5.getMedieAn1())/5;
    }

    @Override
    public String toString() {
        return "Grupa: " + s1 + "\n" + s2 + "\n" + s3 + "\n" + s4 + "\n" + s5;
    }

    public static void main(String[] args) {
        Catalog catalog = new Catalog("244",new Student("Vlad Duncea",10,9),new Student("Manole",9,9),new Student("Gigi",8,7),new Student("Nicu",4,3),new Student("Oprisan",5,4));
        System.out.println(catalog);
        System.out.println(catalog.getMedieClasa());
    }
}
