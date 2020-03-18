package vlad.duncea.lab4;

public class StringTests
{
    public static void main(String[] args) {
        String s1,s2;
        s1 = "Vlad";
        s2 = "Duncea";
        String s3 = s1+" "+s2;
        System.out.println(s3);
        System.out.println("Characterul pe poz 6:" + s3.charAt(5));
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<10;i++)
        {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
        sb.insert(10,"string ");
        System.out.println(sb);
        StringBuffer sbuff = new StringBuffer();
        for(int i=0;i<10;i++)
        {
            sbuff.append(i).append(" ");
        }
        System.out.println(sbuff);
    }
}
