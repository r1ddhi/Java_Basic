import java.util.Scanner;

public class ArrayOf5FloatsAndTheirSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the array  : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        float[][] Floats;float sum =0;
        Floats = new float[r][c];
        System.out.println("enter the elements of the array : ");
        for (int i = 0; i < Floats.length; i++)
        {
            for (int j = 0; j < Floats[i].length; j++)
            {
                Floats[i][j] = sc.nextFloat();
                System.out.print(Floats[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        for (int i = 0 ; i <Floats.length; i++){
            for (int j = 0 ; j<Floats[i].length ; j++)
            {
                sum = sum+ Floats[i][j];
            }
        }
        System.out.println(sum);
    }
}
