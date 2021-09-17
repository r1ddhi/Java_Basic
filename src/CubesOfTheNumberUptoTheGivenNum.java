import java.util.Scanner;

public class CubesOfTheNumberUptoTheGivenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last number of the range : ");
        int en = sc.nextInt();
        for (int i = 1; i <= en; i++) {
            System.out.println("The number is: " + i + " ,The cube of " + i + " is: " + i * i * i);
        }
    }
}
