import java.util.Scanner;

public class TakeInputAndPrintAvg {
    public static void main(String[] args)
    {
        Scanner INPUT = new Scanner(System.in);
        System.out.println("ENTER  THE THREE  NUMBERS : ");
        double a = INPUT.nextDouble();
        double b = INPUT.nextDouble();
        double c = INPUT.nextDouble();
        System.out.println("THE AVERAGE IS "+ (a+b+c)/3);

    }
}
