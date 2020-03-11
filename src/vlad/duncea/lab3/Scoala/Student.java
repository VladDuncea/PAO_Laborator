package vlad.duncea.lab3.Scoala;

public class Student
{
    private String nume;
    private double medieSem1, medieSem2;

    public Student(String nume,double medieSem1, double medieSem2)
    {
        this.nume = nume;
        this.medieSem1 = medieSem1;
        this.medieSem2 = medieSem2;
    }

    public double getMedieAn1()
    {
        return (medieSem1 + medieSem2)/2;
    }

    @Override
    public String toString() {
        return "Student: "+ nume + " medieSem1: " + medieSem1 + " medieSem2: " + medieSem2;
    }
}
