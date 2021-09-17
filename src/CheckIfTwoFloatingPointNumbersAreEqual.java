import java.util.Scanner;

public class CheckIfTwoFloatingPointNumbersAreEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the floating point numbers to be checked : ");
        //must lie in the range 3.40282347 x 10^38, 1.40239846 x 10^-45
        float f1 = sc.nextFloat();
        float f2 = sc.nextFloat();
        if (f1 == f2) {
            System.out.println( f1 + " is equal to " + f2);
        } else {
            System.out.println(f1 + " is not equal to " + f2);
        }
    }
}
