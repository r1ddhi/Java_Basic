import java.util.Scanner;

public class PrintArrayInReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length : ");
        int l = sc.nextInt();
        String[] name;
        name = new String[l];
        System.out.println("Enter " + l + " number of names : ");
        for (int i = 0; i < l; i++) {
            name[i] = sc.next();
        }
        System.out.println("The reverse order of elements in the array is : ");
        for (int i = l-1; i>=0; i--) {

            System.out.println(name[i]);
        }
    }
}
