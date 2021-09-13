import java.util.Scanner;

public class CBSEpercentage {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.println("enter the marks scored in each of the five subjects  : ");
        float sub1= sc.nextFloat();float sub2 = sc.nextFloat(); float sub3 = sc.nextFloat();float sub4 = sc.nextFloat();float sub5 = sc.nextFloat();
        float percentage = (sub1+sub2+sub3+sub4+sub5)/500;
        System.out.println("THE PERCENTAGE IS = "+ percentage);
    }
}
