import java.util.Scanner;/* . Write a program to print all prime numbers in the range n1 to n2. Accept range as input from user
. Pass n1 and n2 to prime function. Function will not return any value. ROLL NO = 25; RIDDHI KUMBHANI */
public class PrimeOrNotWithARnge {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("ENTER THE RANGE");
            int min = input.nextInt();
            int max = input.nextInt();
            for(int n=min;n<=max;n++) {
                if(isPrime(n)) {
                    System.out.println(n);
                }
            }
        }
    public static boolean isPrime(int num) {
            for(int i = 2; i <= num/i; ++i) {
                if(num % i == 0) {
                    return false; }
            }
            return true;}
    }
