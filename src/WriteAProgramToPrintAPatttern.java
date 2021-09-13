/*RIDDHI DHIREN KUMBHANI
ROLLNO- 25
Write a program to print a pattern
      1
      12
      123
*/
import java.util.Scanner;
public class WriteAProgramToPrintAPatttern {
    public static void main (String[] args)
    {
        Scanner INPUT = new Scanner(System.in);
        System.out.println("THE NUMBER OF ROWS WILL BE : ");
        int ROWS = INPUT.nextInt();
        for (int i =1; i<=ROWS ; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print( j   );
            }
            System.out.println();
        }
    }
}
