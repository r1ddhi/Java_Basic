import java.util.Arrays;
import java.util.Scanner;

public class CheckIfTheArrayHasComonElemnet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int l = sc.nextInt();
        int tmp = 0;
        int[] arr;
        arr = new int[l];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < l; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the length of the new array : ");
        int nl = sc.nextInt();
        int[] num;
        num = new int[nl];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        Arrays.sort(num);
        System.out.println("The sorted arrays are ");
        System.out.println("~~~~~~~~~~~~~~~~~~ARRAY 1~~~~~~~~~~~~~~~~~~");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~ARRAY 2~~~~~~~~~~~~~~~~~~");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~CHECKING THE COMMON ELEMENTS ~~~~~~~~~~~~~~~~~~");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (arr[i] == num[j]) {
                    System.out.println("the common elements are " + arr[i] + " and " + num[j]);
                }
            }
        }
    }
}

