package vlad.duncea.lab4.ex1;

public class Ex1
{

    public static String concat_special(String s1,String s2)
    {
        if((s1.substring(0, 3)).equals(s2.substring(s2.length() - 3)))
            return s1+s2;
        return s2+s1;
    }

    public static void main(String[] args)
    {
        String s = "  Stringul de test este mare si frumos. Da  ";
        System.out.println(s);
        // cel mai mare numar de aparitii ?

        //inlocuire
        String inlocuit = s.replace('a','*');
        System.out.println(inlocuit);

        //trim
        String trimmed = s.trim();
        System.out.println(trimmed);

        //concat magic
        String s1 = "ele fac";
        String s2 = "cafele";
        System.out.println(concat_special(s1,s2));
    }
}
