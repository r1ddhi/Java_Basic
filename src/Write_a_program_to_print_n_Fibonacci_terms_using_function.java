import java.util.Scanner;/* . Write a program to print n Fibonacci terms using function. ROLL NO = 25; RIDDHI KUMBHANI */
public class Write_a_program_to_print_n_Fibonacci_terms_using_function {
    public static void main(String[] args)
    {
        Scanner input =  new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF OUTPUTS : ");
        int limit = input.nextInt();
        fibonacci(limit);
    }
    public static void fibonacci(int num)
    {
        int n1= 0; int n2 =1;
        System.out.println( n1  );
        System.out.println( n2  );
         for (int c = 3; c <=num; c++)
        {
            int n3= n1 + n2;
            System.out.println( n3 );
            n1=n2;
            n2=n3;
        }
    }
}
