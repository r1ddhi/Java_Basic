import java.util.ArrayList;

public class ArraylistToArray {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add(0, "riddhi");

        list.add(1, "Jinnal");

        list.add(2, "Pooja");

        list.add(3, "Dhiren");
        String[] name = new String[list.size()];

        list.toArray(name);

        for (String string : name) {
            System.out.println(string);
        }
    }
}
