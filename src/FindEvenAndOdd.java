/*RIDDHI DHIREN KUMBHANI
ROLLNO- 25
Write a java program to find whether no is even or odd
*/
import java.util.Scanner;

public class FindEvenAndOdd {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE NUMBERS TO BE CHECKED ");
        int nu = input.nextInt();
        if (nu%2 == 0)
        {
            System.out.println("ITS EVEN");
        }
        else
        {
            System.out.println("ITS ODD");
        }
    }
}
