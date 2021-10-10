import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Arraylist {
    public static void  main(String[] args)
    {
        String[] name ;
        System.out.println("Enter the length of the array : ");
        Scanner sc= new Scanner(System.in);
        int l = sc.nextInt();
        name =new String[l];
        System.out.println("Enter the names in the array : ");
        for (int i = 0; i < l ;i++)
        {
            name[i]=sc.next();
        }
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(name));

        System.out.println(list);
    }

}
