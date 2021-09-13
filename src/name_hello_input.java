import java.util.Scanner;

public class name_hello_input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first name : ");
        String fname = input.next();
        System.out.println("enter the last name : ");
        String lname = input.next();
        System.out.println();
        System.out.println("hello"+" "+fname+" "+lname);

    }
}
