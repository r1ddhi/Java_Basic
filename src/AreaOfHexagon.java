import java.util.Scanner;

import static java.lang.Math.tan;

public class AreaOfHexagon {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the side of the hexagon :");
        double side = input.nextDouble();
        System.out.println((6 * side * side)/(4 * tan(Math.PI/6)));
    }
}
