import java.util.*;
public class vector
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Vector<String> v = new Vector<>();
        //Capacity of the vector
        System.out.println("The capacity of the vector is : " + v.capacity());
        //Size of the vector
        System.out.println("The size of the vector is : " + v.size());
        // Using the add() method
        v.add("Dhiren");
        // Using index number
        v.add(1, "Pooja");
        v.add(2, "Riddhi");
        v.add(3, "Jinnal");
        v.add(4, "Manjula");
        System.out.println("Vector: " + v);
        //Checks if the element is there in the vector
        System.out.println("Enter the element whose index if to be found: ");
        String na=sc.next();
        if (v.contains(na))
        {
            System.out.println("The element " + na + " is present ");
        }
        else {
            System.out.println("Element absent");
        }
        // Using addAll()
        Vector<String> animals = new Vector<>();
        animals.add("duck");
        animals.add("dog");
        animals.add("pig");
        v.addAll(animals);
        System.out.println("animals: " + animals);
        System.out.println("Enter the index to show element : ");
        int i = sc.nextInt();
        String element = animals.get(i);
        System.out.println("Element at index  " + i + " is : " + element);
        // Using iterator()
        Iterator<String> iterate = v.iterator();
        System.out.print("Vector: ");
        while (iterate.hasNext())
        {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
        // Using remove()
        System.out.println("\nEnter the index of the element to be removed: ");
        int r = sc.nextInt();
        String ele = v.remove(r);
        System.out.println("Removed Element: " + ele);
        System.out.println("New Vector: " + v);
        //Showcases first element of the vector
        System.out.println("The first element of the vector is : " + v.firstElement());
        //Showcases the last element of the vector
        System.out.println("The last element of the vector is : " +v.lastElement());
        // Using clear()
        v.clear();
        System.out.println("Vector after clear(): " + v);

    }
}
