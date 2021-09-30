import java.util.Scanner;

public class CopyAnArrayByIteration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of integers to be entered in the array  : ");
        int l = sc.nextInt();
        int[] num;
        num = new int[l];
        System.out.println("Enter " + l + " number of integers in the array : ");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("The array that you added is : ");
        System.out.println("The name of the old array is num");
        for (int i = 0; i < num.length; i++) {
            System.out.println("The element at " + i + " is " + num[i]);
        }
        int[] new_num;
        new_num = new int[l];
        for (int i = 0; i < new_num.length; i++) {
            new_num[i] = num[i];
        }
        System.out.println("The new array is : ");
        System.out.println("The name of the new array is new_num");
        for (int i = 0; i < new_num.length; i++) {
            System.out.println("The element at " + i + " is " + new_num[i]);
        }
    }
}
