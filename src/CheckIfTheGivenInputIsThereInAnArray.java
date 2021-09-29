import java.util.Scanner;
public class CheckIfTheGivenInputIsThereInAnArray {
    public static boolean contains(int[] arr, int item) {
        for (int n : arr) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the array length : " );
        int l = sc.nextInt();
        int[] nu ;
        nu = new int[l];
        System.out.println("Enter " + l +" number of input :");
        for (int i = 0 ; i < nu.length;i++){
            nu[i]=sc.nextInt();
        }
        System.out.println("Enter the input to be checked : ");
        int nenu = sc.nextInt();
        System.out.println(contains(nu, nenu));
    }
}
