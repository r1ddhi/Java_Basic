import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE RADIUS OF THE CIRCLE : ");
        double radius = input.nextDouble();
        System.out.println("THE AREA OF THE CIRCLE IS  " + ( Math.PI * radius * radius));
        System.out.println("THE PERIMETER OF THE CIRCLE IS " + ( 2* Math.PI * radius ));

    }
    }
