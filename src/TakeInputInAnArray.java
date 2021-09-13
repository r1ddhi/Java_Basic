import java.util.Scanner;

public class TakeInputInAnArray {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE NUMBERS : ");
        int [] numbers ;
        numbers= new int[5];
        for (int i = 0; i<numbers.length; i++)
        {
            numbers[i]= input.nextInt();
        }
        for (int i =0; i<numbers.length;i++)
        {
            System.out.println("THE VALUE OF number ["+i+"]is " + numbers[i] );

        }
    }
}
