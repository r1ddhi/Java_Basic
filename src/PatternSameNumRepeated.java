import java.util.Scanner;

public class PatternSameNumRepeated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number of rows : ");
        int r = sc.nextInt();
        for (int i = r; i >= 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(i+" ");

            }
            System.out.println();
        }
    }
}
