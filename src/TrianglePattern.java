import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args) {
        System.out.println("Input number of rows : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = n + 5-1;
        for (int i = 1; i <=n; i++) {
            for (int x = s; x != 0; x--) {
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(i);
            s--;
        }
        for (int i = n; i >=0; i--) {
            for (int x = s; x != 0; x--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(i);
            s++;
        }

    }
}
