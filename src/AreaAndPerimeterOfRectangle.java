import java.util.Scanner;

public class AreaAndPerimeterOfRectangle {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE WIDTH AND HEIGHT : ");
        double width = input.nextDouble();
        double height = input.nextDouble();
        System.out.println("THE AREA OF THE RECTANGLE IS " + (width * height));
        System.out.println("THE PERIMETER OF THE RECTANGLE IS "+ (2*(width+height)));
    }
}
