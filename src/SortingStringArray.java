import java.util.Arrays;//to access direct functions of array sort
import java.util.Scanner;//to use scanner

public class SortingStringArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of names to be taken : ");//that is the length of array
        int l = sc.nextInt();//stores the length
        String[] name;
        name = new String[l];//initialises the array
        System.out.println("Enter " + l + " number of names :");//takes the input of array
        for (int i = 0; i < name.length; i++) {
            name[i] = sc.next();//allocates the input in array
        }
        Arrays.sort(name);//arranges in alphabetical order of the first alphabet
        for (int i =0 ; i<name.length;i++)//stores and prints on the screen
        {
            System.out.println(name[i]);
        }

    }
}
