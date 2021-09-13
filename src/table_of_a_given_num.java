import java.util.Scanner;

public class table_of_a_given_num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER : ");
        int num = input.nextInt();
        for (int k = 0; k < 10; k++)
        {
            System.out.println(num + " x " + (k+1) + " = " +
                    (num * (k+1)));
        }
        System.out.println("ENTER THE OTHER NUMBER : ");
        int newnu = input.nextInt();
        for (int i = 0; i < 10; i++)
        {
            System.out.println( newnu+ " x " + (i+1) + " = " +
                    (num * (i+1)));
        }
    }
}