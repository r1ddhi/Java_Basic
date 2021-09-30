import java.util.Scanner;

public class SumOfNints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range : ");
        int start = sc.nextInt();
        int stop = sc.nextInt();
        int sum = 0;
        System.out.println("The numbers between " + start +" and "+ stop+ " are  :");
        for (int i = start; i <= stop; i++) {
            sum = sum + i;
            System.out.println(i);
        }
        System.out.println("The sum of integers between " + start + " and " + stop + " is " + sum);
    }
}
