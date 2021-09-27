import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //The step to initialise the length of the array
        System.out.println("enter the length of the array :(ie.the number of integers to be entered ) ");
        int L = sc.nextInt();
        int[] num;
        num = new int[L];
        System.out.println("Enter the numbers : ");
        //the input given above will be taken inside the loop to store value
        for (int i = 0; i < num.length; i++)
//the loop says i<int.length and not i<=int.length because if we take <= it goes from 0 to arr.length which actually becomes length+1 hence we use < only
        {
            num[i] = sc.nextInt();//stores the input inthe array
        }
         Arrays.sort(num);//sorts the input ie it arranges it in ascending order(direct function)but the loop form is yet recommended
        /* the forr loop will be
        int tmp = 0;
        for (int j = 0; j < num.length; j++) {
                for (int i = 0; i < num.length - 1; i++) {
                    if (num[i]> num[i + 1]){
                 tmp = num[i];
                 num[i] = num[i + 1];
                 num[i + 1] = tmp;}}}

         */
         System.out.println("The arranged form of array is : ");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
