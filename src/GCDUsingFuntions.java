import java.util.Scanner;
/*Write a program to find GCD number using function ROLL NO = 25; RIDDHI KUMBHANI */
public class GCDUsingFuntions {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE NUMBERS : ");
        int n1 = input.nextInt();int n2 = input.nextInt();
        GCD(n1 , n2);
    }
public static void GCD(int n1 , int n2)
    {
         int gcd = 1;
        for(int i = 1; i <= n1 && i <= n2; i++)
                {
                if(n1%i==0 && n2%i==0)
                gcd = i;
                }
                System.out.println("GCD is " + gcd );
                }
    }

