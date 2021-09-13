import java.util.Scanner;

import static java.lang.Math.tan;

public class AreaOfPolygon {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF SIDES:");
        int sides= input.nextInt();
        System.out.println("ENTER THE LENGTH OF SIDES :");
        int length = input.nextInt();
        System.out.println((sides*length*length)/(4* tan(Math.PI/sides)));
    }
}
