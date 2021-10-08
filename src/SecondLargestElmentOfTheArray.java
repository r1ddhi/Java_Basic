import java.util.Scanner;

public class SecondLargestElmentOfTheArray {
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
        System.out.println("The elements in the array are : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int j = 0; j < l; j++) {
            for (int i = 0; i < l - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
            }
        }
        System.out.println("1~ maximum \n2~ minimum \n3~ second largest element in the array\n4~ sorted array");
        System.out.println("Enter your choice: ");
        int ans = sc.nextInt();

        switch (ans) {

            case 1: {
                System.out.println("The minimum element of the array : " + arr[0]);
                break;
            }
            case 2: {
                System.out.println("The maximum element of the array is : " + arr[l - 1]);
                break;
            }
            case 3: {
                System.out.println("The second largest element of the array is : " + arr[l - 2]);
                break;
            }
            case 4: {
                for (int i = 0; i < arr.length; i++) {
                    System.out.println(i + " has " + arr[i] + " in the array");
                }
                break;
            }

        }
    }
}
