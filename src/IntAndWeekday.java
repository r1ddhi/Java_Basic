import java.util.Scanner;

public class IntAndWeekday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER ( BETWEEN 1~7): ");
        int d = sc.nextInt();
        {
            if (d == 1) {
                System.out.println("ITS MONDAY ");
            }
            if (d == 2) {
                System.out.println("ITS TUESDAY ");
            } else if (d == 3) {
                System.out.println("ITS WEDNESDAY ");
            } else if (d == 4) {
                System.out.println("ITS THURSEDAY ");
            } else if (d == 5) {
                System.out.println("ITS FRIDAY ");
            } else if (d == 6) {
                System.out.println("ITS SATURDAY ");
            } else if (d == 7) {
                System.out.println("ITS SUNDAY ");
            }
        }
    }
}
