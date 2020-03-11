package vlad.duncea.lab3;

import java.util.Arrays;

public class Pr9
{
    public static int[] find(int [] arr, int x)
    {
        int poz=arr.length;
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]==x)
            {
                poz = i;
                break;
            }
        }

        return  Arrays.copyOfRange(arr, poz, arr.length);
    }

    public static void main(String[] args)
    {
        int [] arr = {1,5,6,9,12,22,7,20};
        int item = 9;
        int []result = find(arr,item);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(result));
    }
}
