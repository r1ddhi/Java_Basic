import java.util.Scanner;

class AreaOfShapes {
    static double area(double side) {
        return side * side;
    }

    static double area(float r) {
        return Math.PI * r * r;

    }

    static double area(double length, double breadth) {
        return length * breadth;
    }
}

class EXPT5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //the input is case sensitive that is if u put the name of shapes in uppercase, it wont run
        System.out.println("Enter the shape(circle,rectangle,square) to find the area: ");
        String shape = sc.next();
        switch (shape)//will check the shape entered and will find the area of that shape only
        {
            case "circle": {
                System.out.println("Enter the radius of the circle : ");
                float r = sc.nextFloat();
                System.out.println("The area of the circle is : " + AreaOfShapes.area(r));//called method
                break;
            }
            case "rectangle": {
                System.out.println("Enter the length and breadth of the rectangle : ");
                double length = sc.nextDouble();
                double breadth = sc.nextDouble();
                System.out.println("The area of the reactangle is : " + AreaOfShapes.area(length, breadth));//called method
                break;
            }
            case " square ": {
                System.out.println("Enter the side of the square : ");
                double side = sc.nextDouble();
                System.out.println("The area of the square is : " + AreaOfShapes.area(side));//called method
                break;
            }
        }
    }
}
