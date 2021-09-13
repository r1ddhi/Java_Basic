import java.util.Scanner;
//THE PREOGRAM CHECKS IF THE NUMBER THAT IS TAKEN IN IS DIVISIBLE BY THE NUMBER MENTIONED
public class CkeckIfANumberIsDivisibleByNum {
    public static void main ( String[] args)
    {
        Scanner input =new Scanner(System.in);
        System.out.println("ENTER THE NUMBER TO BE CHECKED :");
        int nu = input.nextInt();
        if (nu % 11 == 0) //YOU CAN CHANGE THE NUMBER AS PER YOUR NEED
        {
            System.out.println("the number is divisible");
        }
        else
            System.out.println("NOT DIVISIBLE ");
    }
}
