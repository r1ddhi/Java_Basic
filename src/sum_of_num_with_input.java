import java.util.Scanner;

public class sum_of_num_with_input {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int fnum = input.nextInt();
        System.out.println("ENTER the second num : ");
        int nextnum = input.nextInt();
        System.out.println();
        System.out.println(fnum + nextnum);
    }
}
