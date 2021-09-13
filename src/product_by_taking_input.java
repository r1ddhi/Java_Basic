import java.util.Scanner;

public class product_by_taking_input {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first number : ");
        int num1 = input.nextInt();
        System.out.println("ENTEr the next number :" );
        int num2 = input.nextInt();
        System.out.println(num1 * num2);
    }
}
