import java.util.Scanner;

public class take_input_and_follow_operations {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER: ");
        int fnum = input.nextInt();
        System.out.println("ENTER THE SECOND NUMBER : ");
        int snum = input.nextInt();
        System.out.println(fnum+snum);
        System.out.println(fnum-snum);
        System.out.println(fnum/snum);
        System.out.println(fnum%snum);
        System.out.println(fnum*snum);

    }
}
