import java.util.Scanner;

public class ConvertorFromKMtoMILES {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE KILOMETERS TO BE CONVERTED : ");
        int km = sc.nextInt();
        System.out.println( km + " = " + ( km/0.621 ));


    }
}
