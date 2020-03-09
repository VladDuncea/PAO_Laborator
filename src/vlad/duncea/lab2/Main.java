package vlad.duncea.lab2;

import vlad.duncea.lab2.A.LaFel;

import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args)
    {

        LaFel lf = new LaFel();
        lf.getClass();

        System.out.println(LaFel.getPackage());
        System.out.println(vlad.duncea.lab2.B.LaFel.getPackage());
	    Random r = new Random();
	    int x = r.nextInt(10);
	    System.out.println(x);

	    Scanner in = new Scanner(System.in);
        System.out.println("Introduceti numerele: ");
	    int a = in.nextInt();
	    int b = in.nextInt();
        System.out.println("Introduceti operatorul: ");
	    String op = in.next();

	    double rez;
	    switch (op)
        {
            case "+":
                rez = a+b;
                break;
            case "-":
                rez = a-b;
                break;
            case "/":
                rez = (double)a/b;
                break;
            case "*":
                rez = a*b;
                break;
            case "%":
                rez = a%b;
                break;
            default:
                rez = Double.NaN;
        }

        System.out.println("Rezultat: "+rez);
    }
}

class Person
{
    String name;
    int age;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public Person()
    {
        this.name = "Placeholder";
        this.age = 18;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Cat
{
    int id;
    String name;
    public Cat(int id,String name)
    {
        this.id = id;
        this.name = name;
    }
}