import java.util.Scanner;
public class CheckIfItIsALeapYear {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the year to be checked : ");
        int year = sc.nextInt();
        if (year%4 ==0 ) //IF REMAINDER 0 ONLY THEN LEAP
        {
            System.out.println(year + " IT IS A LEAP YEAR ");
        }
        else
        {
            System.out.println(year + " IS NOT A LEAP YEAR ");
        }
    }
}
