import java.util.Scanner;

public class GradingStudents {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE TOTAL MARKS OBTAINED (OUT OF 100) : ");
        int st = sc.nextInt();
        if (st >= 90)
        {
            System.out.println(st+" YOU GOT A+ ");
        }
        else if (st <90 && st>=80)
        {
            System.out.println(st + "YOU GOT A ");
        }
        else if (st <80 && st >65)
        {
            System.out.println( st + "YOU GOT B");
        }
        else if (st<65 && st>50)
        {
            System.out.println(st + "YOU GOT C");
        }
        else if (st<50&&st>30)
        {
            System.out.println(st + " YOU GOT D");
        }
        else
        {
            System.out.println("YOU HAVE FAILED THE YEAR");
        }
    }
}
