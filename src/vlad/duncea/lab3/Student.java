package vlad.duncea.lab3;

public class Student
{
    private String nume, prenume;

    static public int contor = 0;

    public Student(String nume, String prenume)
    {
        this.nume = nume;
        this.prenume = prenume;
        contor++;
    }

    @Override
    public String toString() {
        return "Student: "+ nume + " " + prenume;
    }

    public static void main(String[] args)
    {
        Student [] arr;
        arr = new Student[5];
        arr[0] = new Student("Duncea","Vlad");
        arr[1] = new Student("Balon","Dorel");
        arr[2] = new Student("Ionescu","Vlad");
        arr[3] = new Student("Popescu","Pop");
        arr[4] = new Student("Oprea","Ionel");

        for(Student s :arr)
            System.out.println(s);

        System.out.println("Nr studenti: " + Student.contor);
    }
}
