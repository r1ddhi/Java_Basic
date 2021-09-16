import java.util.Scanner;
public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER TO BE CHECKED : ");
        int num = sc.nextInt();
        if ( num > 0)
        {
            System.out.println(num + " IS POSITIVE");
        }
        else if (num ==0)
        {
            System.out.println("THE NUMEBR IS 0");
        }
        else
        {
            System.out.println(num + " IS NEGATIVE");
        }
    }
}
