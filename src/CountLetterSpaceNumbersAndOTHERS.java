import java.util.Scanner;
public class CountLetterSpaceNumbersAndOTHERS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ENTER THE LINE OR THE DATA TO BE CHECKED : ");
        String test = sc.nextLine();
        char[] le = test.toCharArray();//initialising
        int letters = 0;
        int num = 0;
        int space = 0;
        int other = 0;
        for (int i = 0; i < le.length; i++) {
            //direct functions
            if (Character.isLetter(le[i]))
            {
                letters++;//increments
            }
             else if (Character.isDigit(le[i]))
             {
                num++;
             }
             else if (Character.isSpaceChar(le[i]))
             {
                space++;
             }
             else
             {
                other++;
             }
        }
        System.out.println("letter = " + letters + "\n" + "number = " + num + "\n" + "space = " + space + "\n" + "other = " + other);
    }
}
