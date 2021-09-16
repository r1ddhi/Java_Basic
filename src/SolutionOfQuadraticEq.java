import java.util.Scanner;
public class SolutionOfQuadraticEq {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the value of a, b , c: ");
        float a= sc.nextFloat(); float b= sc.nextFloat();float c = sc.nextFloat();
        if (a !=0)
        {
            Double ROOT1 =((-b + Math.sqrt(b*b - 4*a*c))/2*a);
            Double ROOT2 =-((-b - Math.sqrt(b*b - 4*a*c))/2*a);
            System.out.println("THE ROOTS ARE : " + ROOT1 + " "+ ROOT2);
        }
    }
}
