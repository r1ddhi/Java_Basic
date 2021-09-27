import java.util.Scanner;

public class SumOfValuesInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of integers to be taken : ");//setting array length
        int l = sc.nextInt();
        int sum = 0;//temporary variable
        int[] num;
        num = new int[l];//initialising the array
        System.out.println("Enter " + l + " integers: ");//setting values
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();//input allocation
        }
        System.out.println("The sum of the elements : ");
        for (int i : num)//function
        {
            sum += i;//storing the sum
        }
        System.out.println(sum);
    }
}
