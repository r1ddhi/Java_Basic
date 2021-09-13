import java.util.Scanner;

public class FirstRecursion
{
    static void p(){
        System.out.println("hello");
        p();
    }

    public static void main(String[] args) {
        p();
    }
}