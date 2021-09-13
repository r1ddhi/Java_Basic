import java.util.Scanner;

public class FactorialNumberRecursion {
 static  int factorial(int nu)
 {
 if (nu==1)
 return 1;
 else
     return ( nu * factorial( nu - 1));
 }
 public static void main (String[] args)
 {
     Scanner input  =  new Scanner(System.in);
     System.out.println("ENTER THE NUMBER : ");
     int number= input.nextInt();
     System.out.println("THE FACTORIAL OF THE "+ (number) + " IS " + factorial(number));
 }
}