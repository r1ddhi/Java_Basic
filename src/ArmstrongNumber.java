import java.awt.*;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main (String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER TO BE CHECKED : ");
        int nu = input.nextInt();int nenu=nu; int sum = 0 ; int rem;
        while (nenu != 0)//CHECKS THE REMAINDER AND IT AS INPUT
        {
            rem = nenu % 10 ;
            sum = sum + rem * rem* rem ;
            nenu = nenu/10;//TAKES THE QUOTIENT AND THE NEXT INPUT FOR THE LOOP
        }
        if (sum == nu )
        {
            System.out.println(nu + " IS AN ARMSTRONG NUMBER ");
        }
        else
        {
            System.out.println(nu + " IS NOT AN ARMSTRONG NUMBER");
        }
    }
}