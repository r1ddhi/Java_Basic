import java.util.Scanner;

public class CheckAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//only for lowercase ie its case sensitive
        System.out.println("enter the alphabet(should be in lowercase) : ");
        String ne = sc.next();
        if (ne.length() == 1) //if it is an alphabet only then only it will run
        {
            System.out.println("the alphabet " + ne + " satisfies the required details ");
            if (ne == "a" || ne == "e" || ne == "i" || ne == "o" || ne == "u") {
                System.out.println(ne + " is a vowel");
            } else {
                System.out.println(ne + " is a consonant ");
            }
        } else if (ne.length() < 1) {
            System.out.println("Please enter the alphabet correctly");
        }
    }
}
