import java.util.Scanner;

public class PatternWithIncInTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the pattern : ");
        int r = sc.nextInt();int k =1;
        System.out.println("The pattern is : ");
        for (int i = 0; i <=r; i++)
        {
            for (int j = i; j >=0; j--)
            {
                System.out.print(k++ + " ");

            }
            System.out.println( );
        }
    }
}
