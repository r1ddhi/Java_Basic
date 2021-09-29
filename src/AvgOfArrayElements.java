import java.util.Scanner;

public class AvgOfArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of integers to be taken as input : ");
        int l = sc.nextInt();//length of array
        double sum = 0;//temporary variable
        double avg = 0;//temporary variable
        Float[] num;
        num = new Float[l];//initialising array
        System.out.println("Enter " + l + " number of integers : ");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextFloat();//storing the input in array
        }
        System.out.println("The array is : ");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);//printing the array
        }
        System.out.println("The average of all the elements in the array is: ");
        for (float i : num) {
            sum += i;//calculating the sum of elements in array
            avg = sum / num.length;//finding the average that is sum of enteries /number of enteries

        }
        System.out.println(avg);//printing avg

    }
}
