/*RIDDHI DHIREN KUMBHANI
ROLLNO- 25
Write a program to find whether no is prime.
*/
import java.util.Scanner;
public class CheckIfTheNumberIsPrimeOrNot {
    public static void main (String[] args)
    {
        Scanner INPUT = new Scanner(System.in);
        System.out.println("PLEASE ENTER THE NUMBER TO BE CHECKED : ");
        int num = INPUT.nextInt();
        int flag =0 ;
        for (int i = 2; i<=num/2;i++) {
            if (num % i == 0)
                flag = 1;
        }
        if (flag ==1)
        {
            System.out.println("THE NUMBER IS NOT PRIME");
        }
        else
            System.out.println("THE NUMBER IS PRIME ");
    }
}
