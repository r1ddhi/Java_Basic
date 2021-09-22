import java.util.Scanner;

public class MakingRightAngleTrianglePatternWithNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the triangle : ");
        int r= sc.nextInt();//inverted triangle pattern
        for (int i =r ;i>=0 ; i--)
        {
            for (int j =i ; j>0 ; j--)
            {
               System.out.print(j);
            }
            System.out.println( );//to show the gaps ie next line after the loop
        }
    }
}
