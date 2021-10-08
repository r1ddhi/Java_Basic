import java.io.*;
class Matrix {
    Matrix(int r) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader re = new BufferedReader(isr);
        int matrix[][] ;
        matrix=new int[r][r];
        String name;
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                name = re.readLine();
                matrix[i][j] = Integer.parseInt(name);
            }
        }
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j <r; j++){
                System.out.print(matrix[i][j]);
                System.out.print(" ");}
            System.out.print("\n");
        }

        System.out.println("Elements recorded successfully");
        if(check_symmetric(matrix, r)){
            System.out.println("Matrix is symmetric");
        }
        else
            System.out.println("Matrix is assymmetric");
    }
    boolean check_symmetric(int array[][],int r) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                if ((array[i][j] != array[j][i]) && (j>i))
                    return false;
            }
        }
        return true;
    }
}
public class Expt7 {
    public static void main(String[] args) throws IOException, NumberFormatException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter the square matrix :");
        int r;
        String name = br.readLine();
        r = Integer.parseInt(name);
        Matrix max = new Matrix(r);
    }
}
