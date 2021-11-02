//RIDDHI KUMBHANI
//SE4
//25
//EXPT11
import java.util.Scanner;
abstract class Shape {
    abstract void area();
}

class Triangle extends Shape {
    void area() {
        System.out.println("Enter the base and height of the circle: ");
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        System.out.println("The area of the circle is " + (base * height) / 2 + "\n");
    }
}

class Rectangle extends Shape {
    void area() {
        System.out.println("Enter the length and breadth of the rectangle : ");
        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        System.out.println("The area of the rectangle is " + length * breadth + "\n");
    }
}

class Circle extends Shape {
    void area() {
        System.out.println("Enter the radius of the circle: ");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        System.out.println("The area of the circle is " + Math.PI * radius * radius + "\n");
    }
}

public class expt11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1~Area of circle\n2~Area of rectangle\n3~Area of triangle\n4~Exit ");
            System.out.println("Enter your choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Shape s = new Circle();
                    s.area();
                    break;
                case 2:
                    Shape r = new Rectangle();
                    r.area();
                    break;
                case 3:
                    Shape t = new Triangle();
                    t.area();
                    break;
                case 4:
                    break;
                default:
                    System.out.println(" !! Check the choice entered !!");
            }
        } while (choice != 4);
    }
}