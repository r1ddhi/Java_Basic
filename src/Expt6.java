import java.util.Scanner;
import org.Calculator.*;
public class Expt6 {
    public static void main(String[] args) {
        int a, b, num = 0;
        System.out.println("1~add\n2~subtract\n3~multiply\n4~divide\n5~square\n6~cube\n7~exit");
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter the operation number :");
            num = sc.nextInt();
            switch (num) {
                case 1: {
                    System.out.println("Enter the two numbers to be added : ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("The sum of the two numbers is : " + Arithmatic.add(a, b));
                    break;
                }
                case 2: {
                    System.out.println("Enter the two numbers to be subtracted : ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("The subtraction of the two numbers is : " + Arithmatic.subtract(a, b));
                    break;
                }
                case 3: {
                    System.out.println("Enter the two numbers to be multiplied : ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("The multiplication of the two numbers is: " + Arithmatic.multiply(a, b));
                    break;
                }
                case 4: {
                    System.out.println("Enter the two numbers to be divided : ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("The division of the two numbers is : " + Arithmatic.division(a, b));
                    break;
                }
                case 5: {
                    System.out.println("Enter the number whose square is to be calculated : ");
                    a = sc.nextInt();
                    System.out.println("The square of the number is : " + Calcpower.square(a));
                    break;
                }
                case 6: {
                    System.out.println("Enter the number whose cube is to be found : ");
                    a = sc.nextInt();
                    System.out.println("The cube of the number is : " + Calcpower.cube(a));
                    break;
                }
                case 7: {
                    System.out.println("Exit");
                    break;
                }
                default: {
                    System.out.println(" !!! Please check the operation number entered !!!");
                }
            }
        } while (num != 7);
    }
}

