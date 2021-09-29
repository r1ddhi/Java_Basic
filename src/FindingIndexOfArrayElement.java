import java.util.Scanner;
public class FindingIndexOfArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of integers to be entered : ");
        int l= sc.nextInt();
        int[]num ;
        num=new int[l];
        System.out.println("Enter the numbers : ");
        for (int i = 0;i<num.length;i++){
            num[i]=sc.nextInt();
        }
        System.out.print("Enter the number to be checked: ");
        int nenu = sc.nextInt();
        for (int i = 0 ; i < num.length; i ++)
        {
            if (num[i]==nenu){
                System.out.println("The index of " + nenu + " is "+ i);
            }
            else
            {
                i = i++;
            }
        }


        }}
