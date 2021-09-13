/*RIDDHI DHIREN KUMBHANI
ROLLNO- 25
Write a java program to calculate factorial of a number.
*/

import java.security.PublicKey;
import java.util.Scanner;

public class CalculateFactorialOfANumber {
    public static void main(String[] args)
    {
        Scanner INOUT = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER ");
        int nu = INOUT.nextInt();int fact = 1;
        for (int i = 1 ; i <= nu ; i++)
        {
            fact = fact*i;
        }
        System.out.println("THE FACTORIAL OF THE NUMBER IS " + fact);
    }
}
