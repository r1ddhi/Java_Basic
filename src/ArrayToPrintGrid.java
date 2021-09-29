import java.util.Scanner;//to take user input

public class ArrayToPrintGrid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns : ");//the length horizontally
        int r = sc.nextInt();
        int c = sc.nextInt();
        String[][] pa;//2-D array
        pa = new String[c][r];//initialising
        System.out.println("Enter the character : ");//the character which makes the pattern
        String ne = sc.next();
        System.out.println("~~~~~~~~~~~~~ The pattern grid is ~~~~~~~~~~~~~");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(" " + ne + " ");//to make the pattern
            }
            System.out.println();
        }
    }
}
