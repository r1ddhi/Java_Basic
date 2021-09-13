import java.util.Scanner;

public class LargestOf3Numbers {
    public static void main (String [] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER THE THREE NUMBERS ");
        int x = s.nextInt();
        int y = s.nextInt();
        int z = s.nextInt();
        int result = 0;
        if(x >= y && x >= z)
        {
            result=x;
        }
        else if(y >= z)
        {
            result=y;
        }
        else
        {
            result=z;
        }
        System.out.println(result);
    }
    }