import java.util.Scanner;

public class OneDimensionalArrayOfStrings
{
        public static void main (String[] args)
        {
            Scanner INPUT = new Scanner(System.in);
            System.out.println("ENTER THE LENGTH OF ARRAY :");
            int length = INPUT.nextInt();
            String[] array;
            array = new String[length];
            System.out.println("ENTER THE ELEMENTS :");
            for (int i = 0; i < length; i++)
            {
                array[i] = INPUT.next();
                System.out.println("THE VALUES ARE [" + i + "]is" + array[i]);
            }
        }
    }
