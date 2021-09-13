import java.util.Scanner;
/* . Write a prime function to check if number is prime or not. Pass a number to functio and return 1 if prime else return 0. ROLL NO = 25; RIDDHI KUMBHANI */
public class CheckIfPrimeOrNotUsingFunction {
    public static void main (String[] args)
    {
        Scanner input  = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER TO BE CHECKED : ");
        int a = input.nextInt();
        if (isPrime(a))
        {
            System.out.println( a + " is prime");
        }
    }
    public static boolean isPrime(int num) {
        for(int i = 2; i <= num/i; ++i) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
