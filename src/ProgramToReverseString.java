import java.util.Scanner;

public class ProgramToReverseString {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println(" ENTER THE STRING TO BE REVERSED : ");
        char[] letters =  sc.nextLine().toCharArray();
        System.out.println("REVERSE STRING : ");
        for (int i =letters.length-1;i>=0;i--)
        {
            System.out.print(letters[i] );
        }

    }
}
