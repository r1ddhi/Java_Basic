import java.util.Scanner;

public class PrintNaturalNumAndTheirSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start and end of the range of numbers : ");
        int st = sc.nextInt();//first term of the range
        int sp = sc.nextInt();// last term of the range
        int sum = 0;//just predefining
        System.out.println("The numbers under the range are : ");
        for (int i = st; i <= sp; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("The sum of is : " + sum);
    }
}
