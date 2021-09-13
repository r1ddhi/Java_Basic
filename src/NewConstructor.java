import java.util.Scanner;

public class NewConstructor {
    class MenuItem{
        String itemname;String description;int price;
        MenuItem()
        {
            Scanner sc= new Scanner(System.in);
            System.out.println("enter the name , descriptions , price" );
            itemname = sc.next(); description= sc.next();
        }
    }
}