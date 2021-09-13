import java.util.Scanner;

public class division_with_input {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER :");
        int num1 = input.nextInt();
        System.out.println("ENTER THE SECOND NUMBER:");
        int num2 = input.nextInt();
        System.out.println(num1/num2);
    }
}
