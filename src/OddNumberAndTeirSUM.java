import java.util.Scanner;

public class OddNumberAndTeirSUM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of numbers : ");
        int st = sc.nextInt();
        int sp = sc.nextInt();
        int sum = 0;
        System.out.println("The odd numbers between " + st + " and " + sp + " are :");
        for (int i = st; i < sp; i++) {
            if (i % 2 == 0) {

            } else {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("The sum of n odd numbers in the range is : " + sum);
    }

}
